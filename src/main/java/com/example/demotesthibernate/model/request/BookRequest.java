package com.example.demotesthibernate.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookRequest {

    private String title;
    private String description;
    private String publishedDate;

}
