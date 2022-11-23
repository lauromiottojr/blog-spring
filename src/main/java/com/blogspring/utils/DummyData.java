package com.blogspring.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.blogspring.models.PostModel;
import com.blogspring.repositories.PostRepository;

@Component
public class DummyData {

	@Autowired
	private PostRepository postRepository;

	//@PostConstruct
	public void savePosts() {
		List<PostModel> postList = new ArrayList<>();

		PostModel post1 = new PostModel();

		post1.setAuthor("Lauro");
		post1.setDateCriation(LocalDate.now());
		post1.setTitle("Docker");
		post1.setText("Inserting new docker post!");

		PostModel post2 = new PostModel();

		post2.setAuthor("Kaka");
		post2.setDateCriation(LocalDate.now());
		post2.setTitle("Java");
		post2.setText("Inserting new java post!");

		postList.add(post1);
		postList.add(post2);

		for (PostModel post : postList) {
			PostModel postSaved = postRepository.save(post);
			System.out.println(postSaved.getPostId());
		}

	}

}
