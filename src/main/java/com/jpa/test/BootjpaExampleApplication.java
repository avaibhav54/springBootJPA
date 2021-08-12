package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaExampleApplication {

	public static void main(String[] args) {
		
		ApplicationContext context=
		SpringApplication.run(BootjpaExampleApplication.class, args);
		UserRepository bean=context.getBean(UserRepository.class);
		
		//create user
//		User user=new User("vaibhav","Amroha","pending");
//		User user1=bean.save(user);
//		System.out.println(user1);
//
		
		
		
//	read user and update user
		
//	Optional<User>optional=	bean.findById(1);   //for all data findAll

		//	User u=optional.get();                   
//	//update user
//	u.setStatus("finished");
//	bean.save(u);
//	
//	System.out.println(u);
		
		
		//find all
//		Iterable<User>itr=bean.findAll();
//		itr.forEach(user->{
//			System.out.println(user);
//		});
		
	//deleting the user element
//		
//	bean.deleteById(2);
		
		//finding details by name
		List<User> lis=bean.findByName("vaibhav");	
	lis.forEach(e->{
		System.out.println(e);
	});
		
	}

}
