package com.sinaukoding.tokosinau.entity.mapping;

import com.sinaukoding.tokosinau.entity.Pembeli;
import com.sinaukoding.tokosinau.entity.Supplier;
import com.sinaukoding.tokosinau.entity.dto.PembeliDTO;
import com.sinaukoding.tokosinau.entity.dto.SupplierDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PembeliMapping {
    PembeliMapping instance = Mappers.getMapper(PembeliMapping.class);

    Pembeli toEntity(PembeliDTO dto);

    PembeliDTO toDto(Pembeli param);

    List<PembeliDTO> toListDto(List<Pembeli> productList);
}
