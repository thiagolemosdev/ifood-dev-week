package tech.thiagolemos.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import tech.thiagolemos.sacola.enumeration.FormaPagamento;

import java.util.List;
import javax.persistence.*;

@Entity
public class Sacola {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JsonIgnore
  private Cliente cliente;
  @OneToMany(cascade = CascadeType.ALL)
  private List<Item> itens;
  private Double valorTotal;
  @Enumerated
  private FormaPagamento FormaPagamento;
  private boolean fechada;

}
