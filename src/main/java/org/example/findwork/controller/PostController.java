package org.example.findwork.controller;

import org.example.findwork.repository.JobPostRepository;
import org.example.findwork.models.JobPost;
import org.example.findwork.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    JobPostRepository repo;

    @Autowired
    SearchRepository srepo;

    @GetMapping("/posts")
    public List<JobPost> getAllPosts(){
        return repo.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<JobPost> search(@PathVariable String text){
        return srepo.findByText(text);
    }

    @PostMapping("/jobpost")
    public JobPost addPost(@RequestBody JobPost post){
        return repo.save(post);
    }
}
