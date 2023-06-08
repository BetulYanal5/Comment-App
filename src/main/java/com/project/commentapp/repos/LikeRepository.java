package com.project.commentapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.commentapp.entities.Like;

public interface LikeRepository extends JpaRepository<Like, Long> {

}
