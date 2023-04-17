package com.example.JobPosting.repository;

import java.util.List;

import com.example.JobPosting.models.Post;

public interface SearchRepository {
    List<Post> findBytext(String text);
}
