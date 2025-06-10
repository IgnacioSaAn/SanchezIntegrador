package com.example.SanchezIntegrador.services;

import com.example.SanchezIntegrador.entities.Entrada;
import com.example.SanchezIntegrador.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class EntradaServiceImpl extends BaseServiceImpl<Entrada, Integer> implements EntradaService{
  public EntradaServiceImpl(BaseRepository<Entrada, Integer> baseRepository) {
    super(baseRepository);
  }
}
