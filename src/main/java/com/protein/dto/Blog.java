package com.protein.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Blog {
    private String userId;
    private Long id;
    private String title;
    private String body;
}
