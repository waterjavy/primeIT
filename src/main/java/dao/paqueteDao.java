/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entity.Paquete;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author MSI
 */
public interface paqueteDao extends CrudRepository<Paquete, Long>{
    
}
