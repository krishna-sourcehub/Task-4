package com.example.userRegisteration;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsService {
    @Autowired
    private UserDetailsRepository userDetailsRepository;

    public void saveUserDetails(UserDetails userDetails) {
        userDetailsRepository.save(userDetails);
    }
   
    
    public List<UserDetails> getUserByUsername(String username) {
        return userDetailsRepository.findByUsername(username);
    }
    public List<UserDetails> listAll() {

        return this.userDetailsRepository.findAll();
    }



	public Optional<UserDetails> getUserByTransactionid(String transactionid) {
		// TODO Auto-generated method stub
		return userDetailsRepository.findById(transactionid);
	}



}