package com.sinaukoding.tokosinau.entity.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PembayaranDTO {
    private Long id;

    private String tglBayar;

    private Double totalBayar;

    private TransaksiDTO transaksi;

}
