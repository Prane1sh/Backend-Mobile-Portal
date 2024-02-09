package com.example.demo3.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Booking {

    @Id
    @GeneratedValue
    public int id;
    public int mobilenumber;
    public String Operator;
    public int amount;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getMobilenumber() {
        return mobilenumber;
    }
    public void setMobilenumber(int mobilenumber) {
        this.mobilenumber = mobilenumber;
    }
    public String getOperator() {
        return Operator;
    }
    public void setOperator(String operator) {
        Operator = operator;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }  
}
