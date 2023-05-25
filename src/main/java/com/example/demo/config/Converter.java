package com.example.demo.config;


import com.example.demo.pojo.DTO;
import com.example.demo.pojo.Source;
import com.example.demo.pojo.Target;
import com.example.demo.pojo.VO;
import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class Converter {
    public static Converter INSTANT = Mappers.getMapper(Converter.class);

//    @Mapping(source = "age",target = "age",resultType = Integer.class)
//    @Mapping(source = "userNick",target = "nick")
//    public abstract Target convert(Source source);



//    @Mapping(source = "vo",target = "extra",qualifiedByName = "convertToExtra")
//    public abstract DTO convert(VO vo);
//
//    @Named("convertToExtra")
//    public String convertToExtra(VO vo){
//        return String.format("%s,%s",vo.getAge(),vo.getUserNick());
//    }


//
//    @Mapping(target = "age", source = "extra", qualifiedByName = "extractAge")
//    @Mapping(target = "userNick", source = "extra", qualifiedByName = "extractUserNick")
//    public abstract VO convertToVO(DTO dto);
//
//    @Named("extractAge")
//    public Long extractAge(String extra) {
//        // 从extra中提取第一个值
//        return Long.valueOf(extra.split(",")[0]);
//    }
//
//    @Named("extractUserNick")
//    public String extractUserNick(String extra) {
//        // 从extra中提取第二个值
//        return extra.split(",")[1];
//    }

    @Mapping(target = "config.age", source = "age")
    @Mapping(target = "config.userNick", source = "userNick")
    public abstract DTO convertToDTO(VO source);

    @Mapping(target = "age", source = "config.age")
    @Mapping(target = "userNick", source = "config.userNick")
    public abstract VO convertToVO(DTO dto);

}