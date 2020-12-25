package com.tongda.SpringBootTest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class MemoryAuth {
   @Bean
   public UserDetailsService userDetailService() {
	   InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
	   manager.createUser(User.withUsername("oraclehu").password(new BCryptPasswordEncoder().encode("123")).roles("USER").build());
	   manager.createUser(User.withUsername("admin").password(new BCryptPasswordEncoder().encode("123")).roles("USER","ADMIN").build());
	   return manager;
   }
   @Bean
   public PasswordEncoder passwordEncoder() {
       return new BCryptPasswordEncoder();
   }
}
