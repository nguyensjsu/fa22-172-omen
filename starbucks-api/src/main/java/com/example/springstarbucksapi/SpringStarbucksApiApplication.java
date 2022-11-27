package com.example.springstarbucksapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringStarbucksApiApplication {

    public static void main(String[] args) {

        // Logger logger = LoggerFactory.getLogger(SpringStarbucksApiApplication.class);
        // logger.info("Host Check " +  System.getenv("MYSQL_HOST"));
        SpringApplication.run(SpringStarbucksApiApplication.class, args);
    }

}
