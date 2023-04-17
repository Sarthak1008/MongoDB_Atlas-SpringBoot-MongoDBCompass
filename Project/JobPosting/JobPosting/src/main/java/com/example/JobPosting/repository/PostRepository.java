package com.example.JobPosting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.JobPosting.models.Post;

public interface PostRepository extends MongoRepository<Post,String> {
    
}
