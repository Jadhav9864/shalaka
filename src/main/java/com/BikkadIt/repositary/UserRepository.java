package com.BikkadIt.repositary;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Bikkad.model.UserEntity;
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer>{
		
	  public UserEntity	findByEmail(String email);
	  
	  //public List<UserEntity>	findByEmail(String email);
		
//		public UserEntity findByUserName(String userName);
	  
//		public List<UserEntity>	findByUserName(String userName);
		
		//public List<UserEntity> findByAge(int age);
		
		//public List<UserEntity> findByAgeGreaterThan(int age);
		
		//public List<UserEntity> findByAgeGreaterThanEqual(int age);
		
//		public List<UserEntity>	findByAgeLessThan(int age);
		
		//public List<UserEntity> findByAgeLessThanEqual(int age);
		
		//public List<UserEntity> findByEmailAndUserName(String email,String userName);
		   
	}


