package com.cozy.crows.configuration.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by jerry on 2017/10/18.
 */
@Data
@ConfigurationProperties(prefix = "facebook")
public class FacebookProperties {

    private String graphUrl;
    private String appId;
    private String appSecret;
    private String longLiveToken;
    private String fansPageId;
    private String fansPageToken;
    private String webhookToken;
}
