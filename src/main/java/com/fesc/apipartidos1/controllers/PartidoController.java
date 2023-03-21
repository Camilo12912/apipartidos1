package com.fesc.apipartidos1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fesc.apipartidos1.models.peticiones.PartidoCrearRequesModel;
import com.fesc.apipartidos1.models.respuestas.PartidoDataRestModel;
import com.fesc.apipartidos1.services.IPartidoService;
import com.fesc.apipartidos1.shared.PartidoDto;

@RestController
@RequestMapping("/partido")
public class PartidoController {
    
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IPartidoService iPartidoService;



    @PostMapping
    public PartidoDataRestModel crearPartido(@RequestBody PartidoCrearRequesModel partidoCrearRequesModel){

        String username="rortegani";

        PartidoDto partidoCrearDto= modelMapper.map(partidoCrearRequesModel, PartidoDto.class);
        partidoCrearDto.setUsername(username);

        PartidoDto partidoDto= iPartidoService.crearPartido(partidoCrearDto);

        PartidoDataRestModel partidoDataRestModel = modelMapper.map(partidoDto, PartidoDataRestModel.class);

        return partidoDataRestModel;
    }

    
}
