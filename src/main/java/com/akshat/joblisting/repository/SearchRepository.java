package com.akshat.joblisting.repository;

import com.akshat.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
