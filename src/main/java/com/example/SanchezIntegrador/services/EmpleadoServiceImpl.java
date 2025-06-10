package com.example.SanchezIntegrador.services;

import com.example.SanchezIntegrador.entities.Empleado;
import com.example.SanchezIntegrador.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl extends BaseServiceImpl<Empleado, Integer> implements EmpleadoService{
  public EmpleadoServiceImpl(BaseRepository<Empleado, Integer> baseRepository) {
    super(baseRepository);
  }
}
