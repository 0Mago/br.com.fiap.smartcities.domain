package br.com.fiap.smartcities.domain;


import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity

@Table(name = "tbl_estabelecimento")

public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estabelecimento")
    @SequenceGenerator(name="estabelecimento",allocationSize = 5)


    private Long id;

    private String nome;

    private LocalDate dataCriacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

}