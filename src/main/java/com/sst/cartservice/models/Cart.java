package com.sst.cartservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cart {
    private Long id;
    private Long UserId;
    private String date;
    private Product[] product;
}
