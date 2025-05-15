package com.github.sergeynik.cryptoscroller.contorller.api;

import com.github.sergeynik.cryptoscroller.service.CoinMarketCapService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ApiController {

    private final CoinMarketCapService coinMarketCapService;

    public ApiController(CoinMarketCapService coinMarketCapService) {
        this.coinMarketCapService = coinMarketCapService;
    }

    @GetMapping("/reactive-data")
    public Mono<String> getData() {

        coinMarketCapService.info();
        return Mono.just("Hello World");
    }
}