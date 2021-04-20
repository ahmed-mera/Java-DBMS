package com.example.javadb.entities;


import com.example.javadb.utils.NumericBooleanDeserializer;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name="comuni")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"id", "name", "slug", "lat", "lng", "codice_provincia_istat", "codice_comune_istat", "codice_alfanumerico_istat", "capoluogo_provincia",  "capoluogo_regione"})
public class ComuniEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer ID;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false, length = 30)
    private String slug;

    @Column(nullable = false, precision = 10, scale = 2)
    private Double lat;

    @Column(nullable = false, precision = 10, scale = 2)
    private Double lng;

    @Column(nullable = false,length = 11)
    private Integer codice_provincia_istat;

    @Column(nullable = false,length = 11)
    private Integer codice_comune_istat;

    @Column(nullable = false, length = 11)
    private Integer codice_alfanumerico_istat;

    @Column(nullable = false)
    @JsonDeserialize(using = NumericBooleanDeserializer.class)
    private Boolean capoluogo_provincia;

    @Column(nullable = false)
    @JsonDeserialize(using = NumericBooleanDeserializer.class)
    private Boolean capoluogo_regione;


}
