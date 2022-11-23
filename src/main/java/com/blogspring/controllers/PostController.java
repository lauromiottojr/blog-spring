package com.blogspring.controllers;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.blogspring.models.PostModel;
import com.blogspring.services.PostService;

@Controller
public class PostController {

	@Autowired
	private PostService postService;

	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	public ModelAndView getPosts() {
		ModelAndView mv = new ModelAndView("posts");
		List<PostModel> posts = postService.findAll();
		mv.addObject("posts", posts);
		return mv;
	}

	@RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
	public ModelAndView getPostDetails(@PathVariable("id") Long id) {
		ModelAndView mv = new ModelAndView("postDetails");
		PostModel post = postService.findById(id);
		mv.addObject("post", post);
		return mv;
	}

	@RequestMapping(value = "/newpost", method = RequestMethod.GET)
	public String getPostForm() {
		return "postForm";
	}

	@RequestMapping(value = "/newpost", method = RequestMethod.POST)
	public String saveNewPost(@Valid PostModel post, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return "redirect:/newpost";
		}
		post.setDateCriation(LocalDate.now());
		postService.save(post);
		return "redirect:/posts";
	}
}
