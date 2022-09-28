package com.sinaukoding.tokosinau.entity.mapping;

import com.sinaukoding.tokosinau.entity.Supplier;
import com.sinaukoding.tokosinau.entity.dto.SupplierDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SupplierMapping {
    SupplierMapping instance = Mappers.getMapper(SupplierMapping.class);

    Supplier toEntity(SupplierDTO dto);

    SupplierDTO toDto(Supplier param);

    List<SupplierDTO> toListDto(List<Supplier> productList);
}
