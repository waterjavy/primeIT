/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import entity.Paquete;
import java.util.List;

/**
 *
 * @author MSI
 */
public interface clienteService {
    public List<Paquete> getPaquetes(int id);
}
