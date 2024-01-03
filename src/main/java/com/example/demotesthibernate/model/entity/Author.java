package com.example.demotesthibernate.model.entity;

import com.example.demotesthibernate.model.dto.AuthorDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "authors")
public class Author {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorId;

    @Column(name = "name")
    private String authorName;

    @Column(name = "gender")
    private String authorGender;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public AuthorDto toDto() {
        return new AuthorDto(this.authorName, this.authorGender, this.address.toDto());
    }

}
