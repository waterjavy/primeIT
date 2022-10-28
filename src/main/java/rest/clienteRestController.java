/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rest;

import entity.Paquete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.clienteService;
import service.paqueteServiceBean;

/**
 *
 * @author MSI
 */
@RestController
@RequestMapping (value="paquete")
public class clienteRestController {
    @Autowired
    private clienteService clienteService;

	@GetMapping(value="getPaquete")
	public void getPaquetes(int id) {
            clienteService.getPaquetes(id);
	}
}
