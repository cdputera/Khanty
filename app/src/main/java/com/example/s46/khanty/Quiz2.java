package com.example.s46.khanty;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by S46 on 7/7/2016.
 */
public class Quiz2 extends Activity {
    int questNumber = 0;
    int currentQuestion = 0;
    int score, score1, score2 = 0;
    int[] randomNumbers = new int[25];
    int[] evenNumbers = new int[25];
    int[] oddNumbers = new int[25];
    int k = 0, l = 0;

    Intent startIntent;
    RadioGroup answerRadioGroup;
    RadioButton radioCheck, b;
    TextView questionTextView;
    List<QuestionAndAnswersString> quizString = new ArrayList<QuestionAndAnswersString>();
    List<QuestionAndAnswersImage> quizImage = new ArrayList<QuestionAndAnswersImage>();
    ImageView pic1;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        startIntent = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);
        questionTextView = (TextView) findViewById(R.id.Question);
        answerRadioGroup = (RadioGroup) findViewById(R.id.myRadioGroup);
        pic1 = (ImageView) findViewById(R.id.imageView);

        // Setup a listener to save chosen answer

        int[] quizPic = { //gambar pertanyaan
                R.drawable.a,//1
                R.drawable.b,//2
                R.drawable.c,//3
                R.drawable.d,//4
                R.drawable.e,//5
                R.drawable.f,//6
                R.drawable.g,//7
                R.drawable.h,//8
                R.drawable.i,//9
                R.drawable.j//10
        };//8


        String[] questionString = {
                "Huruf apakah ini?",//0
                "Huruf apakah ini?",//1
                "Huruf apakah ini?",//2
                "Huruf apakah ini?",//3
                "Huruf apakah ini?",//4
                "Huruf apakah ini?",//5
                "Huruf apakah ini?"//6
        }; //questions here// };


        String[] questionImage = {
                "Mana yang merupakan huruf ALIF ?",//0
                "Mana yang merupakan huruf Ba ?",//1
                "Mana yang merupakan huruf Ta ?",//2
                "Mana yang merupakan huruf Tsa ?",//3
                "Mana yang merupakan huruf Ja ?",//4
                "Mana yang merupakan huruf Kha ?",//5
                "Mana yang merupakan huruf Kho ?",//6

        }; //questions here// };

        String[] answerString = {
                "Alif",
                "Ba",
                "Ta",
                "Tsa",
                "Kha",
                "Kho",
                "Dha",
        }; //answers here// };

        int[] answerImage = {
                R.drawable.dist1,
                R.drawable.dist2,
                R.drawable.dist3,//0
                R.drawable.dist4,
                R.drawable.dist5,
                R.drawable.dist6,//1
                R.drawable.dist7

        }; //answers here// };

        String[] answerImage1 = {
                "a",
                "b",
                "c",
                "d",
                "e",
                "f",
                "g",
                "h",
                "i",
                "j",
                "k",
                "l",
                "m",
                "n",
                "o",
                "p",
                "q",
                "r",
                "s",
                "t",
                "u",
                "v",
                "w",
                "x",
                "y",
                "z",
                "aa",
                "ab",
                "ac",
                "ad"
        };

        String[] distractorString = {
                "AA", "Aa", "aa",//0
                "BB", "Bb", "bb",//1
                "CC", "Cc", "cc",//2
                "DD", "Dd", "dd",//3
                "EE", "Ee", "ee",//4
                "FF", "Ff", "ff",//5
                "GG", "Gg", "gg" //6
        }; //distractors here// };

        Integer[] distractorImage = {
                0, 0, 0,
                R.drawable.dist1, R.drawable.dist2, R.drawable.dist3,//0
                R.drawable.dist4, R.drawable.dist5, R.drawable.dist6,//1
                R.drawable.dist7, R.drawable.dist8, R.drawable.dist9,//2
                R.drawable.dist10, R.drawable.dist11, R.drawable.dist12,//3
                R.drawable.dist13, R.drawable.dist14, R.drawable.dist15,//4
                R.drawable.dist16, R.drawable.dist17, R.drawable.dist18,//5
                R.drawable.dist19, R.drawable.dist20, R.drawable.dist21,//6
                R.drawable.dist22, R.drawable.dist23, R.drawable.dist24,//7
                R.drawable.dist25, R.drawable.dist26, R.drawable.dist27,//8
                R.drawable.dist28, R.drawable.dist29, R.drawable.dist30//9
        }; //distractors here// };

        String[] distractorsImage1 = {"a",
                "b",
                "c",
                "d",
                "e",
                "f",
                "g",
                "h",
                "i",
                "j",
                "k",
                "l",
                "m",
                "n",
                "o",
                "p",
                "q",
                "r",
                "s",
                "t",
                "u",
                "v",
                "w",
                "x",
                "y",
                "z",
                "aa",
                "ab",
                "ac",
                "ad",
        };

        ArrayList<String> distractorListString = new ArrayList(Arrays.asList(distractorString));
        /* I assumed that there are 3 distractors per question and that they are organized in distractorList like so:
         *   "q1 distractor 1", "q1 distractor 2", "q1 distractor 3",
         *   "q2 distractor 1", "q2 distractor 2", "q2 distractor 3",
         *   etc
         *
         * If the question is: "The color of the sky", you'd see distractors:
         *   "red", "green", "violet"
         */
        quizString.add(new QuestionAndAnswersString(questionString[0], answerString[0], distractorListString.subList(0, 3), quizPic[0]));//store question
        quizString.add(new QuestionAndAnswersString(questionString[1], answerString[1], distractorListString.subList(3, 6), quizPic[1]));//store question
        quizString.add(new QuestionAndAnswersString(questionString[2], answerString[2], distractorListString.subList(6, 9), quizPic[2]));//store question
        quizString.add(new QuestionAndAnswersString(questionString[3], answerString[3], distractorListString.subList(9, 12), quizPic[3]));//store question
        quizString.add(new QuestionAndAnswersString(questionString[4], answerString[4], distractorListString.subList(12, 15), quizPic[4]));//store question
        quizString.add(new QuestionAndAnswersString(questionString[5], answerString[5], distractorListString.subList(15, 18), quizPic[5]));//store question
        ArrayList<String> distractorListImage1 = new ArrayList(Arrays.asList(distractorsImage1));
        for (int i = 0; i < 5; i++) {

            quizImage.add(new QuestionAndAnswersImage(questionImage[i], answerImage1[i], distractorListImage1.subList((i * 3), (i + 1) * 3)));
            /*quizImage.add(new QuestionAndAnswersImage(questionImage[1], answerImage1[1], distractorListImage1.subList(3, 6)));
            quizImage.add(new QuestionAndAnswersImage(questionImage[2], answerImage1[2], distractorListImage1.subList(6, 9)));
            quizImage.add(new QuestionAndAnswersImage(questionImage[3], answerImage1[3], distractorListImage1.subList(9, 12)));
            quizImage.add(new QuestionAndAnswersImage(questionImage[4], answerImage1[4], distractorListImage1.subList(12, 15)));
            quizImage.add(new QuestionAndAnswersImage(questionImage[5], answerImage1[5], distractorListImage1.subList(15, 18)));*/
        }


        Collections.shuffle(quizString);
        Collections.shuffle(quizImage);
        randomChoice();
    }


    public void randomChoice() {
        for (int index = 0; index < randomNumbers.length; index++) {
            randomNumbers[index] = (int) (Math.random() * 99);
        }
        for (int i = 0; i < 25; i++) {
            if (randomNumbers[i] % 2 == 0) {
                fillInQuestionImage();

            } else {
                oddNumbers[l] = randomNumbers[i];
                fillInQuestionImage();
            }
        }

    }

    public void fillInQuestionString() {
        QuestionAndAnswersString qnaS = quizString.get(currentQuestion);
        questionTextView.setText(qnaS.question); //set text question
        pic1.setImageResource(qnaS.quizImage); //set pic question
        int count = answerRadioGroup.getChildCount();//count child radio group
        Log.d("Nilai count", String.valueOf(count));
        int i;
        for (i = 0; i < count; i++) { //set all option in radio group
            ((RadioButton) answerRadioGroup.getChildAt(i)).setText(qnaS.allAnswers.get(i));
            //((RadioButton) answerRadioGroup.getChildAt(i)).setBackgroundResource(qna.pic);
            // answerRadioGroup.getChildAt(i).setBackgroundResource(qna.pic);
            // Restore selected answer if exists otherwise clear previous question's choice

            if (qnaS.selectedId > -1)
                answerRadioGroup.check(qnaS.selectedId);
            else
                answerRadioGroup.clearCheck();
        }
    }

    public void fillInQuestionImage() {
        QuestionAndAnswersImage qnaI = quizImage.get(currentQuestion);
        questionTextView.setText(qnaI.question); //set text question
        int count = answerRadioGroup.getChildCount();//count child radio group
        Log.d("TAG", String.valueOf(count));
        int i;
        for (i = 0; i < count; i++) { //set all option in radio group
            //(answerRadioGroup.getChildAt(i)).setBackgroundResource(qnaI.allAnswers.get(i));
            ((RadioButton) answerRadioGroup.getChildAt(i)).setText(qnaI.allAnswers.get(i));
            int a = answerRadioGroup.getChildAt(i).getId();
            b = (RadioButton) findViewById(a);
            String c = b.getText().toString();
            if (c == "a") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist1, 0);
            } else if (c == "b") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist2, 0);
            } else if (c == "c") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist3, 0);
            } else if (c == "d") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist4, 0);
            } else if (c == "e") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist5, 0);
            } else if (c == "f") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist6, 0);
            } else if (c == "g") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist7, 0);
            } else if (c == "h") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist8, 0);
            } else if (c == "i") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist9, 0);
            } else if (c == "j") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist10, 0);
            } else if (c == "k") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist11, 0);
            } else if (c == "l") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist12, 0);
            } else if (c == "m") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist13, 0);
            } else if (c == "n") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist14, 0);
            } else if (c == "o") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist15, 0);
            } else if (c == "p") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist16, 0);
            } else if (c == "q") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist17, 0);
            } else if (c == "r") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist18, 0);
            } else if (c == "s") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist19, 0);
            } else if (c == "t") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist20, 0);
            } else if (c == "u") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist21, 0);
            } else if (c == "v") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist22, 0);
            } else if (c == "w") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist23, 0);
            } else if (c == "x") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist24, 0);
            } else if (c == "y") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist25, 0);
            } else if (c == "z") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist26, 0);
            } else if (c == "aa") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist27, 0);
            } else if (c == "ab") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist28, 0);
            } else if (c == "ac") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist29, 0);
            } else if (c == "ad") {
                b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.dist30, 0);
            }


            // answerRadioGroup.getChildAt(i).setBackgroundResource(qna.pic);
            // Restore selected answer if exists otherwise clear previous question's choice

            if (qnaI.selectedId > -1)
                answerRadioGroup.check(qnaI.selectedId);
            else answerRadioGroup.clearCheck();
        }
    }

    public void checkAns(View v) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        QuestionAndAnswersString qnS = quizString.get(currentQuestion);
        QuestionAndAnswersImage qnI = quizImage.get(currentQuestion);

        int selectId = answerRadioGroup.getCheckedRadioButtonId();
        radioCheck = (RadioButton) findViewById(selectId);

        String radioAns = radioCheck.getText().toString();
        //int radioAnsI = radioCheck.get


        Log.d("RadioAns", (radioCheck.getText().toString()));
        //Log.d("Value Radio Ans", String.valueOf((radioAns1)));//in
        //Log.d("Answe string", (qnS.answerString));
        Log.d("Answer Image", (qnI.answer));//int


        if (radioAns == qnI.answer) {
            score++;
            Log.d("Nlai score", String.valueOf((score)));
            alertDialogBuilder.setTitle("Jawaban ");
            alertDialogBuilder.setMessage("Yeay Jawaban kamu benar!");
            alertDialogBuilder.setPositiveButton("Ulangi", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            alertDialogBuilder.show();
        } else if (radioAns == qnS.answerString) {
            score++;
            alertDialogBuilder.setTitle("Jawaban ");
            alertDialogBuilder.setMessage("Yeay Jawaban kamu benar!");
            alertDialogBuilder.setPositiveButton("Ulangi", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            alertDialogBuilder.show();
        } else
            alertDialogBuilder.setTitle("Jawaban Kamu salah");
        alertDialogBuilder.setMessage("Skor anda adalah ");
        alertDialogBuilder.setPositiveButton("Ulangi", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
                startActivity(startIntent);
            }
        });
        alertDialogBuilder.show();

        currentQuestion++;
        randomChoice();
        questNumber++;

        if (currentQuestion == 5)
            alertDialogBuilder.setTitle("Quis sudah selesai");
        alertDialogBuilder.setMessage("Skor anda adalah " + score);
        alertDialogBuilder.setPositiveButton("Ulangi", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
                startActivity(startIntent);
            }
        });

        alertDialogBuilder.setNegativeButton("Keluar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                }
        );

    }


}
