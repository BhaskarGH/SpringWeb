package com.bh.SpringWeb.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DocServiceImpl implements DocService{
    public String upload(MultipartFile multipartFile){
        return "test";
    }
}
