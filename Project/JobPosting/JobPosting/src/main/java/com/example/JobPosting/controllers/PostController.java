package com.example.JobPosting.controllers;

import java.io.Console;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JobPosting.models.Post;
import com.example.JobPosting.repository.PostRepository;
import com.example.JobPosting.repository.SearchRepository;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {
    
@Autowired
private PostRepository postRepository;

@Autowired
private SearchRepository searchRepository;


    @RequestMapping(value="/")
    @CrossOrigin
    public String redirect(HttpServletResponse response) throws IOException {
        String s = "Welcome to project";
        return s;
    }
    @GetMapping("/posts")
    @CrossOrigin
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }
    
    @PostMapping("/posts")
    @CrossOrigin
    public Post addPost(@RequestBody Post post){
        return postRepository.save(post);
    }

    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text){
        return searchRepository.findBytext(text);
    }
}
