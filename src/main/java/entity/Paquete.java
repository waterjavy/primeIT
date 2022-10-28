/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author MSI
 */
@SpringBootApplication
@Entity
@Table(name="Paquete")
public class Paquete {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
    
    @Column(name="emisor")
    private String emisor;
    
    @Column(name="receptor")
    private String receptor;
    
    @Column(name="posicion")
    private String posicion;
   
    @Column(name="vehiciulo")
    private int vehiculo;
}
