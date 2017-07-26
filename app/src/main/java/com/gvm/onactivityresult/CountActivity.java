package com.gvm.onactivityresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CountActivity extends AppCompatActivity {

    @BindView(R.id.txtActTwo)
    TextView textActTwo;

    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnCount)
    void count() {
        number++;
        textActTwo.setText(Integer.toString(number));
    }

    @OnClick(R.id.btnBack)
    void backAct() {
        Intent intent = new Intent();
        intent.putExtra("value", Integer.toString(number));
        setResult(RESULT_OK, intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("value", Integer.toString(number));
        setResult(RESULT_OK, intent);
        finish();
    }
}
