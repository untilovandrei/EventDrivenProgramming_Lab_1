package com.example.andrei.eventdrivenprogramming_lab1;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.nio.charset.MalformedInputException;

public class MainActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
    //create and set main layout
            RelativeLayout main_layout=new RelativeLayout(this);
            setContentView(main_layout);


    //create and set buttons and textField
            TextView textOut=new TextView(this);
            final TextView customText=new TextView(this);
            final Button defaultButton=new Button(this);
            final Button customButton=new Button(this);
            final EditText textInput=new EditText(this);

    //add children to layout
            main_layout.addView(textOut);
            main_layout.addView(defaultButton);
            main_layout.addView(customButton);
            main_layout.addView(textInput);
            main_layout.addView(customText);


    //set textField in the center of window
            textOut.setText("Done with Pride and Prejudice by Untilov Andrei");
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams)textOut.getLayoutParams();
            layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);
            textOut.setLayoutParams(layoutParams);




    //set DEFAULT button
            final RelativeLayout.LayoutParams defaultButtonParamenters = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            defaultButtonParamenters.leftMargin=410;
            defaultButtonParamenters.topMargin=400;
            defaultButton.setLayoutParams(defaultButtonParamenters);
            defaultButton.setText("READ");
            defaultButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            customText.setText(textInput.getText());
                            customText.setTextSize(20);
                            textInput.setText("");
                            customText.setAllCaps(true);
                    }
            });



    // set text input
            RelativeLayout.LayoutParams textInputParamenters = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            textInputParamenters.addRule(RelativeLayout.CENTER_HORIZONTAL);
            textInputParamenters.topMargin=1000;
            textInputParamenters.width=600;
            textInput.setLayoutParams(textInputParamenters);
            textInput.setHint("Message");
            textInput.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

    //set custom text
            final RelativeLayout.LayoutParams customTextParamenters = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            customTextParamenters.addRule(RelativeLayout.CENTER_HORIZONTAL);
            customTextParamenters.topMargin=600;
            customTextParamenters.width=600;
            customText.setText("MESSAGE");
            customText.setLayoutParams(customTextParamenters);
            customText.setTypeface(Typeface.create("Roboto-Thin", Typeface.BOLD_ITALIC));
            customText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            customText.setTextSize(20);
            customText.setTextColor(Color.YELLOW);
            customText.setBackgroundColor(Color.RED);


    // set CUSTOM button
            RelativeLayout.LayoutParams customButtonParamenters = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            customButtonParamenters.leftMargin = 200;   //x axis
            customButtonParamenters.topMargin = 100;    //y axis
            customButtonParamenters.width = 700;
            customButtonParamenters.height = 200;
            customButton.setLayoutParams(customButtonParamenters);
            customButton.setText("CUSTOM");
            customButton.setTypeface(Typeface.create("serif-monospace", Typeface.BOLD));  // set font
            customButton.setTextSize(25); // set font size
            customButton.setTextColor(Color.BLUE);  // set text color
            customButton.setBackgroundColor(Color.YELLOW);   // set background color
          /*  customButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            customTextParamenters.topMargin=400;
                            defaultButtonParamenters.topMargin=600;
                            customText.setLayoutParams(customTextParamenters);
                            defaultButton.setLayoutParams(defaultButtonParamenters);
                    }
            });   */
            customButton.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                            customTextParamenters.topMargin=400;
                            defaultButtonParamenters.topMargin=600;
                            customText.setLayoutParams(customTextParamenters);
                            defaultButton.setLayoutParams(defaultButtonParamenters);
                            return true;
                    }
            });

    }




}
