package com.example.productorderservce.product;

import org.springframework.util.Assert;

class Product {
    private Long id;
    private final String name;
    private final int price;
    private final DisCountPolicy disCountPolicy;

    public Product(String name, int price, DisCountPolicy disCountPolicy) {
        Assert.hasText(name, "상품명은 필수입니다.");
        Assert.isTrue(price > 0, "가격은 0원보다 커야합니다.");
        Assert.notNull(disCountPolicy, "할인정책은 필수입니다.");
        this.name = name;
        this.price = price;
        this.disCountPolicy = disCountPolicy;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public DisCountPolicy getDisCountPolicy() {
        return disCountPolicy;
    }

    public Long getId() {
        return id;
    }

    public void assignId(Long id) {
        this.id = id;
    }
}
