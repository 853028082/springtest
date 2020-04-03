package com.myspring.testone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @Value("${string.version}")
    private String version;

    @RequestMapping("/system/copyright")
    public String getCopyRight() {
        return "2020锐软科技";
    }

    @RequestMapping("/system/version")
    public String getVersion() {
        return version;
    }


}
