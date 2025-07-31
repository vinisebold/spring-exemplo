package com.sebold.spring_exemplo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name =  "produto")
public class Produto {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "nm_produto")
    private String nomeProduto;

    @Column(name = "preco")
    private double preco;

    public Produto() {
    }

    public Produto(int id, String nomeProduto, double preco) {
        setId(id);
        setNomeProduto(nomeProduto);
        setPreco(preco);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
