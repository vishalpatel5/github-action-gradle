package com.github.action.gradle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class HealthController {

  @GetMapping("health")
  public String checkHEalth() {
    return "I am healthy";
  }
}
