package com.tongda.SpringBootTest.DatabaseConfig;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import com.tongda.SpringBootTest.Metadata.OwnProperties;
@Component

@Import(OwnProperties.class)
public class ExitSystem implements DisposableBean {
    @Value("${BYE}")
    private String bye;
    @Value("${my.secret}")
    private int password;

   private  OwnProperties own;
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		   // System.out.println("cloud-platform:"+System.getProperty("spring.main.cloud-platform"));
		System.out.println(password);    
		System.out.println(bye);
		System.out.println(own.getFirstName());
        System.out.println("EXIT");
	}
	public OwnProperties getOwn() {
		return own;
	}
	@Autowired
	public void setOwn(OwnProperties own) {
		this.own = own;
	}
   

}
