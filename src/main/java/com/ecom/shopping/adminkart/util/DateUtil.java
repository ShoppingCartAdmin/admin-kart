package com.ecom.shopping.adminkart.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    public String getDateTime() {
    return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:ss"));
}
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:ss"));
    }
}
