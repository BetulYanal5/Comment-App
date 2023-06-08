package com.project.commentapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.commentapp.services.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {

	PostService postService;

	public PostController(PostService postService) {
		this.postService = postService;
	}
	
}
