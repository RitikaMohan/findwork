package org.example.findwork;

import org.example.findwork.models.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    JobPostRepository repo;

    @GetMapping("/posts")
    public List<JobPost> getAllPosts(){
        return repo.findAll();
    }

    @PostMapping("/jobpost")
    public JobPost addPost(@RequestBody JobPost post){
        return repo.save(post);
    }
}
