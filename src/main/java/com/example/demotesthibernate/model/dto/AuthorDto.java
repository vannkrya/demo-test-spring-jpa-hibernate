package com.example.demotesthibernate.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
//@AllArgsConstructor
@Data
public class AuthorDto {

//    private Long id;
    private String name;
    private String gender;
    private AddressDto addressDto;

    public AuthorDto(String authorName, String authorGender, AddressDto addressDto) {
//        this.id = id;
        this.name = authorName;
        this.gender = authorGender;
        this.addressDto = addressDto;
    }

}
