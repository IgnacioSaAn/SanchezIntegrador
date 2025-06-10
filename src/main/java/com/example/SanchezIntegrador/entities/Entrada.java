package com.example.SanchezIntegrador.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;
@Entity
@Table(name = "entrada")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Entrada extends Base{

  @Column(name = "precio")
  private double precio;
  @Column(name = "asiento")
  private String asiento;
}
