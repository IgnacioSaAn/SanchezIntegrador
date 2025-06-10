package com.example.SanchezIntegrador.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "funcion")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited

public class Funcion extends Base{

  @Column(name = "horario")
  private String horario;

  @ManyToOne(optional = true)
  @JoinColumn(name = "fk_pelicula")
  private Pelicula pelicula;

  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinTable(
    name= "funcion_entrada",
    joinColumns = @JoinColumn(name="funcion_id"),
    inverseJoinColumns = @JoinColumn(name = "entrada_id")
  )
  private List<Entrada> entradas = new ArrayList<Entrada>();
}
