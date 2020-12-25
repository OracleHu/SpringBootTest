package com.tongda.SpringBootTest.DatabaseConfig;

import org.springframework.stereotype.Component;

@Component
public class BeanTest {
  int id;
 String name;
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	System.out.println();
	return id;
}

public void setId(int id) {
	this.id = id;
}
  
}
