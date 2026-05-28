package org.example.findwork.repository;

import org.example.findwork.models.JobPost;

import java.util.List;

public interface SearchRepository {

    public List<JobPost> findByText(String text);
}
