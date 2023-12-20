package com.ty;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Moto implements Mobile{
    @Override
    public void ring() {
        System.out.println("Calling from Moto mobile");
    }
}
