package com.example.blogapp.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
    private Integer id;

    @NotBlank
    @Size(min = 4, message = "min size of category title is 4")
    private String title;

    @NotBlank
    @Size(min = 10, message = "min size of category description  is 10")
    private String description;
}
