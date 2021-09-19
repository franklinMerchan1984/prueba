package com.hg.crud.repositories;

import org.springframework.data.mongodb.core.MongoAdminOperations;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hg.crud.models.ProductDTO;

//INTERFAZ DE TRANSFERENCIA DE DATOS

@Repository
public interface IProductDAD extends MongoRepository<ProductDTO, String> {

}
