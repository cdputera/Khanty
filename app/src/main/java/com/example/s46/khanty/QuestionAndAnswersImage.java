package com.example.s46.khanty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by S46 on 7/5/2016.
 */
public class QuestionAndAnswersImage {
    public List<String> allAnswers; // distractors plus real answer
    public String answer;
    public String question;
    public String selectedAnswer;
    public int selectedId = -1;


    public QuestionAndAnswersImage(String questionImage, String answerImage1, List<String> distractorsImage1) {
        this.question = questionImage;
        this.answer = answerImage1;
        allAnswers = new ArrayList<String>(distractorsImage1);


        // Add real answer to false answers and shuffle them around
        allAnswers.add(answerImage1);
        Collections.shuffle(allAnswers);
    }


}
