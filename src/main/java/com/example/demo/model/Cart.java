package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.tomcat.jni.Library;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cartId;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dishId;

    
    // private int userId;
    // private int hotelId;
    

    private Date date;
    private int quantity;
    private BigDecimal estimatedPrice;

    // @OneToOne
    // private User user;

    // @OneToOne
    // private Hotel hotel;

    // @OneToMany(targetEntity=Dish.class)  
    // private Dish dish;

    public int getCartId() {
        return cartId;
    }

    // public int getUserId() {
    //     return userId;
    // }

    // public int getHotelId() {
    //     return hotelId;
    // }

    public int getDishId() {
        return dishId;
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

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setEstimatedPrice(BigDecimal estimatedPrice) {
        this.estimatedPrice = estimatedPrice;
    }

}
