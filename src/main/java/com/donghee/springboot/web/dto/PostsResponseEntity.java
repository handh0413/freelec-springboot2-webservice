package com.donghee.springboot.web.dto;

import com.donghee.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseEntity {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseEntity(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
