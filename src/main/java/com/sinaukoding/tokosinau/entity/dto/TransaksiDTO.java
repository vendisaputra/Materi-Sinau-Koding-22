package com.sinaukoding.tokosinau.entity.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class TransaksiDTO {
    private Long id;

    private Date tanggal;

    private String keterangan;

    private ProductDTO product;

    private PembeliDTO pembeli;
}
