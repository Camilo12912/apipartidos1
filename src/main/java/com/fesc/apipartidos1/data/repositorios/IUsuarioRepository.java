package com.fesc.apipartidos1.data.repositorios;
// codigo sql

import org.springframework.data.repository.CrudRepository;

import com.fesc.apipartidos1.data.entidades.UsuarioEntity;

public interface IUsuarioRepository extends CrudRepository<UsuarioEntity, Long> {
    
   public UsuarioEntity findByEmail(String email);
   public UsuarioEntity findByUsername(String username);
   


}
