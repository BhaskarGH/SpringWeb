package com.bh.SpringWeb.service;

import org.springframework.web.multipart.MultipartFile;

public interface DocService {
    public String upload(MultipartFile multipartFile);
}
