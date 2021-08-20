package com.spring.docker.resource;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(path = "/details",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getDetails(){

        return "Welcome to Spring & Docker";
    }

}
