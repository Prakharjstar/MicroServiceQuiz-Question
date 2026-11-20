package com.question.Services;

import com.question.Entities.Question;

import java.util.List;

public interface QuestionService {

    Question add(Question question);

    List<Question> getAll();

    Question getById(Long id);

    List<Question> getQuestionOfQuiz(Long quizId);
}
