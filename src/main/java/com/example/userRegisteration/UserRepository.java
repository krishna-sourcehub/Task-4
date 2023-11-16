package com.example.userRegisteration;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByUsername(String username);

	Optional<User> findByEmailAndPassword(String username, String password);
	void deleteByusername(String username);

	Optional<User> findByEmail(String email);

	Optional<User> findByUsernameAndPassword(String username, String password);
	


    
}
