package com.example.mambosdabanda.model;

import java.io.Serializable;

public class Loja implements Serializable {
    private int id;
    private String nome;
    private String endereco;
    private String codigoPostal;
    private String telefone;
    private int idGestLoja;
    private String imgUrl;

    public Loja(int id, String nome, String endereco, String codigoPostal, String telefone, int idGestLoja, String imgUrl) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.codigoPostal = codigoPostal;
        this.telefone = telefone;
        this.idGestLoja = idGestLoja;
        this.imgUrl = imgUrl;
    }

    public Loja() {}

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdGestLoja() {
        return idGestLoja;
    }

    public void setIdGestLoja(int idGestLoja) {
        this.idGestLoja = idGestLoja;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
