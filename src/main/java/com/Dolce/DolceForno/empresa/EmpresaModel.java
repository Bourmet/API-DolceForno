package com.Dolce.DolceForno.empresa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_estoque")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmpresaModel {
    @Id
    @Column(unique = true)
    private String sabor;
    private int quantidade;

}
