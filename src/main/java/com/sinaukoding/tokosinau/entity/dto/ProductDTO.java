package com.sinaukoding.tokosinau.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private Long id;

    private String name;

    private Double price;

    private Integer stock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private SupplierDTO supplier;
}
