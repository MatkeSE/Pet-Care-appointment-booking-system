package com.dailycodework.universalpetcare.dto;

import lombok.Data;

@Data
public class ReviewDto {
    private Long id;
    private String stars;
    private String feedback;
}
