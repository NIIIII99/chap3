package com.example.demo;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Greet {


    @Getter
    @Setter
    private String message;

    //    public Greet(){}
    public Greet(String message) {
        this.message = message;
    }
}
