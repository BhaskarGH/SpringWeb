package com.bh.SpringWeb.controllers;

import com.bh.SpringWeb.service.DocService;
import org.apache.commons.text.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class TestController {

   @Autowired
   WebClient.Builder webClient;
   @Autowired
    DocService docService;
    @GetMapping("/test")
    public String getData(){
        String data = webClient.build().get().uri("https://jsonplaceholder.typicode.com/posts").retrieve().bodyToMono(String.class).block();
        System.out.println(data);
        return data;
    }

    @PatchMapping("/test/{id}")
    public String getData(@PathVariable String id){
        String data = webClient.build().get().uri("https://jsonplaceholder.typicode.com/posts").retrieve().bodyToMono(String.class).block();
        System.out.println(data);
        return id;
    }
    @PostMapping (path = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> upload (@RequestPart("file") MultipartFile multipartFile){
        return new ResponseEntity<>(docService.upload (multipartFile),HttpStatus.OK);

    }


}
