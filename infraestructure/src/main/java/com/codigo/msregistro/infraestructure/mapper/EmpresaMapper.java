package com.codigo.msregistro.infraestructure.mapper;

import com.codigo.msregistro.domain.aggregates.dto.EmpresaDTO;
import com.codigo.msregistro.infraestructure.entity.EmpresaEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class EmpresaMapper {
    private static final ModelMapper modelMapper = new ModelMapper();
    public EmpresaDTO mapToDto(EmpresaEntity entity){
        return modelMapper.map(entity, EmpresaDTO.class);
    }
    public EmpresaEntity mapToEntity(EmpresaDTO empresaDTO){
        return modelMapper.map(empresaDTO, EmpresaEntity.class);
    }
}
