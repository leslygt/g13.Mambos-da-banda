package com.mambosdabanda.mambos_da_banda.dto.response;

public class LojaResponse {
    private int id;
    private String nome;
    private String endereco;
    private String codigoPostal;
    private String telefone;
    private int idGestLoja;

    private String imgUrl;

    public LojaResponse() {
    }

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
