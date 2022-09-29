package com.sinaukoding.tokosinau.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pembayaran")
@Getter
@Setter
@NoArgsConstructor
public class Pembayaran {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date tglBayar;

    @Column
    private Double totalBayar;

    @ManyToOne
    @JoinColumn(name = "id_transaksi")
    private Transaksi transaksi;
}
