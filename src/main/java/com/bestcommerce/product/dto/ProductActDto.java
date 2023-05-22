package com.bestcommerce.product.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProductActDto {

    private Long customerId;

    private Long brandId;

    private Long productId;

    private String searchValue;

    public ProductActDto(Long customerId, Long brandId, Long productId, String searchValue) {
        this.customerId = customerId;
        this.brandId = brandId;
        this.productId = productId;
        this.searchValue = searchValue;
    }
}
