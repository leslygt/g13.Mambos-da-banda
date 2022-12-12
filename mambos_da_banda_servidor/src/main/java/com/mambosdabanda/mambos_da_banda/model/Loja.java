package com.mambosdabanda.mambos_da_banda.model;

import javax.persistence.*;

@Entity
@Table(name = "loja")
public class Loja {

    @Id
    @Column(name = "loja_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "loja_nome")
    private String nome;

    @Column(name = "loja_endereco")
    private String endereco;

    @Column(name = "loja_cpostal")
    private String codigoPostal;

    @Column(name = "loja_telefone")
    private String telefone;

    @Column(name = "gest_id_loja")
    private int idGestLoja;

    @Column(name = "img_url")
    private String imgUrl;

    public Loja(int id, String nome, String endereco, String codigoPostal, String telefone, int idLoja, String imgUrl) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.codigoPostal = codigoPostal;
        this.telefone = telefone;
        this.idGestLoja = idLoja;
        this.imgUrl = imgUrl;
    }


    public Loja() {
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

    public void setIdGestLoja(int idLoja) {
        this.idGestLoja = idLoja;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}