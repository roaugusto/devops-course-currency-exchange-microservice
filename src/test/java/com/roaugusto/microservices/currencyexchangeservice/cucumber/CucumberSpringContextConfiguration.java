package com.roaugusto.microservices.currencyexchangeservice.cucumber;

import com.roaugusto.microservices.currencyexchangeservice.CurrencyExchangeServiceApplicationH2;

import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.Before;

@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = CurrencyExchangeServiceApplicationH2.class, loader = SpringBootContextLoader.class)
public class CucumberSpringContextConfiguration {

  @Before
  public void setUp() {
  }
}