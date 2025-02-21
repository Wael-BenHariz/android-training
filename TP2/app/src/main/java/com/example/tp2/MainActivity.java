package com.example.tp2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    private EditText note1,note2,note3;
    private TextView coef1,coef2,coef3;
    private float res;


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

        this.note1=(EditText)findViewById(R.id.note1);
        this.note2=(EditText)findViewById(R.id.note2);
        this.note3=(EditText)findViewById(R.id.note3);

        this.coef1=(TextView)findViewById(R.id.coef1);
        this.coef2=(TextView)findViewById(R.id.coef2);
        this.coef3=(TextView)findViewById(R.id.coef3);




    }
    public void moyenne(View v){
        String n1=this.note1.getText().toString();
        String n2=this.note2.getText().toString();
        String n3=this.note3.getText().toString();
        String c1=this.coef1.getText().toString();
        String c2=this.coef2.getText().toString();
        String c3=this.coef3.getText().toString();

        double res = (Float.parseFloat(n1)*Float.parseFloat(c1)+Float.parseFloat(n2)*Float.parseFloat(c2)+Float.parseFloat(n3)*Float.parseFloat(c3))/3;

        System.out.println(res);

    }
}