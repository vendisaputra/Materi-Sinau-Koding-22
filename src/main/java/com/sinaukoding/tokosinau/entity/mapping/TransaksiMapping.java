package com.sinaukoding.tokosinau.entity.mapping;

import com.sinaukoding.tokosinau.entity.Supplier;
import com.sinaukoding.tokosinau.entity.Transaksi;
import com.sinaukoding.tokosinau.entity.dto.SupplierDTO;
import com.sinaukoding.tokosinau.entity.dto.TransaksiDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TransaksiMapping {
    TransaksiMapping instance = Mappers.getMapper(TransaksiMapping.class);

    Transaksi toEntity(TransaksiDTO dto);

    TransaksiDTO toDto(Transaksi param);

    List<TransaksiDTO> toListDto(List<Transaksi> productList);
}
