package com.quiz;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter@Getter@NoArgsConstructor@AllArgsConstructor
public class Quiz {

	private Long id;
	private String title;
	
	private List<Question> questions;
}
