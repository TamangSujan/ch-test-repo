package com.ch.service_a.controller;

import com.ch.service_a.service.ServiceBService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/web")
public class ServiceBController {
    private final ServiceBService serviceBService;
//    @GetMapping("/services")
//    public ResponseEntity<?> getServices(){
//        return ResponseEntity.status(HttpStatus.OK).body(serviceBService.getAllServices());
//    }

    @GetMapping("/totalServices")
    public ResponseEntity<?> getTotalServices(){
        return ResponseEntity.status(HttpStatus.OK).body(serviceBService.getTotalServices());
    }
}
