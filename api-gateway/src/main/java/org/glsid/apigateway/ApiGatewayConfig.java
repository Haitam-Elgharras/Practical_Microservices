package org.glsid.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// this is standard configuration for the gateway we use it only when we have a fixed public API that we want to consume
@Configuration
public class ApiGatewayConfig {
    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
        return builder.routes()

                .route(p -> p.path("/products/**")
                        .uri("lb://INVENTORY-SERVICE"))

                .route(p -> p.path("/customers/**")
                        .uri("lb://CUSTOMER-SERVICE"))
                .build();
    }

}
