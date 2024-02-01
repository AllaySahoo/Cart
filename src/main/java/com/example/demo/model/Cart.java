package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cartId;
    @OneToMany(targetEntity=Dish.class)  
    private List dishes;
    private Date date;
    private int quantity;
    private BigDecimal estimatedPrice;

    public List getDishes() {  
        return dishes;  
    }  
    public void setDishes(List dishes) {  
        this.dishes = dishes;  
    }

    public int getCartId() {
        return cartId;
    }

    public Date getDate() {
        return date;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getEstimatedPrice() {
        return estimatedPrice;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
        
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setEstimatedPrice(BigDecimal estimatedPrice) {
        this.estimatedPrice = estimatedPrice;
    }

}
