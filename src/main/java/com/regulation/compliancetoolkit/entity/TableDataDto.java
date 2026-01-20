package com.regulation.compliancetoolkit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class TableDataDto {
    private String country;
    private List<Integer> values;
}