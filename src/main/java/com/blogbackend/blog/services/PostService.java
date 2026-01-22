package com.blogbackend.blog.services;

import com.blogbackend.blog.entities.Post;
import com.blogbackend.blog.payloads.PostDto;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto,Integer categoryId,Integer userId);

    PostDto updatePost(PostDto postDto,Integer postId);

    void deletePost(Integer postId);

    List<PostResponse> getAllPost( Integer pageNumber,Integer pageSize,String sortBy, String sortDir);

    PostDto getPostById(Integer postId);

    List<PostDto> getPostByCategory(Integer categoryId);

    List<PostDto> getPostsByUser(Integer userId);

    List<PostDto>searchPosts(String keyword);



}
