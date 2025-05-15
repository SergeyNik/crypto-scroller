package com.github.sergeynik.cryptoscroller.contorller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ApiController {

    @GetMapping("/reactive-data")
    public Mono<String> getData() {
        return Mono.just("Hello World");
    }
}