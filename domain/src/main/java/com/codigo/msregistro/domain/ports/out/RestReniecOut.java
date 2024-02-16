package com.codigo.msregistro.domain.ports.out;

import com.codigo.msregistro.domain.aggregates.response.ResponseReniec;

public interface RestReniecOut {
    ResponseReniec getInfoReniec(String numDoc);
}
