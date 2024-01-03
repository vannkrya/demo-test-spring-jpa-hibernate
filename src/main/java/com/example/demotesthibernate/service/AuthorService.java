package com.example.demotesthibernate.service;

import com.example.demotesthibernate.model.dto.AuthorDto;
import com.example.demotesthibernate.model.entity.Author;
import com.example.demotesthibernate.model.request.AuthorRequest;

import java.util.List;

public interface AuthorService {
    AuthorDto insertAuthor(AuthorRequest authorRequest);
    List<Author> getAllAuthors();
}
