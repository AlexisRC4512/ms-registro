package com.codigo.msregistro.infraestructure.repository;

import com.codigo.msregistro.infraestructure.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {

}
