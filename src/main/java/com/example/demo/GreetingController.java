package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GreetingController {
    @GetMapping(value = "/", produces = "application/json; charset=UTF-8")

    Mono<Greet> greet(){
        return Mono.just(new Greet("Hello World!"));
    }

}


