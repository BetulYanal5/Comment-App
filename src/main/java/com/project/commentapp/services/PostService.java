package com.project.commentapp.services;

import org.springframework.stereotype.Service;

import com.project.commentapp.repos.PostRepository;

@Service
public class PostService {

	private PostRepository postRepository;

	public PostService(PostRepository postRepository) {
		this.postRepository = postRepository;
	}
}
