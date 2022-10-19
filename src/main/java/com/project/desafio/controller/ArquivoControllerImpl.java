package com.project.desafio.controller;

import com.project.desafio.controller.interfaces.ArquivoController;
import com.project.desafio.service.interfaces.ArquivoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ArquivoControllerImpl implements ArquivoController {

    private final ArquivoService arquivoXMLService;

    @Override
    public ResponseEntity<String> obterAgentes() {
        return new ResponseEntity<>(arquivoXMLService.obterAgentes(), HttpStatus.OK);
    }
}
