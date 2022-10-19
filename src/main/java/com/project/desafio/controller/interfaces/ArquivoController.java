package com.project.desafio.controller.interfaces;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.project.desafio.common.config.swagger.SwaggerConfig.ARQUIVO_TAG;

@Api(tags = {ARQUIVO_TAG})
@CrossOrigin(origins = "*")
@RequestMapping("/arquivo-xml")
public interface ArquivoController {

    @GetMapping("/agentes")
    @ApiOperation(value = "Retorna os agentes do arquivo XML", notes = "Deve ser informado código do agente")
    ResponseEntity<String> obterAgentes();

}
