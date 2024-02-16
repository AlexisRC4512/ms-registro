package com.codigo.msregistro.domain.impl;

import com.codigo.msregistro.domain.aggregates.dto.EmpresaDTO;
import com.codigo.msregistro.domain.aggregates.request.RequestEmpresa;
import com.codigo.msregistro.domain.ports.in.EmpresaServiceIn;
import com.codigo.msregistro.domain.ports.out.EmpresaServiceOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmpresaServiceImpl implements EmpresaServiceIn {
    private final EmpresaServiceOut empresaServiceOut;
    @Override
    public EmpresaDTO crearEmpresaIn(RequestEmpresa requestEmpresa) {
        return empresaServiceOut.crearEmpresaOut(requestEmpresa);
    }

    @Override
    public Optional<EmpresaDTO> obtenerEmpresaIn(Long id) {
        return Optional.of(empresaServiceOut.obtenerEmpresaOut(id).get());
    }

    @Override
    public List<EmpresaDTO> obtenerTodosIn() {
        return empresaServiceOut.obtenerTodosOut();
    }

    @Override
    public EmpresaDTO actualizarIn(Long id, RequestEmpresa requestEmpresa) {
        return empresaServiceOut.actualizarOut(id,requestEmpresa);
    }

    @Override
    public EmpresaDTO deleteIn(Long id) {
        return empresaServiceOut.deleteOut(id);
    }
}
