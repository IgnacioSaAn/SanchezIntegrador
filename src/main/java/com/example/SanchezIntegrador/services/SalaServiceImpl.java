package com.example.SanchezIntegrador.services;

import com.example.SanchezIntegrador.entities.Sala;
import com.example.SanchezIntegrador.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class SalaServiceImpl extends BaseServiceImpl<Sala, Integer> implements SalaService{
  public SalaServiceImpl(BaseRepository<Sala, Integer> baseRepository) {
    super(baseRepository);
  }
}
