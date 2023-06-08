package com.project.commentapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.commentapp.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
