package com.example.SanchezIntegrador.controllers;

import com.example.SanchezIntegrador.entities.Cine;
import com.example.SanchezIntegrador.services.CineServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/cines")
public class CineController extends BaseControllerImpl<Cine, CineServiceImpl>{
}
