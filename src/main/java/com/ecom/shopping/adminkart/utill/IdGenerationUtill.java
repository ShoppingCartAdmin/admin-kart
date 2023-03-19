package com.ecom.shopping.adminkart.utill;

import org.springframework.stereotype.Component;

@Component
public class IdGenerationUtill {
    public long generateId() {
        return (long) Math.floor(Math.random() * 999999999) + 800;
    }
}