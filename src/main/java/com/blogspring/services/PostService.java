package com.blogspring.services;

import java.util.List;

import com.blogspring.models.PostModel;

public interface PostService {

	List<PostModel> findAll();

	PostModel findById(Long id);

	PostModel save(PostModel post);

}
