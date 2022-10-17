/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Interface.CinemaInterface;
import org.springframework.stereotype.Repository;
import com.example.demo.Modelo.Cinema;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author USUARIO
 */

@Repository

public class CinemaRepository {
     @Autowired
    private ToolInterface extencionesCrud;
    
    public List<Cinema> getAll(){
        return (List<Cinema>) extencionesCrud.findAll();
    }
    
    public Optional<Cinema> getCinema(int id){
        return extencionesCrud.findById(id);
    }
    
    public Tool save(Cinema cinema){
        return extencionesCrud.save(cinema);
    }
}
