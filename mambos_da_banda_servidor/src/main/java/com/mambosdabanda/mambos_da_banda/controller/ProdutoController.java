package com.mambosdabanda.mambos_da_banda.controller;

import com.mambosdabanda.mambos_da_banda.dto.ErrorResponse;
import com.mambosdabanda.mambos_da_banda.dto.SuccessResponse;
import com.mambosdabanda.mambos_da_banda.dto.request.ProdutoRequest;
import com.mambosdabanda.mambos_da_banda.dto.response.ProdutoResponse;
import com.mambosdabanda.mambos_da_banda.model.Produto;
import com.mambosdabanda.mambos_da_banda.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    private final ProductRepository repository;
    public ProdutoController (ProductRepository repository) { this.repository = repository; }

    @PostMapping
    public ResponseEntity<?> addProduct(@RequestBody ProdutoRequest body) {

        var nome = body.getNome();
        var preco = body.getPreco();
        var descricao = body.getDescricao();
        var quantidade = body.getQuantidade();

        var produto = new Produto();
        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setDescricao(descricao);
        produto.setQuantidade(quantidade);

        this.repository.save(produto);

        var successResponse = new SuccessResponse(200, "Produto adicionado com sucesso");
        return new ResponseEntity<>(successResponse, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllProducts() {
        var produtos = this.repository.findAll();
        var productsResponse = new ArrayList<ProdutoResponse>();

        for (var p : produtos) {
            var productResponse = new ProdutoResponse();
            productResponse.setId(p.getId());
            productResponse.setNome(p.getNome());
            productResponse.setPreco(p.getPreco());
            productResponse.setDescricao(p.getDescricao());
            productResponse.setQuantidade(p.getQuantidade());
            productsResponse.add(productResponse);
        }

        return new ResponseEntity<>(productsResponse, HttpStatus.OK);

    }

    @GetMapping(value = "{id}")
    public ResponseEntity<?> getProduct(@PathVariable int id) {
        var produto = this.repository.findById(id);

        if (!produto.isPresent()) {
            var responseError = new ErrorResponse(
                    HttpStatus.NOT_FOUND.value(),
                    "Produto não encontrado"
            );
            return new ResponseEntity<>(responseError, HttpStatus.NOT_FOUND);
        }

        var produtoResponse = new ProdutoResponse();
        produtoResponse.setId(produto.get().getId());
        produtoResponse.setNome(produto.get().getNome());
        produtoResponse.setPreco(produto.get().getPreco());
        produtoResponse.setDescricao(produto.get().getDescricao());
        produtoResponse.setQuantidade(produto.get().getQuantidade());

        return new ResponseEntity<>(produtoResponse, HttpStatus.OK);
    }

}
