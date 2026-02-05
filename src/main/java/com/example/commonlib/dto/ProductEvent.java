package com.example.commonlib.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductEvent {
    private EventType eventType;
    private Long productId;
    private Boolean isFeatured;
    private String name;
    private Long categoryId;
    private String categoryName;
    private Long brandId;
    private String brandName;
    private String image;
    private BigDecimal minPrice;
    private BigDecimal maxPrice;
}