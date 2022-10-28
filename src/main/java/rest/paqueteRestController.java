/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rest;

import entity.Paquete;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.paqueteServiceBean;

/**
 *
 * @author MSI
 */
@RestController
@RequestMapping (value="paquete")
public class paqueteRestController {
    @Autowired
    private paqueteServiceBean paqueteService;

	@PostMapping(value="insert")
	public void addPaquete(Paquete p) {
            paqueteService.save(p);
	}
}
