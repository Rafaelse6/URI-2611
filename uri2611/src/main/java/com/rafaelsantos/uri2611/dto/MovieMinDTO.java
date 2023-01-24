package com.rafaelsantos.uri2611.dto;

import com.rafaelsantos.uri2611.projections.MovieMinProjection;

public class MovieMinDTO {
	private Long id;
	private String name;
	
	public MovieMinDTO() {}

	public MovieMinDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public MovieMinDTO(MovieMinProjection projection) {
		id = projection.getId();
		name = projection.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MovieMinDTO [id=" + id + ", name=" + name + "]";
	}
}
