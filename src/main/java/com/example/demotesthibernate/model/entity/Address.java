package com.example.demotesthibernate.model.entity;

import com.example.demotesthibernate.model.dto.AddressDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "adresses")
public class Address {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private String city;
    private String street;
    private String houseNum;

    public AddressDto toDto() {
        return new AddressDto(this.city, this.street, this.houseNum);
    }

}
