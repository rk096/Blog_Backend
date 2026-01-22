package com.blogbackend.blog.payloads;

import java.util.List;

public class PostResponse {

    private List<PostDto> content;
    private int pageNumber;
    private int pageSize;
    private long totalElements;
    private int totalPages;
    private boolean lastPage;
}
