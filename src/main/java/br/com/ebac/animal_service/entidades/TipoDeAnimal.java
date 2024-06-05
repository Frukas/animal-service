package br.com.ebac.animal_service.entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class TipoDeAnimal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column
    private List<String> tipo;

    public Integer getId() {
        return id;
    }

    public List<String> getTipo() {
        return tipo;
    }

    public void setTipo(List<String> tipo) {
        this.tipo = tipo;
    }
}
