package com.bh.SpringWeb.controllers;

import org.apache.commons.text.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class TestController {

   @Autowired
   WebClient.Builder webClient;
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
        return StringEscapeUtils.escapeHtml4(id);
    }


}
