package com.example.s46.khanty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

/**
 * Created by S46 on 7/5/2016.
 */
public class QuestionAndAnswers {
        public List<String> allAnswers; // distractors plus real answer
        public String answer;
        public String question;
        public String selectedAnswer;
        public int pic;
        public int selectedId = -1;



        public QuestionAndAnswers(String question, String answer, List<String> distractors, int pic) {
            this.question = question;
            this.answer = answer;
            allAnswers = new ArrayList<String>(distractors);
            this.pic = pic;

            // Add real answer to false answers and shuffle them around
            allAnswers.add(answer);
            Collections.shuffle(allAnswers);
        }

        public boolean isCorrect() {
            return answer.equals(selectedAnswer);
        }

        public int result(){
            int correct = 0;
            /*for(QuestionAndAnswer question : quiz)
                if(question.isCorrect())
                    correct++;*/
            return correct;
        }


}
