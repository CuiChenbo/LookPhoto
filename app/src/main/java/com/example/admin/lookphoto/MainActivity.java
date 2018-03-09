package com.example.admin.lookphoto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button bt;
    private final String[] PicLists = {"https://img3.doubanio.com/view/photo/photo/public/p1496018206.webp"
            ,"https://img3.doubanio.com/view/photo/photo/public/p1496020732.webp"
            ,"https://img3.doubanio.com/view/photo/photo/public/p1496020153.webp"
    ,"http://qimg.hxnews.com/2018/0215/1518657294799.jpeg"
    ,"http://5b0988e595225.cdn.sohucs.com/images/20171109/0a16944acb294ec8972e7c38d2d74da2.jpeg"
    ,"http://5b0988e595225.cdn.sohucs.com/images/20171206/59db59a757a843f8b1da383a126c5db7.jpeg"
    ,"http://p3.so.qhmsg.com/bdr/200_200_/t015c75e176d95a1918.gif"
    ,"http://p0.so.qhmsg.com/bdr/_240_/t01c42cbc5300b8b015.gif"};
    private List<String> datas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = findViewById(R.id.btn);
        datas = new ArrayList<>();
        for (int i = 0; i < PicLists.length; i++) {
            datas.add(PicLists[i]);
        }
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PhotoShowDialog photoShowDialog = new PhotoShowDialog(MainActivity.this,datas,5);
                photoShowDialog.show();
            }
        });
    }

}
