package com.bestcommerce.cart.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class CartItemDto {
    private Long customerId;

    private String customerName;

    private Long productId;

    private String productName;

    private int productCost;

    private Long sellerId;

    private String thumbnailPath;

    private int deliveryCost;

    private Long sizeId;

    private Long measureId;

    private String measureName;

    private Long contentId;

    private String contentName;

    private int sizeValue;

    public CartItemDto(Long customerId, String customerName, Long productId, String productName, int productCost, Long sellerId, String thumbnailPath, int deliveryCost, Long sizeId, Long measureId, String measureName, Long contentId, String contentName, int sizeValue) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        this.sellerId = sellerId;
        this.thumbnailPath = thumbnailPath;
        this.deliveryCost = deliveryCost;
        this.sizeId = sizeId;
        this.measureId = measureId;
        this.measureName = measureName;
        this.contentId = contentId;
        this.contentName = contentName;
        this.sizeValue = sizeValue;
    }

}