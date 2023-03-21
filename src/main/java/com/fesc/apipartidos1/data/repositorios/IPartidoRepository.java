package com.fesc.apipartidos1.data.repositorios;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.fesc.apipartidos1.data.entidades.PartidoEntity;

public interface IPartidoRepository extends PagingAndSortingRepository<PartidoEntity, Long>{
    
    

}
