package com.fesc.apipartidos1.services;

import com.fesc.apipartidos1.shared.UsuarioDto;

public interface IUsuarioService {

    public UsuarioDto crearUsuario(UsuarioDto usuarioCrearDto);
    public UsuarioDto leerUsuario(String username);
    

}
