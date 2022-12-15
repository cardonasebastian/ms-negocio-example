package com.example.negocio.service.impl;

import com.example.negocio.model.DataInformationRequest;
import com.example.negocio.model.DataInformationResponse;
import com.example.negocio.service.ISuma;
import org.springframework.stereotype.Service;

@Service
public class SumaServiceImpl implements ISuma {

    @Override
    public DataInformationResponse sumar(DataInformationRequest dataInformationRequest) {
        return new DataInformationResponse(dataInformationRequest.getA() + dataInformationRequest.getB());
    }
}

