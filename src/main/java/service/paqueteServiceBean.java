/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import dao.paqueteDao;
import entity.Paquete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MSI
 */
@Service
public class paqueteServiceBean implements paqueteService{
    @Autowired
    private paqueteDao paqueteDao;
    
    public void save(Paquete insert) {
        paqueteDao.save(insert);
    }
    
}
