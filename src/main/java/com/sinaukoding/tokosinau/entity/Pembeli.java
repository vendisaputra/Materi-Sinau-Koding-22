package com.sinaukoding.tokosinau.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pembeli")
@Getter
@Setter
@NoArgsConstructor
public class Pembeli {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String namaPembeli;

    @Column
    private String jk;

    @Column
    private String noTelp;

    @Column
    private String alamat;

    @OneToMany(mappedBy = "pembeli")
    private List<Transaksi> transaksiList;
}
