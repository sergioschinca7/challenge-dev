/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.challenge.dev.personas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sergio
 */
@Service
public class ClienteServicioImpl implements ClienteServicio {
    
    @Autowired
    private ClienteRepositorio clienteRepositorio;
    
    @Override
    public List<Cliente> findAll() {
        
        ArrayList<Cliente> clientes = (ArrayList) clienteRepositorio.findAll();
        return clienteRepositorio.findAll();
        
    }
    
    @Override
    public Optional<Cliente> findById(int id) {
        return clienteRepositorio.findById(id);
    }
    
    @Override
    public void guardar(Cliente cliente) {
        clienteRepositorio.save(cliente);
    }
    
    @Override
    public void eliminarById(int id) {
        
        clienteRepositorio.deleteById(id);
    }
    
}
