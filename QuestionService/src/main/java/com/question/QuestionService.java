package com.question;

import java.util.List;

import org.springframework.stereotype.Service;


public interface QuestionService {

	public Question add(Question que);
	
	public List<Question> getAllQuestions();
	
	public Question getQues(Long id);
	
	List<Question> getquizofQuestion(Long id);
}
