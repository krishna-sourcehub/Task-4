package com.example.userRegisteration;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    private UserDetailsService userDetailsService;
    
    
    @GetMapping(value = "/getall")
    public List<UserDetails> getUsersdetails() {
        return userDetailsService.listAll();
    }
    
    
    
    @GetMapping(value = "userdata/getall")
    public List<User> getUsers() {
        return userService.listAll();
    }
    
    @PostMapping("/saveuser")
    public ResponseEntity<String> saveUser(@RequestBody User user) throws EntityNotFoundException {
        if (userService.isUserPresent(user.getUsername())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("User already exists"+user.getId());
        } else {
        	userService.saveorUpdate(user);
        	String userId = userService.saveUserAndGetId(user);
            return ResponseEntity.ok("User saved successfully!"+user.getId());
        }
    }
    
    
    @RequestMapping("/getProfileData/{id}")
    private User saveorUpdate(@PathVariable(name = "id") String id) {
        return userService.getUserById(id);
    }


    @PutMapping(value = "/edit/{id}")
    private User saveorUpdate(@RequestBody User user, @PathVariable(name = "id") String id) throws EntityNotFoundException {
        user.setId(id);
        userService.saveorUpdate(user);
        return user;
    }
    
    
    
    @DeleteMapping("/delete/{id}")
    private void deleteUser(@PathVariable("id") String id) {
        userService.deleteUser(id);
    }

     
    @PostMapping("/login")
    public ResponseEntity<String> loginuser(@RequestBody UserLoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();

        try {
            String userId = userService.login(username, password);
            return ResponseEntity.ok("Login successful! User ID: " + userId);
        } catch (UnauthorizedException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
        }
    }
    

    @PostMapping("/saveUserDetails")
    public ResponseEntity<String> saveUserDetails(@RequestBody UserDetails userDetails) {
        userDetailsService.saveUserDetails(userDetails);
        return ResponseEntity.ok("User details saved successfully");
    }
    

    
    @GetMapping("/getUserDetails/{username}")
    public ResponseEntity<List<UserDetails>> getUserDetails(@PathVariable String username) {
        List<UserDetails> userDetailsList = userDetailsService.getUserByUsername(username);

        if (!userDetailsList.isEmpty()) {
            return ResponseEntity.ok(userDetailsList);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    

    
    @GetMapping("/getUserTransaction/{id}")
    public ResponseEntity<Optional<UserDetails>> getUserTransaction(@PathVariable(name = "id")  String id) {
        Optional<UserDetails> userDetailsList = userDetailsService.getUserByTransactionid(id);

        if (!userDetailsList.isEmpty()) {
            return ResponseEntity.ok(userDetailsList);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

 
    
}
