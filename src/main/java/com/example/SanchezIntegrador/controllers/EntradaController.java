package com.example.SanchezIntegrador.controllers;

import com.example.SanchezIntegrador.entities.Entrada;
import com.example.SanchezIntegrador.services.EntradaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/entradas")
public class EntradaController extends BaseControllerImpl<Entrada, EntradaServiceImpl>{
  public EntradaController(EntradaServiceImpl service) {
    super(service);
  }
}
