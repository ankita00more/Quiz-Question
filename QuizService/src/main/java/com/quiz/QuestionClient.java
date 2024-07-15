package com.quiz;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="http://localhost:8037",value = "QuestionClient")
public interface QuestionClient {
	
	@GetMapping("/quiz/{id}")
	List<Question> getQuestionOfQuiz(@PathVariable Long id);

}
