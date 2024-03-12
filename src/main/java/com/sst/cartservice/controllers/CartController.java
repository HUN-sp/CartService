package com.sst.cartservice.controllers;

import com.sst.cartservice.dto.FakeStoreCartDto;
import com.sst.cartservice.models.Cart;
import com.sst.cartservice.models.Product;
import com.sst.cartservice.services.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CartController {
    CartService cs;
    CartController(CartService cs){
        this.cs=cs;
    }
    @GetMapping("/carts")
    public List<Cart> getAllCart(){
        return cs.getAllCart();
    }

    @GetMapping("/carts/{id}")
    public Cart getSingleCart(@PathVariable("id") Long id){

        return cs.getSingleCart(id);
    }

    @GetMapping("/carts/user/{UserId}")
    public String getUser(@PathVariable Long UserId){
        return cs.getUser(UserId);
    }

    @PostMapping("/carts")
    public void addCart(){

    }

    @PutMapping("/update")
    public void updateCart(){

    }

    @DeleteMapping("/carts/{id}")
    public void deletebyId(@PathVariable("id") Long id){

    }

    @GetMapping("/date")
    public void range(){

    }
}
