package com.example.javadb.services;

import com.example.javadb.entities.ComuniEntity;
import com.example.javadb.repositories.ComuniRepository;
import com.example.javadb.utils.CsvUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
@Slf4j
public class ComuniService {

    public final String FILE_CSV = "src/main/resources/comuni.csv";


    @Autowired
    private ComuniRepository comuniRepository;



    public List<ComuniEntity> populate () throws Exception {
        log.info("populate DB");
        return (List<ComuniEntity>) this.comuniRepository.saveAll(CsvUtils.read(ComuniEntity.class, new File(this.FILE_CSV)));
    }

}




