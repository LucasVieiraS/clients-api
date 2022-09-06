package br.com.lucas.vieiraApi.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="contato")
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id")
    private Cliente idcliente;

    private String descricao;
    private String contato;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato1 = (Contato) o;
        return Objects.equals(id, contato1.id) && Objects.equals(idcliente, contato1.idcliente) && Objects.equals(descricao, contato1.descricao) && Objects.equals(contato, contato1.contato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idcliente, descricao, contato);
    }
}
