package com.example.demo.pojo;

import lombok.Data;

import java.util.Date;


@Data
public class DTO {
    private Long id;
    private Date gmtCreate;
    private Config config;

    @Data
    public static class Config{
        private String age;
        private String userNick;
    }
}