package com.example.SanchezIntegrador.controllers;

import com.example.SanchezIntegrador.entities.Sala;
import com.example.SanchezIntegrador.services.SalaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class SalaController extends BaseControllerImpl<Sala, SalaServiceImpl>{
}
