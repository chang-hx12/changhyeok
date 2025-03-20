package com.example.edittext_text;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //에디트텍스트1 eText1;
    //에디트텍스트2 eText2;
    //에디트텍스트3 eText3;
    //버튼 eButton;
    //텍스트뷰1 eTextView1;
    //텍스트뷰2 eTextView2;
    //텍스트뷰3 eTextView3;

    private EditText eText1;
    private EditText eText2;
    private EditText eText3;

    private Button eButton;
    private TextView eTextView1;
    private TextView eTextView2;
    private TextView eTextView3;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        eText1 = (EditText) findViewById(R.id.editText1);
        eText2 = (EditText) findViewById(R.id.edittext2);
        eText3 = (EditText) findViewById(R.id.edittext3);

        eButton = (Button) findViewById(R.id.button);
        eTextView1 = (TextView) findViewById(R.id.textView1);
        eTextView2 = (TextView) findViewById(R.id.textView2);
        eTextView3 = (TextView) findViewById(R.id.textView3);

    }

    public void onClicked(View view) {
        String str1 = eText1.getText().toString();
        String str2 = eText2.getText().toString();
        String str3 = eText3.getText().toString();

        eTextView1.setText("아이디:"+str1);
        eTextView2.setText("비밀번호:"+str2);
        eTextView3.setText("전화번호:"+str3);
    }
}