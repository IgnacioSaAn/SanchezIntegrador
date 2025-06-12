package com.example.SanchezIntegrador.controllers;

import com.example.SanchezIntegrador.entities.Entrada;
import com.example.SanchezIntegrador.services.EntradaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/entradas")
public class EntradaController extends BaseControllerImpl<Entrada, EntradaServiceImpl>{
  public EntradaController(EntradaServiceImpl service) {
    super(service);
  }
  }
