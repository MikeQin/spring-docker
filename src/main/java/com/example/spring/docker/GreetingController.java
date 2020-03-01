package com.example.spring.docker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GreetingController {
  @GetMapping("/")
  public Mono<String> home() {
    return Mono.just("Hello, Docker!");
  }

  @GetMapping("/spring")
  public ResponseEntity<Mono<String>> hello() throws Exception {
    // Blocking call
    Thread.sleep(5000);
    return ResponseEntity.ok(Mono.just("Hello, Spring!"));
  }
}
