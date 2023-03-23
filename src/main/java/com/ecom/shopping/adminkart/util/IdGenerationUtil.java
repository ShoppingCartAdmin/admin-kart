package com.ecom.shopping.adminkart.util;

public class IdGenerationUtil {
    public long generateId() {
        return  (long) Math.floor(Math.random()* 999999999) +800;
    }

}
