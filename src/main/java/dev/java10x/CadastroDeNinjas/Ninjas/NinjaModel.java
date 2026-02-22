package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//Entity transforma uma classe em uma entidade no banco de dados
//JPA= Java Persistance API
@Entity
@Table (name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @Column(unique = true)
    private String email;
    private int idade;

    //@ManyToOne - um ninja tem uma única missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreign Key = Chave Estrangeira
    private MissoesModel missoes;

}
