package com.tongda.SpringBootTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/api")
public class AdminController {
   @GetMapping("Hello")
   public String Hello() {
	   return "Hello,admin";
   }
}
