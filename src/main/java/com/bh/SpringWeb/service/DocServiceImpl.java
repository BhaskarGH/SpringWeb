package com.bh.SpringWeb.service;

import io.netty.handler.codec.http2.Http2Connection;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@Service
public class DocServiceImpl implements DocService{
    public String upload(MultipartFile multipartFile) throws IOException {
        OutputStream outputStream = new  ByteArrayOutputStream(1);
        outputStream.write(multipartFile.getBytes());
        return "test";
    }
}
