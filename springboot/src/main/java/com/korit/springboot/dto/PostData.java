package com.korit.springboot.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Data
public class PostData {
    private String name;
    private Integer age;
    private Address address;
}
