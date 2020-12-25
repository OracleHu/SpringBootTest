package com.tongda.SpringBootTest.DatabaseConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.tongda.SpringBootTest.Metadata.OwnProperties;
import com.tongda.SpringBootTest.mapper.UserMapper;
@Component
@Import(OwnProperties.class)
@Order(1)
public class RunnerBean implements CommandLineRunner {
      //this contract is well suited for tasks that should run after application startup but before it starts accepting traffic
	
	private OwnProperties own;
	private final UserMapper userMapper;
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
              System.out.println("Spring Boot begins");
              System.out.println(this.userMapper.findById(1));
           //   System.out.println(own.getFirstName());
	}
	@Autowired
	public RunnerBean(OwnProperties own,UserMapper userMapper) {
		super();
		this.own = own;
		this.userMapper = userMapper;
	}
   
}
