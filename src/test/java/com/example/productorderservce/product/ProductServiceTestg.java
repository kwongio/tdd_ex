package com.example.productorderservce.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class ProductServiceTest {


    private ProductService productService;
    private ProductPort productPort;
    private ProductRepository productRepository;


    @BeforeEach
    void setUp() {
        productRepository = new ProductRepository();
        productPort = new ProductAdapter(productRepository);
        productService = new ProductService(productPort);
    }


    @Test

    public void 상품등록() throws IOException {
        AddProductRequest request1 = getAddProductRequest();
        productService.addProduct(request1);
    }

    private static AddProductRequest getAddProductRequest() {
        String name = "상품명";
        int price = 1000;
        DisCountPolicy disCountPolicy = DisCountPolicy.NONE;
        AddProductRequest request = new AddProductRequest(name, price, disCountPolicy);
        return request;
    }


}
