package com.example.demotesthibernate.controller;

import com.example.demotesthibernate.model.dto.AuthorDto;
import com.example.demotesthibernate.model.entity.Author;
import com.example.demotesthibernate.model.request.AuthorRequest;
import com.example.demotesthibernate.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @PostMapping("/insert-author")
    public AuthorDto insertAuthor(@RequestBody AuthorRequest authorRequest) {
        return authorService.insertAuthor(authorRequest);
    }

    @GetMapping("/get-all-authors")
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

}
