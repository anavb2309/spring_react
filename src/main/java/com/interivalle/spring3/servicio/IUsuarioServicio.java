/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.interivalle.spring3.servicio;

import com.interivalle.spring3.modelo.Usuario;

/**
 *
 * Cotizador Interivalle
 */
public interface IUsuarioServicio {
    
    public Usuario buscarUsuarioPorEmail(String email);
    public Usuario guardarUsuario(Usuario usuario);
    
}
