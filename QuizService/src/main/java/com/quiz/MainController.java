package com.quiz;

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
	QuizService quizService;

	@PostMapping("/addOquiz")
	public Quiz add(@RequestBody Quiz quiz) {
		return quizService.add(quiz);
	}

	@GetMapping("/getAllQuiz")
	public List<Quiz> getAllQuiz() {
		return quizService.get();
	}

	@GetMapping("/getQuiz/{id}")
	public Quiz getQuiz(@PathVariable Long id) {
		return quizService.get(id);

	}
}
