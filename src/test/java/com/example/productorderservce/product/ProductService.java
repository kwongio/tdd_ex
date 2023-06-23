package com.example.productorderservce.product;


import org.springframework.stereotype.Component;

@Component
class ProductService {

    private final ProductPort productPort;

    ProductService(ProductPort productPort) {
        this.productPort = productPort;
    }


    public void addProduct(AddProductRequest request) {
        Product product = new Product(request.name(), request.price(), request.disCountPolicy());



        productPort.save(product);
    }


}
