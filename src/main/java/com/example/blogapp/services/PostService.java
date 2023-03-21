package com.example.blogapp.services;

import com.example.blogapp.entities.Post;
import com.example.blogapp.payloads.PostDto;
import com.example.blogapp.payloads.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto, Integer userId, Integer catId);
    PostDto updatePost(PostDto postDto, Integer postId);
    void delete(Integer postId);
    PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy);
    PostDto getPostById(Integer postId);
    List<PostDto> getPostByCategory(Integer categoryId);
    List<PostDto> getPostByUser(Integer userId);
    List<PostDto> searchPosts(String keyword);
}
