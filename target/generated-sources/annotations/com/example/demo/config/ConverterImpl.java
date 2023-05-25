package com.example.demo.config;

import com.example.demo.pojo.DTO;
import com.example.demo.pojo.VO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-23T13:14:36+0800",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 1.8.0_74 (Oracle Corporation)"
)
public class ConverterImpl extends Converter {

    @Override
    public DTO convertToDTO(VO source) {
        if ( source == null ) {
            return null;
        }

        DTO dTO = new DTO();

        dTO.setConfig( vOToConfig( source ) );
        dTO.setId( source.getId() );
        dTO.setGmtCreate( source.getGmtCreate() );

        return dTO;
    }

    @Override
    public VO convertToVO(DTO dto) {
        if ( dto == null ) {
            return null;
        }

        VO.VOBuilder vO = VO.builder();

        String age = dtoConfigAge( dto );
        if ( age != null ) {
            vO.age( Long.parseLong( age ) );
        }
        vO.userNick( dtoConfigUserNick( dto ) );
        vO.id( dto.getId() );
        vO.gmtCreate( dto.getGmtCreate() );

        return vO.build();
    }

    protected DTO.Config vOToConfig(VO vO) {
        if ( vO == null ) {
            return null;
        }

        DTO.Config config = new DTO.Config();

        if ( vO.getAge() != null ) {
            config.setAge( String.valueOf( vO.getAge() ) );
        }
        config.setUserNick( vO.getUserNick() );

        return config;
    }

    private String dtoConfigAge(DTO dTO) {
        if ( dTO == null ) {
            return null;
        }
        DTO.Config config = dTO.getConfig();
        if ( config == null ) {
            return null;
        }
        String age = config.getAge();
        if ( age == null ) {
            return null;
        }
        return age;
    }

    private String dtoConfigUserNick(DTO dTO) {
        if ( dTO == null ) {
            return null;
        }
        DTO.Config config = dTO.getConfig();
        if ( config == null ) {
            return null;
        }
        String userNick = config.getUserNick();
        if ( userNick == null ) {
            return null;
        }
        return userNick;
    }
}
