package com.example.javadb.utils;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CsvUtils {

    private final static CsvMapper mapper = new CsvMapper();


    /**
     * function to read SCV
     * @param clazz {@link Class}
     * @param file {@link File}
     * @param <T> {@link T}
     * @return List of object
     * @throws IOException must catch it
     */
    public static <T> List<T> read(Class<T> clazz, File file) throws IOException {
        CsvSchema schema = mapper.schemaFor(clazz).withHeader().withColumnSeparator(';');
        return mapper.readerFor(clazz).with(schema).<T>readValues(file).readAll();
    }


}