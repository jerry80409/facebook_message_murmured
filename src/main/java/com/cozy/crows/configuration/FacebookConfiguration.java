package com.cozy.crows.configuration;

import com.cozy.crows.configuration.properties.FacebookProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.inject.Inject;

/**
 * Created by jerry on 2017/10/18.
 */
@Configuration
@EnableConfigurationProperties(FacebookProperties.class)
public class FacebookConfiguration {

    @Inject
    private FacebookProperties facebookProperties;


}
