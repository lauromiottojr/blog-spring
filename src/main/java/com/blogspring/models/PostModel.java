package com.blogspring.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "TB_POST")
public class PostModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long postId;

	@NotBlank
	private String title;

	@NotBlank
	private String author;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyy")
	private LocalDate dateCriation;

	@NotBlank
	@Lob
	private String text;

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDate getDateCriation() {
		return dateCriation;
	}

	public void setDateCriation(LocalDate dateCriation) {
		this.dateCriation = dateCriation;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
