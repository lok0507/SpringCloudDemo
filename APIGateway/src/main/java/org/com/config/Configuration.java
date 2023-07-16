package org.com.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes().route("aadhar-ms", r-> r.path("/aadhar/**").uri("lb://aadhar-ms")).build();
    }
}
