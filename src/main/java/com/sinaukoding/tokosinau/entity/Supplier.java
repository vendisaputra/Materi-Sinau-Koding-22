package com.sinaukoding.tokosinau.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "suppliers")
@Getter
@Setter
@NoArgsConstructor
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "BIGINT(11)")
    private Long id;

    @Column(columnDefinition = "VARCHAR(50)")
    private String namaSupplier;

    @Column(columnDefinition = "VARCHAR(13)")
    private String telp;

    @Column(columnDefinition = "VARCHAR(100)")
    private String alamat;

    @OneToMany(mappedBy = "supplier")
    private List<Product> productList;



}
