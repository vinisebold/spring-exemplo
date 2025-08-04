package com.sebold.spring_exemplo.service;

import com.sebold.spring_exemplo.model.Produto;
import com.sebold.spring_exemplo.repository.ProdutoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepo repo;

    // Create
    public void inserirProduto(Produto p) {
        repo.save(p);
    }

    // Read
    public List<Produto> listarProdutos() {
        return repo.findAll();
    }

    // Update
    public void atualizarProduto(Produto p){
        repo.save(p);
    }


    // Delete
    public void deletarProduto(int id){
        repo.deleteById(id);
    }

}
