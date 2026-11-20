package com.quiz.Repositories;

import com.quiz.Entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz , Long> {
}
