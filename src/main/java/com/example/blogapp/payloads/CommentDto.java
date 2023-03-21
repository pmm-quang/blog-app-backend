package com.example.blogapp.payloads;

import com.example.blogapp.entities.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@Getter
@Setter
public class CommentDto {

    private Integer id;
    private String content;

}
