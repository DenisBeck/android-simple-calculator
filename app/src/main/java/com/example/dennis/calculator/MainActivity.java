package com.example.dennis.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void input0(View view) {
        TextView editText = (TextView) findViewById(R.id.editText);
        String text = String.valueOf(editText.getText()) + 0;
        editText.setText(text);
    }

    public void input1(View view) {
        TextView editText = (TextView) findViewById(R.id.editText);
        String text = String.valueOf(editText.getText()) + 1;
        editText.setText(text);

    }

    public void input2(View view) {
        TextView editText = (TextView) findViewById(R.id.editText);
        String text = String.valueOf(editText.getText()) + 2;
        editText.setText(text);

    }

    public void input3(View view) {
        TextView editText = (TextView) findViewById(R.id.editText);
        String text = String.valueOf(editText.getText()) + 3;
        editText.setText(text);

    }

    public void input4(View view) {
        TextView editText = (TextView) findViewById(R.id.editText);
        String text = String.valueOf(editText.getText()) + 4;
        editText.setText(text);

    }

    public void input5(View view) {
        TextView editText = (TextView) findViewById(R.id.editText);
        String text = String.valueOf(editText.getText()) + 5;
        editText.setText(text);

    }

    public void input6(View view) {
        TextView editText = (TextView) findViewById(R.id.editText);
        String text = String.valueOf(editText.getText()) + 6;
        editText.setText(text);

    }

    public void input7(View view) {
        TextView editText = (TextView) findViewById(R.id.editText);
        String text = String.valueOf(editText.getText()) + 7;
        editText.setText(text);

    }

    public void input8(View view) {
        TextView editText = (TextView) findViewById(R.id.editText);
        String text = String.valueOf(editText.getText()) + 8;
        editText.setText(text);

    }

    public void input9(View view) {
        TextView editText = (TextView) findViewById(R.id.editText);
        String text = String.valueOf(editText.getText()) + 9;
        editText.setText(text);

    }

    public void inputPlus(View view) {
        TextView editText = (TextView) findViewById(R.id.editText);
        String statement = String.valueOf(editText.getText());
        editText.setText(getResult(statement, "+"));
    }

    public void inputMinus(View view) {
        TextView editText = (TextView) findViewById(R.id.editText);
        String statement = String.valueOf(editText.getText());
        editText.setText(getResult(statement, "-"));
    }

    public void inputMultiple(View view) {
        TextView editText = (TextView) findViewById(R.id.editText);
        String statement = String.valueOf(editText.getText());
        editText.setText(getResult(statement, "*"));
    }

    public void inputDiv(View view) {
        TextView editText = (TextView) findViewById(R.id.editText);
        String statement = String.valueOf(editText.getText());
        editText.setText(getResult(statement, "/"));
    }

    public void inputResult(View view) {
        TextView editText = (TextView) findViewById(R.id.editText);
        String statement = String.valueOf(editText.getText());
        editText.setText(getResult(statement, ""));
    }

    public void inputOff(View view) {
        TextView editText = (TextView) findViewById(R.id.editText);
        editText.setText("");
    }

    private String getResult(String statement, String operator) {
        String text;
        if (statement.contains("+") && statement.lastIndexOf("+") != statement.length() - 1) {
            String[] stringNumbers = statement.split("\\+");
            int result = Integer.parseInt(stringNumbers[0]) + Integer.parseInt(stringNumbers[1]);
            text = String.valueOf(result) + operator;
        } else if (statement.contains("-") && statement.lastIndexOf("-") != statement.length() - 1) {
            String[] stringNumbers = statement.split("-");
            int result = Integer.parseInt(stringNumbers[0]) - Integer.parseInt(stringNumbers[1]);
            text = String.valueOf(result) + operator;
        } else if (statement.contains("*") && statement.lastIndexOf("*") != statement.length() - 1) {
            String[] stringNumbers = statement.split("\\*");
            int result = Integer.parseInt(stringNumbers[0]) * Integer.parseInt(stringNumbers[1]);
            text = String.valueOf(result) + operator;
        } else if (statement.contains("/") && statement.lastIndexOf("/") != statement.length() - 1) {
            String[] stringNumbers = statement.split("/");
            int result = Integer.parseInt(stringNumbers[0]) / Integer.parseInt(stringNumbers[1]);
            text = String.valueOf(result) + operator;
        } else if (statement.lastIndexOf("+") == statement.length() - 1 ||
                statement.lastIndexOf("-") == statement.length() - 1 ||
                statement.lastIndexOf("*") == statement.length() - 1 ||
                statement.lastIndexOf("/") == statement.length() - 1){
            text = statement.substring(0, statement.length() - 1) + operator;
        } else {
            text = statement + operator;
        }
        return text;
    }
}
