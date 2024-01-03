package com.example.demotesthibernate.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookDto {

    private Long id;
    private String title;
    private String description;
    private String publishedDate;
    private AuthorDto authorDto;
    private List<CategoryDto> categoryDto;


}
