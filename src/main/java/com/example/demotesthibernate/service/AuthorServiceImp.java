package com.example.demotesthibernate.service;

import com.example.demotesthibernate.model.dto.AuthorDto;
import com.example.demotesthibernate.model.entity.Author;
import com.example.demotesthibernate.model.request.AuthorRequest;
import com.example.demotesthibernate.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImp implements AuthorService{

    private final AuthorRepository authorRepository;

    @Override
    public AuthorDto insertAuthor(AuthorRequest authorRequest) {
        return authorRepository.save(authorRequest.toEntity()).toDto();
    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }


}
