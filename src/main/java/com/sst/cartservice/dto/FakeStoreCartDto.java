package com.sst.cartservice.dto;

import com.sst.cartservice.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreCartDto {
    private Long id;
    private Long UserId;
    private String date;
    private Product[] product;
}
