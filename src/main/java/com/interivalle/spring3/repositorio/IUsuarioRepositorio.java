/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.interivalle.spring3.repositorio;

import com.interivalle.spring3.modelo.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * Cotizador Interivalle
 * 
 */
public interface IUsuarioRepositorio extends JpaRepository<Usuario, String> {
    Optional<Usuario> findByEmail(String email);
}
