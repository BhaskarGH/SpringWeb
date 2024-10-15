package com.bh.SpringWeb.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface DocService {
    public String upload(MultipartFile multipartFile) throws IOException;
}
