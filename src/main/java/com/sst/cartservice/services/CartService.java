package com.sst.cartservice.services;

import com.sst.cartservice.dto.FakeStoreCartDto;
import com.sst.cartservice.models.Cart;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CartService {
    RestTemplate restTemplate=new RestTemplate();
    String url="https://fakestoreapi.com";

    public List<Cart> getAllCart(){
        List response=restTemplate.getForObject(url+"/carts", List.class);
        return response;
    }

    public Cart getSingleCart(Long id){
        FakeStoreCartDto res= restTemplate.getForObject(url + "/carts/" + id, FakeStoreCartDto.class);
            Cart c=new Cart();
            c.setId(res.getId());
            c.setUserId(res.getUserId());
            c.setDate(res.getDate());
            c.setProduct(res.getProduct());
            return c;
    }

    public String getUser(Long UserId){
        String re= restTemplate.getForObject(url + "/carts/user/" + UserId, String.class);
        return re;
    }

}
