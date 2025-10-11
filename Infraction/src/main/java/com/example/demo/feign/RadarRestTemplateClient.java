package com.example.demo.feign;

import com.example.demo.model.Radar;
import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RadarRestTemplateClient {
    @Autowired
    KeycloakRestTemplate keycloakTemplate;

    public Radar GetById(UUID radarid){
        ResponseEntity<Radar> responseEntity = keycloakTemplate.exchange(
                "http://localhost:8083/api/v1/radar/{radarid}",
                HttpMethod.GET,
                null,Radar.class,radarid
        );
        return responseEntity.getBody();
    }
}
