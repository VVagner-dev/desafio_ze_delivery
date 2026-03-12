package com.wagner.desafioze.models;

import org.locationtech.jts.geom.MultiPolygon;
import org.locationtech.jts.geom.Point;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "parceiro")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Parceiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_estabelecimento")
    private String nomeEstabelecimento;
    @Column(name = "nome_dono")
    private String nomeDono;

    @Column(unique = true)
    private String documento;

    // Area
    private MultiPolygon area;

    private Point endereco;
}
