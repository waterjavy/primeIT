/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Cliente;
import entity.Paquete;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author MSI
 */
public interface clienteDao extends JpaRepository<Cliente, Long>{
    @Query(value="select * from Paquete where id=?1",nativeQuery=true)
    List<Paquete>getPosicion(int id);
}
