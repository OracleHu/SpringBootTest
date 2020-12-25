package com.tongda.SpringBootTest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHandler {
 @RequestMapping("/hello")
 String Hello() {
	 return "Hello world";
 }
}
