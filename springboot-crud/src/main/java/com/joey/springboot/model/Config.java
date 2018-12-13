package com.joey.springboot.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 〈读取配置文件〉
 *
 * @author Joey
 * @create 2018-12-11
 * @since 1.0.0
 */
@Component
@ConfigurationProperties(prefix = "server")
public class Config {

    private String port;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}