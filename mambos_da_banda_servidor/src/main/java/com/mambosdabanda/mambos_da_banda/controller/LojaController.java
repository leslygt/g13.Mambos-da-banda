package com.mambosdabanda.mambos_da_banda.controller;

import com.mambosdabanda.mambos_da_banda.dto.ErrorResponse;
import com.mambosdabanda.mambos_da_banda.dto.SuccessResponse;
import com.mambosdabanda.mambos_da_banda.dto.request.LojaRequest;
import com.mambosdabanda.mambos_da_banda.dto.response.LojaResponse;
import com.mambosdabanda.mambos_da_banda.model.Loja;
import com.mambosdabanda.mambos_da_banda.repository.LojaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/loja")
public class LojaController {

    private final LojaRepository lojaRepository;

    public LojaController(LojaRepository lojaRepository) {
        this.lojaRepository = lojaRepository;
    }

    @PostMapping
    public ResponseEntity<?> addloja (@RequestBody LojaRequest lojaRequest) {
        var nome = lojaRequest.getNome();
        var endereco = lojaRequest.getEndereco();
        var codigoPostal = lojaRequest.getCodigoPostal();
        var telefone = lojaRequest.getTelefone();
        var idGestLoja = lojaRequest.getIdGestLoja();
        var imgUrl = lojaRequest.getImgUrl();

        try {

            var findGestLojaExist = this.lojaRepository.findByIdGestLoja(idGestLoja);

            if (findGestLojaExist.isPresent()) {

                var responseError = new ErrorResponse(
                        HttpStatus.BAD_REQUEST.value(),
                        "Gestor de loja já possui uma loja"
                );
                return new ResponseEntity<>(responseError, HttpStatus.NOT_FOUND);
            }

            var loja = new Loja();
            loja.setNome(nome);
            loja.setEndereco(endereco);
            loja.setCodigoPostal(codigoPostal);
            loja.setTelefone(telefone);
            loja.setIdGestLoja(idGestLoja);
            loja.setImgUrl(imgUrl);

            this.lojaRepository.save(loja);

        }catch (Exception ex) {
            var responseError = new ErrorResponse(
                    HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    ex.getMessage()
            );
            return new ResponseEntity<>(responseError, HttpStatus.NOT_FOUND);
        }



        var successResponse = new SuccessResponse(200, "Loja criada com sucesso.");
        return new ResponseEntity<>(successResponse, HttpStatus.OK);

    }

    @GetMapping
    private ResponseEntity<?> getAllLojas() {
        var lojas = this.lojaRepository.findAll();
        var lojasResponse = new ArrayList<LojaResponse>();
        for (Loja loja : lojas) {
            var lojaResponse = new LojaResponse();
            lojaResponse.setId(loja.getId());
            lojaResponse.setNome(loja.getNome());
            lojaResponse.setEndereco(loja.getEndereco());
            lojaResponse.setCodigoPostal(loja.getCodigoPostal());
            lojaResponse.setTelefone(loja.getTelefone());
            lojaResponse.setIdGestLoja(loja.getIdGestLoja());
            lojaResponse.setImgUrl(loja.getImgUrl());
            lojasResponse.add(lojaResponse);
        }
        return new ResponseEntity<>(lojasResponse, HttpStatus.OK);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<?> getLoja(@PathVariable int id) {
        var loja = this.lojaRepository.findById(id);
        if (!loja.isPresent()) {
            var responseError = new ErrorResponse(
                    HttpStatus.NOT_FOUND.value(),
                    "Loja não encontrada"
            );
            return new ResponseEntity<>(responseError, HttpStatus.NOT_FOUND);
        }

        var lojaResponse = new LojaResponse();
        lojaResponse.setId(loja.get().getId());
        lojaResponse.setNome(loja.get().getNome());
        lojaResponse.setEndereco(loja.get().getEndereco());
        lojaResponse.setCodigoPostal(loja.get().getCodigoPostal());
        lojaResponse.setTelefone(loja.get().getTelefone());
        lojaResponse.setIdGestLoja(loja.get().getIdGestLoja());
        lojaResponse.setImgUrl(loja.get().getImgUrl());

        return new ResponseEntity<>(lojaResponse, HttpStatus.OK);

    }


}
