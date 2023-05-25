package com.example.demo;

import com.example.demo.config.Converter;
import com.example.demo.pojo.DTO;
import com.example.demo.pojo.VO;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test1(){
        final VO vo = VO.builder()
                .id(1L)
                .age(10L)
                .gmtCreate(new Date())
                .userNick("nick")
                .build();

        final DTO dto = Converter.INSTANT.convertToDTO(vo);
        System.out.println(dto);

//        final VO newVo = Converter.INSTANT.convertToVO(dto);
//        System.out.println(newVo);
    }
}
//        final Source source =Source.builder()
//                .id(1L)
//                .age(19L)
//                .userNick("Nick")
//                .build();
//        final Target target = Converter.INSTANT.convert(source);
//        System.out.println(target);

//        final VO vo = VO.builder()
//                .id(1L)
//                .age(18L)
//                .userNick("Nick")
//                .build();
//
//// 转为DTO
////        final DTO dto = Converter.INSTANT.convertToDTO(vo);
////        System.out.println(dto);
//
//// 转回VO
//        final VO newVo = Converter.INSTANT.convertToVO(dto);
//        System.out.println(newVo);

//    }

