package com.question.Controller;

import com.question.Entities.Question;
import com.question.Services.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/question")
@RestController
public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public Question Create(@RequestBody Question question){
        return questionService.add(question);
    }

    @GetMapping
    public List<Question> GetAll(){
        return questionService.getAll();
    }

    @GetMapping("/{id}")
    public QuestionService getQuestionService() {
        return questionService;
    }

    public Question getById(@PathVariable Long id){
        return questionService.getById(id);
    }

    @GetMapping("quiz/{quizId}")
    public List<Question> getAllQuestionsOfQuiz(@PathVariable Long quizId){
        return questionService.getQuestionOfQuiz(quizId);
    }
}
