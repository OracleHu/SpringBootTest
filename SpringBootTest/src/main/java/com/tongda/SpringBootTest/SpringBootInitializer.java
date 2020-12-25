package com.tongda.SpringBootTest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

import com.tongda.SpringBootTest.DatabaseConfig.BeanTest;
import com.tongda.SpringBootTest.Metadata.RedisAccess;

@SpringBootApplication
public class SpringBootInitializer {
    @Bean
    @Lazy(false)
    @Autowired
    RedisAccess getRedisAccess(BeanTest beantest) {
    	return new RedisAccess(beantest);
    }
   // private static final Logger logger = (Logger) LoggerFactory.getLogger(SpringBootInitializer.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//    System.setProperty("spring.main.log-startup-info", "false");
	  	 //System.out.println(System.getProperty("spring.banner.image.location"));
	//	System.out.println(SpringApplication.BANNER_LOCATION_PROPERTY);
	//	SpringApplication.
		
		
		// SpringApplication.run(Application.class, args);

			
		
		SpringApplication.run(SpringBootInitializer.class, args);
         
	
	}

}
