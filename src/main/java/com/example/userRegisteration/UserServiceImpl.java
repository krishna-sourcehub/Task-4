package com.example.userRegisteration;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    
    @Override
    public String saveorUpdate(User user) throws EntityNotFoundException {
        if (user.getId() == null || user.getId().isEmpty()) {
            // Save operation
            User savedUser = userRepository.save(user);
            return savedUser.getId();
        } else {
            // Update operation
            // Fetch the existing user by ID
            Optional<User> existingUserOptional = userRepository.findById(user.getId());

            if (existingUserOptional.isPresent()) {
                User existingUser = existingUserOptional.get();

                // Update specific fields
                existingUser.setPassword(user.getPassword());
                existingUser.setWallet(user.getWallet());
                

                User savedUser = userRepository.save(existingUser);
                return savedUser.getId();
            } else {
                // Handle the case when the user with the given ID is not found
                throw new EntityNotFoundException("User not found with ID: " + user.getId());
            }
        }
    }


    
    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    
    

    @Override
    public boolean isUserPresent(String username) {
        return userRepository.findByUsername(username).isPresent();
    }
    @Override
    public String login(String username, String password) {
        Optional<User> userOptional = userRepository.findByUsernameAndPassword(username, password);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return user.getId();
        } else {
            throw new UnauthorizedException("Invalid username or password");
        }
    }

       
    public void deleteUser(String id) {

        userRepository.deleteById(id);
    }

	@Override
	public String saveUserAndGetId(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUserPresentById(String userId) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	 public List<User> listAll() {

	        return this.userRepository.findAll();
	    }

	 
	@Override
	public boolean isValidLogin(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String loginuser(UserLoginRequest loginRequest) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
