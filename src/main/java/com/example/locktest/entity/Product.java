package com.example.locktest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Product {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    private Long version; // 낙관적 락을 위한 버전 필드

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "price", nullable = false)
    private Long price;

    @Column(name = "category1", nullable = false)
    private String category1; // 대분류  ex) 옷

    @Column(name = "category2", nullable = false)
    private String category2; // 중분류  ex) 하의, 상의

    private Long stock;


    public void decrease(Long count) {
        this.stock -= count;
    }
}
