package com.example.demo.application.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author HWliao
 */
@Slf4j
@Service
public class ConfigTestService {

    @Value("${demo.local:}")
    private String local;
    @Value("${demo.remote:}")
    private String remote;
    @Value("${demo.override:}")
    private String override;
    @Value("${demo.pp:}")
    private String remotepp;

    @PostConstruct
    public void init() {
        log.warn(this.local);
        log.warn(this.remote);
        // apollo覆盖掉了本地
        log.warn(this.override);
        log.warn(this.remotepp);
    }
}
