package com.sebold.spring_exemplo.controller;

import com.sebold.spring_exemplo.model.Produto;
import com.sebold.spring_exemplo.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    ProdutoService servico;


    // Create
    @PostMapping("/produtos")
    public void inserirProduto(@RequestBody Produto p) {
        servico.inserirProduto(p);
    }
    

    // Read
    @GetMapping("/produtos")
    public List<Produto> listarProdutos() {
        return servico.listarProdutos();
    }

    // Update
    @PutMapping("/produtos")
    public void atualizarProdutos(@RequestBody Produto p) {
        servico.atualizarProduto(p);
    }



    // Delete
    @DeleteMapping("/produtos/{id}")
    public void deletarProduto(@PathVariable int id) {
        servico.deletarProduto(id);
    }
}
