package com.question;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	QuestionService service;


	@PostMapping("/addQuestion")
	public Question add(@RequestBody Question question) {
		return service.add(question);

	}

	@GetMapping("/getAllQuestions")
	public List<Question> getAllQue() {
		return service.getAllQuestions();
	}

	@GetMapping("/getQuestion/{id}")
	public Question getQuestion(@PathVariable Long id) {
		return service.getQues(id);
	}
	
	@GetMapping("/quiz/{id}")
	public List<Question> getQuestionofquiz(@PathVariable Long id) {
		return service.getquizofQuestion(id);
	}
}
