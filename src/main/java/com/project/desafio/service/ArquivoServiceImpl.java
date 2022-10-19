package com.project.desafio.service;

import com.project.desafio.service.interfaces.ArquivoService;
import org.springframework.stereotype.Service;

@Service
public class ArquivoServiceImpl implements ArquivoService {

    @Override
    public String obterAgentes() {
        return "Retornando Agentes";
    }
}
