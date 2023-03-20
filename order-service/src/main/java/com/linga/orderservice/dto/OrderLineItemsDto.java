package com.linga.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class OrderLineItemsDto {
    private Long id;
    private  String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
