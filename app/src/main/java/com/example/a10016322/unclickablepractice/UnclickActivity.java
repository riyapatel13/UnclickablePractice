package com.example.a10016322.unclickablepractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class UnclickActivity extends AppCompatActivity {

    LinearLayout back;
    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unclick);

        back = (LinearLayout)(findViewById(R.id.layout));
        button1 = (Button)(findViewById(R.id.button));
        button2 = (Button)(findViewById(R.id.button2));
        button3 = (Button)(findViewById(R.id.button3));

        button1.setWidth(back.getWidth()/3);
        button2.setWidth(back.getWidth()/3);
        button3.setWidth(back.getWidth()/3);
    }

    public void onClickGo(View view)
    {
        if(R.id.button == view.getId())
            button1.setEnabled(false);
        if(R.id.button2 == view.getId())
            button2.setEnabled(false);
        if(R.id.button3 == view.getId())
            button3.setEnabled(false);
    }
}
