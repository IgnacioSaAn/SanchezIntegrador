package com.example.SanchezIntegrador.services;

import com.example.SanchezIntegrador.entities.Funcion;
import com.example.SanchezIntegrador.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class FuncionServiceImpl extends BaseServiceImpl<Funcion, Integer> implements FuncionService{

  public FuncionServiceImpl(BaseRepository<Funcion, Integer> baseRepository) {
    super(baseRepository);
  }
}
