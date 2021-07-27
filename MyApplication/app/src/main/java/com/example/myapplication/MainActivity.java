package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button button0;
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;
    public Button button_sum;
    public Button button_diff;
    public Button button_mul;
    public Button button_div;
    public Button button_equal;
    public Button button_clear;
    public TextView tv;
    public static String function_call(String one,String two,char op)
    {
        float op1 = Float.parseFloat(one);
        float op2 = Float.parseFloat(two);
        switch (op)
        {
            case '+':
                float ans = op1 + op2;
                String s = Float.toString(ans);
                return s;
            case '-':
                float ans1 = op1-op2;
                String s1 = Float.toString(ans1);
                return s1;
            case '*':
                float ans2 = op1*op2;
                String s2 = Float.toString(ans2);
                return s2;
            case '/':
                float ans3 = (float)op1/op2;
                String s3 = Float.toString(ans3);
                return s3;
            default:
                return "-1:error";
        }
    }
    public static boolean check(String s)
    {
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i) =='+' || s.charAt(i)=='-' || s.charAt(i) =='*' || s.charAt(i) =='/' )
                return false;
            i++;
        }
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button_sum = findViewById(R.id.buttonsum);
        button_diff = findViewById(R.id.buttonminus);
        button_mul = findViewById(R.id.buttonmul);
        button_div = findViewById(R.id.buttondiv);
        button_clear = findViewById(R.id.buttonclear);
        button_equal = findViewById(R.id.buttonequal);
        tv = findViewById(R.id.textView2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tv.getText().toString();
                if(s.equals("0")){ s = "1";
                  tv.setText(s);  }
                else{
                s = s+"1";
                tv.setText(s);}
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tv.getText().toString();
                if(s.equals("0")){ s = "2";
                    tv.setText(s);  }
                else{
                s = s+"2";
                tv.setText(s);}
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tv.getText().toString();
                if(s.equals("0")){ s = "3";
                    tv.setText(s);  }
                else{
                s = s+"3";
                tv.setText(s);}
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tv.getText().toString();
                if(s.equals("0")){ s = "4";
                    tv.setText(s);  }
                else{
                s = s+"4";
                tv.setText(s);}
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tv.getText().toString();
                if(s.equals("0")){ s = "5";
                    tv.setText(s);  }
                else{
                s = s+"5";
                tv.setText(s);}
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tv.getText().toString();
                if(s.equals("0")){ s = "6";
                    tv.setText(s);  }
                else{
                s = s+"6";
                tv.setText(s);}
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tv.getText().toString();
                if(s.equals("0")){ s = "7";
                    tv.setText(s);  }
                else{
                s = s+"7";
                tv.setText(s);}
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tv.getText().toString();
                if(s.equals("0")){ s = "8";
                    tv.setText(s);  }
                else{
                s = s+"8";
                tv.setText(s);}
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tv.getText().toString();
                if(s.equals("0")){ s = "9";
                    tv.setText(s);  }
                else{
                s = s+"9";
                tv.setText(s);}
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tv.getText().toString();
                if(s.equals("0")){ s = "0";
                    tv.setText(s);  }
                else{
                s = s+"0";
                tv.setText(s);}
            }
        });
        button_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tv.getText().toString();
                if(s.charAt(s.length()-1) !='+' && s.charAt(s.length()-1)!='-' && s.charAt(s.length()-1) !='*' && s.charAt(s.length()-1) !='/' )
                s = s+"+";
                tv.setText(s);
            }
        });
        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tv.getText().toString();
                if(s.charAt(s.length()-1) !='+' && s.charAt(s.length()-1)!='-' && s.charAt(s.length()-1) !='*' && s.charAt(s.length()-1) !='/' )
                s = s+"/";
                tv.setText(s);
            }
        });
        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tv.getText().toString();
                if(s.charAt(s.length()-1) !='+' && s.charAt(s.length()-1)!='-' && s.charAt(s.length()-1) !='*' && s.charAt(s.length()-1) !='/' )
                s = s+"*";
                tv.setText(s);
            }
        });
        button_diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tv.getText().toString();
                if(s.charAt(s.length()-1) !='+' && s.charAt(s.length()-1)!='-' && s.charAt(s.length()-1) !='*' && s.charAt(s.length()-1) !='/' )
                s = s+"-";
                tv.setText(s);
            }
        });
        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tv.getText().toString();
                s = "0";
                tv.setText(s);
            }
        });
        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = tv.getText().toString();
                if(check(s))
                {
                    tv.setText(s);
                }
                else{
                int i=0;
                String s1 ="";
                while(s.charAt(i)!='+' && s.charAt(i)!='-' && s.charAt(i)!='*' && s.charAt(i)!='/')
                {
                    s1 = s1 + s.charAt(i);
                    i++;
                }
                char operator = s.charAt(i);
                i++;
                while(i<s.length())
                {
                    String s2 = "";
                    while(s.charAt(i)!='+' && s.charAt(i)!='-' && s.charAt(i)!='*' && s.charAt(i)!='/')
                    {
                        s2 = s2 + s.charAt(i);
                        i++;
                        if(i==s.length())
                            break;
                    }
                    s1 = function_call(s1,s2,operator);
                    if(i!=s.length()){
                    operator = s.charAt(i);
                    i++;}
                }
                tv.setText(s1);}
            }
        });
    }

}