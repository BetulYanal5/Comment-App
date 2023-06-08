package com.project.commentapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.commentapp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
