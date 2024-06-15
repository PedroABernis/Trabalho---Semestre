package com.bookstore.jpa.models;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "TB_REVIEW")
public class ReviewModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(nullable = false, unique = true)
	private String comnent;
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToOne
	@JoinColumn(name = "book_id")
	private BookModel book;

	public String getComnent() {
		return comnent;
	}

	public void setComnent(String comnent) {
		this.comnent = comnent;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public BookModel getBook() {
		return book;
	}

	public void setBook(BookModel book) {
		this.book = book;
	}
	
	
}
