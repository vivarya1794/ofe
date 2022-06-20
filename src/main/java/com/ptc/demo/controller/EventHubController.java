package com.ptc.demo.controller;


import com.ptc.commons.producer.HubProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

//@RefreshScope
@RestController
@Slf4j
public class EventHubController {


    @Autowired
    private HubProducer hubProducer;

    @PostMapping("/messages")
    public String publishMessage(@RequestBody Object payload) throws IOException {

        hubProducer.publishMessage(payload);
        log.info("In get messages controller");
        return "Success";
    }

    @GetMapping("/error")
    public String errorHandler(@RequestParam boolean flag) {
        if (flag) {
            throw new IllegalArgumentException();
        } else {
            return "success";
        }
    }

}
