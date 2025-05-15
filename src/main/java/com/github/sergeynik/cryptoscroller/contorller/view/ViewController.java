package com.github.sergeynik.cryptoscroller.contorller.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

@Controller
public class ViewController {

    @GetMapping("/")
    public Mono<String> showReactivePage(Model model) {
        // Simulate reactive data loading
        return Mono.just("Hello from Reactive Spring Boot!")
                .map(message -> {
                    model.addAttribute("message", message);
                    return "hello"; // Template name
                });
    }
}