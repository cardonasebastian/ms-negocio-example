package com.example.negocio.controller;

import com.example.negocio.model.DataInformationRequest;
import com.example.negocio.model.DataInformationResponse;
import com.example.negocio.service.ISuma;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
@Slf4j
public class ControllerSuma {

    /**
     * Instancia del servicio.
     */
    private final ISuma service;

    /**
     * Injeccion por constructor.
     * @param service
     */
    public ControllerSuma(ISuma service) {
        this.service = service;
    }

    @PostMapping("sumar")
    public ResponseEntity<DataInformationResponse> suma(@RequestBody DataInformationRequest request) {
        log.info("valor a {}",request.getA());
        log.info("valor b {}",request.getB());
        DataInformationResponse response = service.sumar(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
