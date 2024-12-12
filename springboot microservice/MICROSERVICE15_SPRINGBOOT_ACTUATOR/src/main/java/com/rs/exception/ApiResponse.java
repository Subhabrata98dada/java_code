package com.rs.exception;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiResponse {
    private String info;
    private Boolean status;
    private Integer statuscode;
}
