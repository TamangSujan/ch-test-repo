package com.ch.service_a.service;

import com.ch.service_a.model.AppService;
import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceBService {
    private RestTemplate restTemplate;

//    public List<AppService> getAllServices(){
//        List<AppService> services = restTemplate.getForObject("http://SERVICE_B/api/v1/web/services", null, new ParameterizedTypeReference<List<AppService>>(){});
//        return services;
//    }

    public Integer getTotalServices(){
        HttpHeaders header = new HttpHeaders();
        HttpEntity entity = new HttpEntity(header);
        return restTemplate.exchange("http://SERVICEB/api/v1/web/getTotalServices", HttpMethod.GET, entity, Integer.class).getBody();
    }

}
