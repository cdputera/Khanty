package com.example.s46.khanty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

/**
 * Created by S46 on 7/5/2016.
 */
public class QuestionAndAnswersString {
        public List<String> allAnswers; // distractors plus real answer
        public String answerString;
        public String question;
        public int quizImage;
        public int selectedId = -1;



        public QuestionAndAnswersString(String questionString, String answerString, List<String> distractorsString, int quizImage) {
            this.question = questionString;
            this.answerString = answerString;
            allAnswers = new ArrayList<String>(distractorsString);
            this.quizImage = quizImage;

            // Add real answer to false answers and shuffle them around
            allAnswers.add(answerString);
            Collections.shuffle(allAnswers);
        }






}
