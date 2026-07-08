package com.controleestoque.backend.service;

import com.controleestoque.backend.entity.Produto;
import com.controleestoque.backend.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto salvar(Produto produto) {

        if (produto.getCodigo() == null || produto.getCodigo().isBlank()) {
            throw new RuntimeException("O código do produto é obrigatório.");
        }

        if (produtoRepository.existsByCodigo(produto.getCodigo())) {
            throw new RuntimeException("Já existe um produto cadastrado com este código.");
        }

        if (produto.getNome() == null || produto.getNome().isBlank()) {
            throw new RuntimeException("O nome do produto é obrigatório.");
        }

        if (produto.getEstoque() != null && produto.getEstoque() < 0) {
            throw new RuntimeException("O estoque não pode ser negativo.");
        }

        if (produto.getCusto() != null && produto.getCusto().compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("O custo não pode ser negativo.");
        }

        if (produto.getPrecoVenda() != null && produto.getPrecoVenda().compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("O preço de venda não pode ser negativo.");
        }

        if (
            produto.getCusto() != null &&
            produto.getPrecoVenda() != null &&
            produto.getPrecoVenda().compareTo(produto.getCusto()) < 0
        ) {
            throw new RuntimeException("O preço de venda não pode ser menor que o custo.");
        }

        return produtoRepository.save(produto);
    }

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }
}