package com.blogspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogspring.models.PostModel;

public interface PostRepository extends JpaRepository<PostModel, Long> {

}
