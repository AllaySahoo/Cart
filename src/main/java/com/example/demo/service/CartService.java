package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cart;
import com.example.demo.repository.CartRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CartService {
    
    @Autowired
    private CartRepository cartRepository;



    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }
}

