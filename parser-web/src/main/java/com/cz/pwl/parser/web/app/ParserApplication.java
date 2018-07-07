package com.cz.pwl.parser.web.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.cz.pwl.parser"})
public class ParserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParserApplication.class,args);
    }
}
