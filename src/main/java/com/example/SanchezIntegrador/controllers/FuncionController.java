package com.example.SanchezIntegrador.controllers;

import com.example.SanchezIntegrador.entities.Funcion;
import com.example.SanchezIntegrador.services.FuncionServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/funciones")
public class FuncionController extends BaseControllerImpl<Funcion, FuncionServiceImpl>{
  public FuncionController(FuncionServiceImpl service) {
    super(service);
  }
}
