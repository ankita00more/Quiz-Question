package com.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizServiceImpl implements QuizService {
	
	List<Quiz> li_qz=new ArrayList<>();
	
	@Autowired
	QuestionClient client;

	@Override
	public Quiz add(Quiz quiz) {
		Quiz qz = new Quiz();
		qz.setId(quiz.getId());
		qz.setTitle(quiz.getTitle());
		li_qz.add(qz);
		return qz;
	}

	@Override
	public List<Quiz> get() {
		
		return li_qz.stream().map(q->{
			q.setQuestions(client.getQuestionOfQuiz(q.getId()));
			return q;
		}).collect(Collectors.toList());
	}

	@Override
	public Quiz get(Long id) {
		Quiz getOne=new Quiz();
		
		for(Quiz q:li_qz) {
			if(q.getId().equals(id)) {
				getOne.setId(q.getId());
				getOne.setTitle(q.getTitle());
				getOne.setQuestions(client.getQuestionOfQuiz(q.getId()));
			}
		}
		
		return getOne;
	}

}
