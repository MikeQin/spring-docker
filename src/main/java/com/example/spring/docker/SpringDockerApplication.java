package com.example.spring.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
public class SpringDockerApplication {

  @GetMapping("/")
  public Mono<String> home() {
    return Mono.just("Hello Docker World");
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringDockerApplication.class, args);
  }

}
