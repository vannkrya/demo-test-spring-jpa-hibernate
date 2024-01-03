package com.example.demotesthibernate.model.dto;

import com.example.demotesthibernate.model.entity.Author;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddressDto {

//    private Long id;
    private String city;
    private String street;
    private String houseNum;

//    public AddressDto(Long id, String city, String street, String houseNum) {
//        this.id = id;
//        this.city = city;
//        this.street = street;
//        this.houseNum = houseNum;
//    }

    public Author toEntity() {
        return new Author();
    }

}
