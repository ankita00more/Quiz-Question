package com.quiz;

import java.util.List;

import org.springframework.stereotype.Service;


public interface QuizService {
	
	Quiz add(Quiz quiz);
	
	List<Quiz> get();
	
	Quiz get(Long id);

}
