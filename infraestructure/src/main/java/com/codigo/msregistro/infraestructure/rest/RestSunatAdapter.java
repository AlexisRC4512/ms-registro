package com.codigo.msregistro.infraestructure.rest;

import com.codigo.msregistro.domain.aggregates.response.ResponseReniec;
import com.codigo.msregistro.domain.aggregates.response.ResponseSunat;
import com.codigo.msregistro.domain.ports.out.RestSunatOut;
import com.codigo.msregistro.infraestructure.rest.client.ClienteReniec;
import com.codigo.msregistro.infraestructure.rest.client.ClienteSunat;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestSunatAdapter implements RestSunatOut {
    private final ClienteSunat sunat;

    @Value("${token.api}")
    private String tokenApi;

    @Override
    public ResponseSunat getInfoSunat(String numDoc) {
        String authorization = "Bearer " + tokenApi;
        ResponseSunat responseSunat=sunat.getInfo(numDoc,authorization);
        return responseSunat;
    }
}
