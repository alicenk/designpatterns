package com.designpatterns.demo.designpatterns.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Promotion {
    private String productName;
    private Integer promotionNo;
    private String profile;
}
