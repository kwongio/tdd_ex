package com.example.productorderservce.product;

import org.springframework.util.Assert;

record AddProductRequest(String name, int price, DisCountPolicy disCountPolicy) {
    AddProductRequest {
        Assert.hasText(name, "상품명은 필수입니다.");
        Assert.isTrue(price > 0, "가격은 0원보다 커야합니다.");
        Assert.notNull(disCountPolicy, "할인정책은 필수입니다.");
    }
}
