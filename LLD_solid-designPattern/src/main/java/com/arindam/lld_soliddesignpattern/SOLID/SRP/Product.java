package com.arindam.lld_soliddesignpattern.SOLID.SRP;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    private Long id;
    private String name;
    private Double price;
    private String description;
}
