/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.drawable.edit_text;
import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score = 0;

    public void submit(View view) {
        score = 0;
        RadioGroup radio1 = (RadioGroup) findViewById(R.id.radioGroup1);
        RadioGroup radio2 = (RadioGroup) findViewById(R.id.radioGroup2);
        RadioGroup radio3 = (RadioGroup) findViewById(R.id.radioGroup3);
        RadioGroup radio4 = (RadioGroup) findViewById(R.id.radioGroup4);
        RadioGroup radio5 = (RadioGroup) findViewById(R.id.radioGroup5);
        if (radio1.getCheckedRadioButtonId() == -1 || radio2.getCheckedRadioButtonId() == -1 || radio3.getCheckedRadioButtonId() == -1 || radio4.getCheckedRadioButtonId() == -1 || radio5.getCheckedRadioButtonId() == -1) {
            Context context = getApplicationContext();
            CharSequence text = "Answer all the questions ";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else {
            RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1);
            Boolean btn1 = rb1.isChecked();
            if (btn1) {
                score++;
            }
            RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton8);
            Boolean btn2 = rb2.isChecked();
            if (btn2) {
                score++;
            }
            RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton12);
            Boolean btn3 = rb3.isChecked();
            if (btn3) {
                score++;
            }
            RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton16);
            Boolean btn4 = rb4.isChecked();
            if (btn4) {
                score++;
            }
            RadioButton rb5 = (RadioButton) findViewById(R.id.radioButton20);
            Boolean btn5 = rb5.isChecked();
            if (btn5) {
                score++;
            }
            CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox2);
            CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox3);
            CheckBox cb3 = (CheckBox) findViewById(R.id.checkBox4);
            CheckBox cb4 = (CheckBox) findViewById(R.id.checkBox5);
            if (cb1.isChecked() && cb2.isChecked() == false && cb3.isChecked() == false && cb4.isChecked()) {
                score += 2;
            }
            if ((cb1.isChecked() && cb2.isChecked() == false && cb3.isChecked() == false && cb4.isChecked() == false) || (cb1.isChecked() == false && cb2.isChecked() == false && cb3.isChecked() == false && cb4.isChecked())) {
                score++;
            }
            EditText txt = (EditText) findViewById(R.id.name);
            String obj = txt.getText().toString();
            Log.v("LOg", obj);
            if (obj.equals("bla")) {
                score++;
            }
            Context context = getApplicationContext();
            CharSequence text = "Congrats! Your score is: " + score;

            CharSequence text1 = "Your score is: " + score;
            int duration = Toast.LENGTH_SHORT;
            if (score == 8) {
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            } else {
                Toast toast1 = Toast.makeText(context, text1, duration);
                toast1.show();
            }
        }

    }
}
