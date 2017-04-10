package com.baway.test.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.baway.test.R;
import com.baway.test.view.RoundProgressBar;

public class MainActivity extends AppCompatActivity {

    private Button bt;
    private RoundProgressBar progressBar;
    private boolean flag=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        progressBar.setProgress(78);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag=!flag;
                if (flag){
                    progressBar.setCricleColor(R.color.colorAccent);
                }else{
                    progressBar.setCricleColor(R.color.colorPrimary);
                }
            }
        });
    }

    private void initView() {
        bt = (Button) findViewById(R.id.bt);
        progressBar = (RoundProgressBar) findViewById(R.id.progressBar);
    }
}
