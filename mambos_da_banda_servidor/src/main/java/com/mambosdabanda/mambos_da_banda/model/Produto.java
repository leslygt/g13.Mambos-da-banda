package com.mambosdabanda.mambos_da_banda.model;

import javax.persistence.*;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @Column(name = "prod_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "prod_nome")
    private String nome;

    @Column(name = "prod_preco")
    private double preco;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "quantidade")
    private double quantidade;

    public Produto(int id, String nome, double preco, String descricao, double quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public Produto() {
    }

    //#region Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    //#endregion Getters and setters

}
