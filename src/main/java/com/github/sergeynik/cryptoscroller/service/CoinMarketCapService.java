package com.github.sergeynik.cryptoscroller.service;

public interface CoinMarketCapService {

    String info();

    String price(String symbol);
}
