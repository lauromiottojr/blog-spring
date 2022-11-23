package com.blogspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.blogspring.models.PostModel;
import com.blogspring.repositories.PostRepository;

public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;

	@Override
	public List<PostModel> findAll() {
		return postRepository.findAll();
	}

	@Override
	public PostModel findById(Long id) {
		return postRepository.findById(id).get();
	}

	@Override
	public PostModel save(PostModel post) {
		return postRepository.save(post);
	}

}
