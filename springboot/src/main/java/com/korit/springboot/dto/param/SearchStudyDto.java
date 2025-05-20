package com.korit.springboot.dto.param;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor
public class SearchStudyDto {
    private String searchValue;
    private Integer page = 1;
    private Integer count = 10;
}
