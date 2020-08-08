package com.example.androidpl_hw_7;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.btn_add)
    Button buttonAdd;

    @BindView(R.id.btn_divide)
    Button buttonDivide;

    @BindView(R.id.btn_multiply)
    Button buttonMultiply;

    @BindView(R.id.btn_subtract)
    Button buttonSubtract;

    @BindView(R.id.tv_result)
    TextView textViewResult;

    @BindView(R.id.one_number)
    EditText editTextOne;

    @BindView(R.id.two_number)
    EditText editTextTwo;

    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        initBtn();
    }

    private void initBtn() {
        calculator = new Calculator();
        buttonAdd.setOnClickListener(this);
        buttonSubtract.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int numberOne = Integer.parseInt(String.valueOf(editTextOne.getText()));
        int numberTwo = Integer.parseInt(String.valueOf(editTextTwo.getText()));
        int result;
        switch (v.getId()) {
            case R.id.btn_add:
                result = calculator.add(numberOne, numberTwo);
                break;
            case R.id.btn_divide:
                result = calculator.divide(numberOne, numberTwo);
                break;
            case R.id.btn_multiply:
                result = calculator.multiply(numberOne, numberTwo);
                break;
            case R.id.btn_subtract:
                result = calculator.subtract(numberOne, numberTwo);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }

        textViewResult.setText(String.valueOf(result));
    }
}
