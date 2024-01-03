package com.example.demotesthibernate.model.request;

import com.example.demotesthibernate.model.dto.AddressDto;
import com.example.demotesthibernate.model.entity.Address;
import com.example.demotesthibernate.model.entity.Author;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AuthorRequest {

    private String name;
    private String gender;
    private AddressDto addressDto;


    public Author toEntity() {
        return new Author(null ,this.name, this.gender, null);
    }

}
