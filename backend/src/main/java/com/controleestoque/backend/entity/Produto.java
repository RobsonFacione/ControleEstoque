package com.controleestoque.backend.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;
    private String nome;
    private String categoria;
    private String marca;
    private String unidade;

    private BigDecimal custo;
    private BigDecimal precoVenda;

    private Integer estoque;
    private Integer estoqueMinimo;

    private String localizacao;
    private Boolean ativo = true;

    public Produto() {
    }

    public Long getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getMarca() {
        return marca;
    }

    public String getUnidade() {
        return unidade;
    }

    public BigDecimal getCusto() {
        return custo;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public Integer getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public void setCusto(BigDecimal custo) {
        this.custo = custo;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public void setEstoqueMinimo(Integer estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}