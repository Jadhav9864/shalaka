package com.BikkadIt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Bikkad.model.UserEntity;
import com.BikkadIt.repositary.UserRepository;
@SpringBootApplication
public class Application {
public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(Application.class, args);
	UserRepository repo= context.getBean(UserRepository.class);
	UserEntity userEntity=new UserEntity();
	userEntity.setUserId(1);
	  userEntity.setUserName("shalaka");
	  userEntity.setEmail("shalaka05@gmail.com");
	  userEntity.setAge(24);
	  UserEntity userEntity1=new UserEntity();
	  userEntity1.setUserId(4); 
	  userEntity1.setUserName("priyali");
	  userEntity1.setEmail("plc07@gmail.com");
	  userEntity1.setAge(28);
	  List<UserEntity> list=new ArrayList<>(); 
	  list.add(userEntity);
	  list.add(userEntity1); 
	  repo.saveAll(list);
	   //UserRepository repo= context.getBean(UserRepository.class);
	    //UserEntity u=  repo.findByEmail("shalaka05@gmail.com");
	  //System.out.println(u);
	   
//	  List<UserEntity> list=  repo.findByEmail("shalaka05@gmail.com");
//	   for(UserEntity u:list) {
//		   System.out.println(u);
//	   }

//       UserEntity u1=repo.findByUserName("shalaka");
//	   System.out.println(u1);
	   
//	  List< UserEntity> list=repo.findByUserName("shalaka");
//	  for(UserEntity u:list) {
//	   System.out.println(u);
//	   
//	   }
	
//	   List< UserEntity> list=repo.findByAge(24);
//		  for(UserEntity u:list) {
//		   System.out.println(u);
//		  }
//	   
//	   List< UserEntity> list=repo.findByAgeGreaterThan(24);
//		  for(UserEntity u:list) {
//		   System.out.println(u);
//		  }
	    
	
//	   List< UserEntity> list=repo.findByAgeGreaterThanEqual(28);
//		  for(UserEntity u:list) {
//	   System.out.println(u);
//	  }
	   
//	   List< UserEntity> list=repo.findByAgeLessThanEqual();
//		  for(UserEntity u:list) {
//	   System.out.println(u);
//	  }
	 
	//List<UserEntity> list =  repo.findByEmailAndUserName("shalaka05@gmail.com", "shalaka");
	  // for(UserEntity u:list) {
		//   System.out.println(list);
	   }
}