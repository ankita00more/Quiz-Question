package com.question;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {

	List<Question> all = new ArrayList<>();

	@Override
	public Question add(Question que) {
		all.add(que);
		return que;
	}

	@Override
	public List<Question> getAllQuestions() {
		return all;
	}

	@Override
	public Question getQues(Long id) {

		Question q1 = new Question();
		for (Question q : all) {
			if (q.getId().equals(id)) {
				q1.setId(q.getId());
				q1.setQuestion(q.getQuestion());
				q1.setQuizid(q.getQuizid());
			}
		}
		return q1;
	}

	@Override
	public List<Question> getquizofQuestion(Long id) {
		List<Question> li = new ArrayList<>();
		
		System.out.println(all);
		for (Question q : all) {
			if (q.getQuizid().equals(id)) {
				Question q2 = new Question();
				q2.setId(q.getId());
				q2.setQuestion(q.getQuestion());
				q2.setQuizid(q.getQuizid());
				li.add(q2);
			}
		}
		return li;
	}

}
