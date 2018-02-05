package com.uninorte.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;


import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
public double numero, concatenar, resultado, sumando1, sumando2;
public String texto;
int count;
LinearLayout main;
public boolean suma= false, resta =false , mult = false, div =false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickLayout(View view) {
                generateLayout();
            }
    public void mostrar(int sum){

        TextView tvv= (TextView) findViewById(R.id.textView);
        tvv.setText(sum);
    }


    private void generateLayout() {
        LinearLayout linLayout = new LinearLayout(this);
        // specifying vertical orientation
        linLayout.setOrientation(LinearLayout.VERTICAL);
        // creating LayoutParams
        LinearLayout.LayoutParams linLayoutParam = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        // set LinearLayout as a root element of the screen
        setContentView(linLayout, linLayoutParam);
        LinearLayout.LayoutParams lpView = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams rightGravityParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        rightGravityParams.gravity = Gravity.RIGHT;
        TextView tv = new TextView(this);
        tv.setText("" + resultado);
        tv.setLayoutParams(lpView);
        linLayout.addView(tv);

        Button btn = new Button(this);
        btn.setText("Editar");
        linLayout.addView(btn,rightGravityParams);



        Button btn3= new Button (this);
        btn3.setText("OK");
        linLayout.addView(btn3,rightGravityParams);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //finish();
                setContentView(R.layout.activity_main);



            }



        });





    }



    public void onClickDEL(View miView){
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText("");

        TextView tv2 = (TextView) findViewById(R.id.textView2) ;
        tv2.setText("");
    }
    public void onClickBtn1(View miView)    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "1");
        sumando2 = 1;


    }
    public void onClickBtnRestar(View miView)    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        sumando1=Double.parseDouble((String)tv.getText());
        tv.setText(tv.getText() + "-");
        resta=true;
    }
    public void onClickBtnSumar(View miView)    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        sumando1=Double.parseDouble((String)tv.getText());
        tv.setText(tv.getText() + "+");
        suma=true;


    }
    public void onClickBtnMultiplicar(View miView){
        TextView tv = (TextView) findViewById(R.id.textView) ;
        sumando1=Double.parseDouble((String)tv.getText());
        tv.setText(tv.getText() + "*");
        mult=true;
    }
    public void onClickBtnDividir(View miView)    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        sumando1=Double.parseDouble((String)tv.getText());
        tv.setText(tv.getText() + "/");
        div=true;
    }
    public void onClickBtn2(View miView)    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "2");
        sumando2=2;


    }
    public void onClickBtn3(View miView)    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "3");
        sumando2=3;

    }
    public void onClickBtn4(View miView)    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "4");
        sumando2=4;
    }
    public void onClickBtn5(View miView)    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "5");
        sumando2=5;
    }
    public void onClickBtn6(View miView)    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "6");
        sumando2=6;
    }
    public void onClickBtn7(View miView)    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "7");
        sumando2=7;
    }
    public void onClickBtn8(View miView)    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "8");
        sumando2=8;
    }
    public void onClickBtn9(View miView)    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "9");
        sumando2=9;
    }
    public void onClickBtn0(View miView)    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + "0");
        sumando2=0;
    }
    public void onClickBtnPunto(View miView)    {
        TextView tv = (TextView) findViewById(R.id.textView) ;
        tv.setText(tv.getText() + ".");
    }

    public void onClickBtnResultado(View miView) {
        TextView tv = (TextView) findViewById(R.id.textView2);
        if (suma == true) {
            resultado=0;
            resultado = sumando1 + sumando2;
            tv.setText("" + resultado);
        }
        else{
                if (resta == true) {
                    resultado=0;
                    resultado = sumando1 - sumando2;
                    tv.setText("" + resultado);
                }
                else
                {
                    if(mult== true){
                        resultado=0;
                        resultado=(double)sumando1 * sumando2;
                        tv.setText("" + resultado);
                    }
                    else{
                        if (div==true){
                            resultado=0;
                            resultado = (double)sumando1/sumando2;
                            tv.setText("" + resultado);
                        }
                    }


                }
            }
        }

        }









