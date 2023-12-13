package br.com.example.testespringboot2.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "produtos")
@Getter
@Setter

public class ProdutoModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nome;
    private String marca;

}
