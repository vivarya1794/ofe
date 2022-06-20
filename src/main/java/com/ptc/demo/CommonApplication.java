package com.ptc.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication(scanBasePackages = {"com.ptc.commons", "com.ptc.demo"})
public class CommonApplication {

//    private static AppConfig appConfig = new AppConfig();

    static Logger log = LoggerFactory.getLogger(CommonApplication.class);

    public static void main(String[] args) {
//        appConfig.eventProcessorClient().start();
        SpringApplication.run(CommonApplication.class, args);
        log.info("This is a test info logs {}", new Date());
        log.warn("This is a test warning log {}", new Date());
        log.debug("This is a test debug log {}", new Date());
        log.error("This is a test error log {}", new Date());
        log.trace("This is a test trace log {}", new Date());

    }

//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        list.stream().filter(num -> num % 2 == 0).forEach(num -> System.out.print(num));
//
//
//    }


}
