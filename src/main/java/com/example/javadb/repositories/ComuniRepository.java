package com.example.javadb.repositories;

import com.example.javadb.entities.ComuniEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComuniRepository extends CrudRepository<ComuniEntity, Integer> {
}
