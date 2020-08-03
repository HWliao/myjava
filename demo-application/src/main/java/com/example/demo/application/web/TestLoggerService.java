package com.example.demo.application.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author HWliao
 */
@Slf4j
@Service
public class TestLoggerService {

    @PostConstruct
    public void init() {
        log.trace("leo trace");
        log.debug("leo debug");
        log.info("leo info");
        log.warn("leo warn");
        log.error("leo error");
    }
}
