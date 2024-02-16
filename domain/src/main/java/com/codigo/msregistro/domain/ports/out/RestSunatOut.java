package com.codigo.msregistro.domain.ports.out;


import com.codigo.msregistro.domain.aggregates.response.ResponseSunat;

public interface RestSunatOut {
    ResponseSunat getInfoSunat(String numDoc);
}
