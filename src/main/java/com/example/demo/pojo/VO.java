package com.example.demo.pojo;

import lombok.Builder;
import lombok.Data;

import java.util.Date;


@Data
@Builder
public class VO {
    private Long id;
    private Date gmtCreate;
    private Long age;
    private String userNick;
}