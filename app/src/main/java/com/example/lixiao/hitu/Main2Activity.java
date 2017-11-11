package com.example.lixiao.hitu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    private MyView mQiQiu;
    private MyView mMeiNv ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mQiQiu = (MyView) findViewById(R.id.id_qiqiu);
        mMeiNv = (MyView) findViewById(R.id.id_meinv);

        mQiQiu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mQiQiu.setType(MyView.TYPE_ROUND);
            }
        });

        mMeiNv.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                mMeiNv.setBorderRadius(90);
            }
        });
    }

}
