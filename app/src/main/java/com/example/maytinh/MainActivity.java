package com.example.maytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String a , b;
    boolean flag = false;
    EditText A, B;
    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,cal,_reset,_exit;
    RadioButton cong,tru,nhan,chia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = "";
        b = "";
        A = (EditText) findViewById(R.id.tbA);
        B = (EditText) findViewById(R.id.tbB);
        bt0 = (Button) findViewById(R.id.zero);
        bt1 = (Button) findViewById(R.id.one);
        bt2 = (Button) findViewById(R.id.two);
        bt3 = (Button) findViewById(R.id.three);
        bt4 = (Button) findViewById(R.id.four);
        bt5 = (Button) findViewById(R.id.five);
        bt6 = (Button) findViewById(R.id.six);
        bt7 = (Button) findViewById(R.id.seven);
        bt8 = (Button) findViewById(R.id.eight);
        bt9 = (Button) findViewById(R.id.nine);
        cal = (Button) findViewById(R.id.cal);
        _reset = (Button) findViewById(R.id.reset);
        _exit = (Button) findViewById(R.id.exit);
        cong = (RadioButton) findViewById(R.id.cong);
        tru = (RadioButton) findViewById(R.id.tru);
        nhan = (RadioButton) findViewById(R.id.nhan);
        chia = (RadioButton) findViewById(R.id.chia);

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    flag = true;
            }

        });

        A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    flag = true;
                }
            }
        });

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = false;
            }

        });

        B.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    flag = false;
                }
            }
        });
    }

    public void Zero_Click(View v)
    {
        if(flag)
        {
            a += bt0.getText().toString();
            a = KT_Input(a);
            A.setText(a);
        }
        else
        {
            b += bt0.getText().toString();
            b = KT_Input(b);
            B.setText(b);
        }

    }

    public String KT_Input(String s)
    {
        if(s.indexOf("0") == 0)
        {
            s = "";
            return s;
        }
        return s;
    }

    public void One_Click(View v)
    {
        if(flag)
        {
            a += bt1.getText().toString();
            A.setText(a);
        }
        else
        {
            b += bt1.getText().toString();
            B.setText(b);
        }
    }

    public void Two_Click(View v)
    {
        if(flag)
        {
            a += bt2.getText().toString();
            A.setText(a);
        }
        else
        {
            b += bt2.getText().toString();
            B.setText(b);
        }
    }

    public void Three_Click(View v)
    {
        if(flag)
        {
            a += bt3.getText().toString();
            A.setText(a);
        }
        else
        {
            b += bt3.getText().toString();
            B.setText(b);
        }
    }

    public void four_Click(View v)
    {
        if(flag)
        {
            a += bt4.getText().toString();
            A.setText(a);
        }
        else
        {
            b += bt4.getText().toString();
            B.setText(b);
        }
    }

    public void Five_Click(View v)
    {
        if(flag)
        {
            a += bt5.getText().toString();
            A.setText(a);
        }
        else
        {
            b += bt5.getText().toString();
            B.setText(b);
        }
    }

    public void Six_Click(View v)
    {
        if(flag)
        {
            a += bt6.getText().toString();
            A.setText(a);
        }
        else
        {
            b += bt6.getText().toString();
            B.setText(b);
        }
    }

    public void Seven_Click(View v)
    {
        if(flag)
        {
            a += bt7.getText().toString();
            A.setText(a);
        }
        else
        {
            b += bt7.getText().toString();
            B.setText(b);
        }
    }

    public void Eight_Click(View v)
    {
        if(flag)
        {
            a += bt8.getText().toString();
            A.setText(a);
        }
        else
        {
            b += bt8.getText().toString();
            B.setText(b);
        }
    }

    public void Nine_Click(View v)
    {
        if(flag)
        {
            a += bt9.getText().toString();
            A.setText(a);
        }
        else
        {
            b += bt9.getText().toString();
            B.setText(b);
        }
    }

    public void  Reset_Click(View v)
    {
        a = "";
        b = "";
        A.setText("");
        B.setText("");
    }

    public void Exit_Click(View v)
    {
        System.exit(0);
    }

    public void Cal_Click(View v)
    {
        try {
            if(A.getText().toString().isEmpty() && B.getText().toString().isEmpty())
                Toast.makeText(MainActivity.this,"Hãy nhập dữ liệu", Toast.LENGTH_LONG).show();
            else
                if(A.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this, "Result : " + B.getText().toString(), Toast.LENGTH_LONG).show();
                else
                    if(B.getText().toString().isEmpty())
                        Toast.makeText(MainActivity.this, "Result : " + A.getText().toString(), Toast.LENGTH_LONG).show();
                    else
                    {
                        double a = Double.parseDouble(A.getText().toString());
                        double b = Double.parseDouble(B.getText().toString());
                        double s;
                        if (cong.isChecked())
                            s = a + b;
                        else if (tru.isChecked())
                            s = a - b;
                        else if (nhan.isChecked())
                            s = a * b;
                        else
                            s = a / b;
                Toast.makeText(MainActivity.this, "Result : " + String.valueOf(s), Toast.LENGTH_LONG).show();
            }
        }
        catch (Exception e)
        {
            Toast.makeText(MainActivity.this,"Số nhập quá lớn", Toast.LENGTH_LONG).show();
        }
    }
    public void X2_Click(View v)
    {
        double a;
        double b;
        try {
            if(A.getText().toString().isEmpty() && B.getText().toString().isEmpty())
                Toast.makeText(MainActivity.this,"Hãy nhập dữ liệu", Toast.LENGTH_LONG).show();
            else
            if(A.getText().toString().isEmpty())
            {
                b = Double.parseDouble(B.getText().toString());
                B.setText(String.valueOf((b*b)));
            }
            else
            if(B.getText().toString().isEmpty())
            {
                a = Double.parseDouble(A.getText().toString());
                A.setText(String.valueOf((a*a)));
            }
            else
            {
                b = Double.parseDouble(B.getText().toString());
                a = Double.parseDouble(A.getText().toString());
                if(flag)
                    A.setText(String.valueOf((a*a)));
                else
                    B.setText(String.valueOf((b*b)));
            }
        }
        catch (Exception e)
        {
            Toast.makeText(MainActivity.this,"Số nhập quá lớn", Toast.LENGTH_LONG).show();
        }
    }

    public void Log_Click(View v)
    {
        double a;
        double b;
        try {
            if(A.getText().toString().isEmpty() && B.getText().toString().isEmpty())
                Toast.makeText(MainActivity.this,"Hãy nhập dữ liệu", Toast.LENGTH_LONG).show();
            else
            if(A.getText().toString().isEmpty())
            {
                b = Double.parseDouble(B.getText().toString());
                B.setText(String.valueOf(Math.log(b)));
            }
            else
            if(B.getText().toString().isEmpty())
            {
                a = Double.parseDouble(A.getText().toString());
                A.setText(String.valueOf(Math.log(a)));
            }
            else
            {
                b = Double.parseDouble(B.getText().toString());
                a = Double.parseDouble(A.getText().toString());
                if(flag)
                    A.setText(String.valueOf(Math.log(a)));
                else
                    B.setText(String.valueOf(Math.log(b)));
            }
        }
        catch (Exception e)
        {
            Toast.makeText(MainActivity.this,"Số nhập quá lớn", Toast.LENGTH_LONG).show();
        }
    }

    public void Sqrt_Click(View v)
    {
        double a;
        double b;
        try {
            if(A.getText().toString().isEmpty() && B.getText().toString().isEmpty())
                Toast.makeText(MainActivity.this,"Hãy nhập dữ liệu", Toast.LENGTH_LONG).show();
            else
            if(A.getText().toString().isEmpty())
            {
                b = Double.parseDouble(B.getText().toString());
                B.setText(String.valueOf(Math.sqrt(b)));
            }
            else
            if(B.getText().toString().isEmpty())
            {
                a = Double.parseDouble(A.getText().toString());
                A.setText(String.valueOf(Math.sqrt(a)));
            }
            else
            {
                b = Double.parseDouble(B.getText().toString());
                a = Double.parseDouble(A.getText().toString());
                if(flag)
                    A.setText(String.valueOf(Math.sqrt(a)));
                else
                    B.setText(String.valueOf(Math.sqrt(b)));
            }
        }
        catch (Exception e)
        {
            Toast.makeText(MainActivity.this,"Số nhập quá lớn", Toast.LENGTH_LONG).show();
        }
    }

    public void PT_Click(View v)
    {
        Toast.makeText(MainActivity.this,"error",Toast.LENGTH_LONG).show();
    }
}
