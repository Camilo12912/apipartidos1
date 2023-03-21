package com.fesc.apipartidos1.data.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.fesc.apipartidos1.data.entidades.EquipoEntity;

public interface IEquipoRepository extends CrudRepository<EquipoEntity, Long>{
    
    EquipoEntity findById(long id);
}
