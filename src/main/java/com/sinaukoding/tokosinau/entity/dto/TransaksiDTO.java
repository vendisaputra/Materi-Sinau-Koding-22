package com.sinaukoding.tokosinau.entity.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class TransaksiDTO {
    private Long id;

    private String tanggal;

    private String keterangan;

    private ProductDTO product;

    private PembeliDTO pembeli;
}
