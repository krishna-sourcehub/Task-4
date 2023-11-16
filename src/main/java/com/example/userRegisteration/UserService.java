//package com.example.userRegisteration;
//
//public interface StudentService {
//
//    boolean isStudentPresent(String studentname);
//}
package com.example.userRegisteration;

import java.util.List;

public interface UserService {

	public String saveorUpdate(User users) throws EntityNotFoundException;
    boolean isUserPresent(String username);
    boolean isValidLogin(String username, String password);
    public void deleteUser(String username);
	public String saveUserAndGetId(User user);
	public boolean isUserPresentById(String userId);
	public List<User> listAll();
	String loginuser(UserLoginRequest loginRequest);
	String login(String username, String password);
	public User getUserById(String id);
}
