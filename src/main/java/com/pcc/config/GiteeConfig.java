package com.pcc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Gitee 配置属性类
 */
@Configuration
@ConfigurationProperties(prefix = "gitee")
public class GiteeConfig {

    private String token;
    private String baseUrl = "https://gitee.com/api/v5";
    private int commentsMaxCount = 50;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public int getCommentsMaxCount() {
        return commentsMaxCount;
    }

    public void setCommentsMaxCount(int commentsMaxCount) {
        this.commentsMaxCount = commentsMaxCount;
    }
}