package com.example.userRegisteration;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDetailsRepository extends MongoRepository<UserDetails, String> {

	List<UserDetails> findByUsername(String username);

	List<UserDetails> findByTransactionid(String transactionid);
	

}