package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

  @GetMapping("/")
  public String home() {
    return "hello";
  }

  @PostMapping("/")
  public String hello() {
    return "big";
  }
}
