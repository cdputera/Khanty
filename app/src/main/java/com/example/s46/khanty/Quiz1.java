package com.example.s46.khanty;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Quiz1 extends Activity {
    RadioGroup answerRadioGroup;
    RadioButton radioCheck;
    int currentQuestion = 0;
    int score = 0;
    TextView questionTextView;
    List<QuestionAndAnswers> quiz = new ArrayList<QuestionAndAnswers>();
    ImageView pic1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);
        questionTextView = (TextView) findViewById(R.id.Question);
        answerRadioGroup = (RadioGroup) findViewById(R.id.myRadioGroup);
        pic1 = (ImageView) findViewById(R.id.imageView);

        // Setup a listener to save chosen answer

        /*answerRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId > 0) {
                    QuestionAndAnswers qna = quiz.get(currentQuestion);
                    qna.selectedAnswer = ((RadioButton) group.findViewById(checkedId)).getText().toString();
                    qna.selectedId = checkedId;
                    Log.d("TAG", String.valueOf(qna.selectedId));
                    Log.d("TAG", String.valueOf(checkedId));

                }
            }
        });
        */


        int[] pic = {
                R.drawable.a,//1
                R.drawable.b,//2
                R.drawable.c,//3
                R.drawable.d,//4
                R.drawable.e,//5
                R.drawable.f,//6
                R.drawable.g,//7
                R.drawable.h};//8

        String[] question = {
                "Mana yang merupakan huruf ALIF ?",//1
                "Manakah huruf BA ?",//2
                "Mana yang merupakan huruf TA ?",//3
                "Mana yang merupakan huruf TU ?",//4
                "Manakah huruf KHO ?",//5
                "Manakah huruf yang dibaca KHI ?",//6
                "Mana yang merupakan huruf DZAL ?"//7
        }; //questions here// };
        String[] answer = {
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
        }; //answers here// };



        String[] distractor = {
                "11", "12", "13", "21", "22", "23", "31", "32", "33", "41", "42", "43", "51", "52", "53", "61", "62", "63", "71", "72", "73"
        }; //distractors here// };


        ArrayList<String> distractorList = new ArrayList(Arrays.asList(distractor));
        /* I assumed that there are 3 distractors per question and that they are organized in distractorList like so:
         *   "q1 distractor 1", "q1 distractor 2", "q1 distractor 3",
         *   "q2 distractor 1", "q2 distractor 2", "q2 distractor 3",
         *   etc
         *
         * If the question is: "The color of the sky", you'd see distractors:
         *   "red", "green", "violet"
         */
        int length = question.length;
        int i;
        for (i = 0; i < length; i++)
        quiz.add(new QuestionAndAnswers(question[i], answer[i], distractorList.subList(i * 3, (i + 1) * 3), pic[i]));//store question

        Collections.shuffle(quiz);//random the question
        fillInQuestion();//show the question
    }

        public void fillInQuestion() {
            QuestionAndAnswers qna = quiz.get(currentQuestion);
            questionTextView.setText(qna.question); //set text question
            pic1.setImageResource(qna.pic); //set pic question
            int count = answerRadioGroup.getChildCount();//count child radio group
            Log.d("TAG", String.valueOf(count));
            for (int i = 0; i <count; i++) //set all option in radio group
                ((RadioButton) answerRadioGroup.getChildAt(i)).setText(qna.allAnswers.get(i));
               // Restore selected answer if exists otherwise clear previous question's choice

            if (qna.selectedId > -1)
                answerRadioGroup.check(qna.selectedId);
            else
                answerRadioGroup.clearCheck();
        }

        public void checkAns(View v){
            QuestionAndAnswers qna = quiz.get(currentQuestion);
            int selectId = answerRadioGroup.getCheckedRadioButtonId();
            radioCheck = (RadioButton)findViewById(selectId);
            String radioAns = radioCheck.getText().toString();
            Log.d("TAG", (radioAns));
            Log.d("TAG", (qna.answer));

            if (radioAns == qna.answer)
                score++;
            Log.d("TAG", String.valueOf((score)));
            currentQuestion++;
            fillInQuestion();


        }

}