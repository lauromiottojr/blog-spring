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

		/*
		 * PostModel post1 = new PostModel();
		 * 
		 * post1.setAuthor("Lauro"); post1.setDateCriation(LocalDate.now());
		 * post1.setTitle("Docker"); post1.setText("Inserting new docker post!");
		 * 
		 * PostModel post2 = new PostModel();
		 * 
		 * post2.setAuthor("Kaka"); post2.setDateCriation(LocalDate.now());
		 * post2.setTitle("Java"); post2.setText("Inserting new java post!");
		 * 
		 * postList.add(post1); postList.add(post2);
		 */

		PostModel post3 = new PostModel();

		post3.setAuthor("Pedro A. Cabral");
		post3.setDateCriation(LocalDate.now());
		post3.setTitle("Carta para o Brasil");
		post3.setText(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec at venenatis augue. Nullam eleifend lacus lectus, vel mollis arcu molestie a. Etiam nunc orci, euismod a urna sit amet, elementum dictum dolor. Quisque congue scelerisque ultricies. Curabitur congue enim ligula, in sodales tellus pretium non. Curabitur in aliquam orci. Nam eget lacinia ligula. Fusce ac dignissim leo. Cras suscipit, justo non sodales condimentum, quam tortor lacinia nisl, et efficitur est orci at felis. Vivamus non dapibus turpis. Sed malesuada euismod massa, nec ornare mi eleifend ac. Nunc fringilla, massa ut viverra convallis, leo arcu commodo nulla, ut vehicula mauris tellus sagittis nunc. Proin sit amet ultrices mauris.\r\n"
						+ "\r\n"
						+ "Cras in finibus nibh, quis aliquet ligula. Aenean interdum convallis arcu, non consequat eros tincidunt sit amet. Sed est tortor, accumsan eget nibh a, rutrum ornare sem. Cras a viverra metus, vel bibendum nibh. Nulla imperdiet pretium fringilla. Praesent quis tristique nulla. Donec sagittis et augue eget laoreet. Praesent pulvinar commodo purus accumsan mattis. Donec ex tellus, hendrerit a turpis at, vulputate scelerisque urna. Nam ultricies nulla purus, at pretium elit convallis ut. Vestibulum sodales massa ut sagittis rutrum. Aliquam erat volutpat. Proin vestibulum convallis dolor, eu suscipit quam suscipit vitae. Nunc ac.");

		postList.add(post3);

		for (PostModel post : postList) {
			PostModel postSaved = postRepository.save(post);
			System.out.println(postSaved.getPostId());
		}

	}

}
