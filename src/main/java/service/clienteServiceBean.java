/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.clienteDao;
import entity.Paquete;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author MSI
 */
public class clienteServiceBean implements clienteService{
    @Autowired
    private clienteDao clienteDao;

    public List<Paquete> getPaquetes(int id) {
        return (List<Paquete>)clienteDao.getPosicion(id);
    }
    
}
