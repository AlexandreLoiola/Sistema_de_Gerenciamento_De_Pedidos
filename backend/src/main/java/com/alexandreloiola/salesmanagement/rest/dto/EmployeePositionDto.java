package com.alexandreloiola.salesmanagement.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeePositionDto {
    private Long id;

    private String description;

    private Boolean isActive;
}
