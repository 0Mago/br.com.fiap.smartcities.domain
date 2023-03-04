package br.com.fiap.smartcities.domain;

import org.hibernate.annotations.CreationTimestamp;

    import java.time.LocalDate;
    import jakarta.persistence.Column;
    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;
    import jakarta.persistence.SequenceGenerator;
    import jakarta.persistence.Table;

@Entity

@Table(name = "tbl produtos")
public class Produto {

    @Id
    @SequenceGenerator(name="produto",sequenceName="sq_tbl_produto",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="produto")
    @Column(name = "id_produto")
    private Long id;

    @Column(name = "nome_produto", length = 50)
    private String nome;


    @Column(name = "tp_produto", length = 50)
    private String tipo;



    @Column(name = "qt_produto", length = 50)
    private int quantidade;

    @CreationTimestamp
    @Column(name = "dh_criacao")
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

}