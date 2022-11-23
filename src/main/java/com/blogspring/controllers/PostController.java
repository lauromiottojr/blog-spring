package com.blogspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.blogspring.models.PostModel;
import com.blogspring.services.PostService;

@Controller
public class PostController {

	@Autowired
	private PostService postService;

	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	public ModelAndView getPost() {
		ModelAndView mv = new ModelAndView("posts");
		List<PostModel> posts = postService.findAll();
		mv.addObject("posts", posts);
		return mv;
	}

}
