package com.example.orderservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class OrderServiceApplicationTests {

    @Test
    void contextLoads() {
    }

    void printHello() {
        assertEquals(8, 3+5);
    }
}
