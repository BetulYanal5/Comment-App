package com.project.commentapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.commentapp.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
