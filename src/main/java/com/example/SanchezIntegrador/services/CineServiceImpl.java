package com.example.SanchezIntegrador.services;

import com.example.SanchezIntegrador.entities.Cine;
import com.example.SanchezIntegrador.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class CineServiceImpl extends BaseServiceImpl<Cine, Integer> implements CineService{
  public CineServiceImpl(BaseRepository<Cine, Integer> baseRepository) {
    super(baseRepository);
  }
}
