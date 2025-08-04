package com.sebold.spring_exemplo.repository;

import com.sebold.spring_exemplo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepo extends JpaRepository<Produto, Integer> {

}
