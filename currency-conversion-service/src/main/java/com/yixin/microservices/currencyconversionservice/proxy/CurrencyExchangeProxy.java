package com.yixin.microservices.currencyconversionservice.proxy;

import com.yixin.microservices.currencyconversionservice.bean.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange") public interface CurrencyExchangeProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}") CurrencyConversion retrieveExchangeValue(
        @PathVariable("from") String from, @PathVariable("to") String to);
}
