package com.example.SanchezIntegrador.controllers;

import com.example.SanchezIntegrador.entities.Base;
import com.example.SanchezIntegrador.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseControllerImpl<E extends Base, S extends BaseServiceImpl<E, Integer>> implements BaseController<E, Integer>{

  @Autowired
  protected S service;
}
