package com.example.SanchezIntegrador.services;

import com.example.SanchezIntegrador.entities.Pelicula;
import com.example.SanchezIntegrador.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class PeliculaServiceImpl extends BaseServiceImpl<Pelicula, Integer> implements PeliculaService{
  public PeliculaServiceImpl(BaseRepository<Pelicula, Integer> baseRepository) {
    super(baseRepository);
  }
}
