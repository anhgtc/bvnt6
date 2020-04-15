package com.example.currency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerList1,spinnerList2;
    Button butDot,but0,but1,but2,but3,but4,but5,but6,but7,but8,but9,butCE;
    ImageButton butDel;
    TextView txtValue1,txtValue2;
    String ss,ss1,ss2,money1,money2;
    Double number1,number2;
    DecimalFormat dcf = new DecimalFormat("###,###,###,###.####");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerList1 = (Spinner) findViewById(R.id.spinner1);
        spinnerList2 = (Spinner) findViewById(R.id.spinner2);
        butDot = (Button) findViewById(R.id.butDot);
        butDel = (ImageButton) findViewById(R.id.butDEL);
        butCE = (Button) findViewById(R.id.butCE);
        but0 = (Button) findViewById(R.id.but0);
        but1 = (Button) findViewById(R.id.but1);
        but2 = (Button) findViewById(R.id.but2);
        but3 = (Button) findViewById(R.id.but3);
        but4 = (Button) findViewById(R.id.but4);
        but5 = (Button) findViewById(R.id.but5);
        but6 = (Button) findViewById(R.id.but6);
        but7 = (Button) findViewById(R.id.but7);
        but8 = (Button) findViewById(R.id.but8);
        but9 = (Button) findViewById(R.id.but9);
        txtValue1 = (TextView) findViewById(R.id.txtvalue1);
        txtValue2 = (TextView) findViewById(R.id.txtvalue2);

        money1 = "VNĐ";
        money2 = "VNĐ";


        final ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("VNĐ");
        arrayList.add("Dollar");
        arrayList.add("Pound");
        arrayList.add("Euro");
        arrayList.add("Yuan");



        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item, arrayList);

        spinnerList1.setAdapter(arrayAdapter);
        spinnerList2.setAdapter(arrayAdapter);
        spinnerList1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                money1 = arrayList.get(position);
                number1 = Double.parseDouble(txtValue1.getText().toString());
                number2 = number1*change(money1,money2);
                ss2 = String.valueOf(dcf.format(number2));
                txtValue2.setText(ss2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinnerList2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                money2 = arrayList.get(position);
                number1 = Double.parseDouble(txtValue1.getText().toString());
                number2 = number1*change(money1,money2);
                ss2 = String.valueOf(dcf.format(number2));
                txtValue2.setText(ss2);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        butCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtValue1.setText("0");
                txtValue2.setText("0");
            }
        });
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ss1 = txtValue1.getText()+"0";
                if(ss1.charAt(0) =='0'&&txtValue1.getText().toString().indexOf(".")==-1) ss1 = ss1.substring(1);
                txtValue1.setText(ss1);
                number1 = Double.parseDouble(txtValue1.getText().toString());
                number2 = number1*change(money1,money2);
                ss2 = String.valueOf(dcf.format(number2));
                txtValue2.setText(ss2);

            }
        });
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ss1 = txtValue1.getText()+"1";
                if(ss1.charAt(0) =='0'&&txtValue1.getText().toString().indexOf(".")==-1) ss1 = ss1.substring(1);
                txtValue1.setText(ss1);
                number1 = Double.parseDouble(txtValue1.getText().toString());
                number2 = number1*change(money1,money2);
                ss2 = String.valueOf(dcf.format(number2));
                txtValue2.setText(ss2);

            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ss1 = txtValue1.getText()+"2";
                if(ss1.charAt(0) =='0'&&txtValue1.getText().toString().indexOf(".")==-1) ss1 = ss1.substring(1);
                txtValue1.setText(ss1);
                number1 = Double.parseDouble(txtValue1.getText().toString());
                number2 = number1*change(money1,money2);
                ss2 = String.valueOf(dcf.format(number2));
                txtValue2.setText(ss2);

            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ss1 = txtValue1.getText()+"3";
                if(ss1.charAt(0) =='0'&&txtValue1.getText().toString().indexOf(".")==-1) ss1 = ss1.substring(1);
                txtValue1.setText(ss1);
                number1 = Double.parseDouble(txtValue1.getText().toString());
                number2 = number1*change(money1,money2);
                ss2 = String.valueOf(dcf.format(number2));
                txtValue2.setText(ss2);

            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ss1 = txtValue1.getText()+"4";
                if(ss1.charAt(0) =='0'&&txtValue1.getText().toString().indexOf(".")==-1) ss1 = ss1.substring(1);
                txtValue1.setText(ss1);
                number1 = Double.parseDouble(txtValue1.getText().toString());
                number2 = number1*change(money1,money2);
                ss2 = String.valueOf(dcf.format(number2));
                txtValue2.setText(ss2);

            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ss1 = txtValue1.getText()+"5";
                if(ss1.charAt(0) =='0'&&txtValue1.getText().toString().indexOf(".")==-1) ss1 = ss1.substring(1);
                txtValue1.setText(ss1);
                number1 = Double.parseDouble(txtValue1.getText().toString());
                number2 = number1*change(money1,money2);
                ss2 = String.valueOf(dcf.format(number2));
                txtValue2.setText(ss2);

            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ss1 = txtValue1.getText()+"6";
                if(ss1.charAt(0) =='0'&&txtValue1.getText().toString().indexOf(".")==-1) ss1 = ss1.substring(1);
                txtValue1.setText(ss1);
                number1 = Double.parseDouble(txtValue1.getText().toString());
                number2 = number1*change(money1,money2);
                ss2 = String.valueOf(dcf.format(number2));
                txtValue2.setText(ss2);

            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ss1 = txtValue1.getText()+"7";
                if(ss1.charAt(0) =='0'&&txtValue1.getText().toString().indexOf(".")==-1) ss1 = ss1.substring(1);
                txtValue1.setText(ss1);
                number1 = Double.parseDouble(txtValue1.getText().toString());
                number2 = number1*change(money1,money2);
                ss2 = String.valueOf(dcf.format(number2));
                txtValue2.setText(ss2);

            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ss1 = txtValue1.getText()+"8";
                if(ss1.charAt(0) =='0'&&txtValue1.getText().toString().indexOf(".")==-1) ss1 = ss1.substring(1);
                txtValue1.setText(ss1);
                number1 = Double.parseDouble(txtValue1.getText().toString());
                number2 = number1*change(money1,money2);
                ss2 = String.valueOf(dcf.format(number2));
                txtValue2.setText(ss2);

            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ss1 = txtValue1.getText()+"9";
                if(ss1.charAt(0) =='0'&&txtValue1.getText().toString().indexOf(".")==-1) ss1 = ss1.substring(1);
                txtValue1.setText(ss1);
                number1 = Double.parseDouble(txtValue1.getText().toString());
                number2 = number1*change(money1,money2);
                ss2 = String.valueOf(dcf.format(number2));
                txtValue2.setText(ss2);

            }
        });
        butDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtValue1.getText().toString().indexOf(".")==-1) {
                    ss1 = txtValue1.getText() + ".";
                    txtValue1.setText(ss1);
                    number1 = Double.parseDouble(txtValue1.getText().toString());
                    number2 = number1 * change(money1, money2);
                    ss2 = String.valueOf(dcf.format(number2));
                    txtValue2.setText(ss2);
                }

            }
        });

        butDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtValue1.setText(txtValue1.getText().toString().substring(0,txtValue1.getText().toString().length()-1));
                if (txtValue1.getText().toString().length()==0) txtValue1.setText("0");
                number1 = Double.parseDouble(txtValue1.getText().toString());
                number2 = number1*change(money1,money2);
                ss2 = String.valueOf(dcf.format(number2));
                txtValue2.setText(ss2);
            }
        });

    }
    protected Double change(String s1, String s2){
        if(s1.equals("VNĐ")){
            switch (s2){
                case "VNĐ": return 1.0;
                case "Dollar": return 0.00004261;
                case "Pound": return 0.00003385;
                case "Euro": return 0.00003883;
                case "Yuan": return 0.0003003;
            }
        } else
        if(s1.equals("Dollar")){
            switch (s2){
                case "VNĐ": return 23471.00;
                case "Dollar": return 1.0;
                case "Pound": return 0.7946;
                case "Euro": return 0.9114;
                case "Yuan": return 7.0484;
            }
        } else
        if(s1.equals("Pound")){
            switch (s2){
                case "VNĐ": return 29538.1324;
                case "Dollar": return 1.2585;
                case "Pound": return 1.0;
                case "Euro": return 1.147;
                case "Yuan": return 8.8704;
            }
        } else
        if(s1.equals("Euro")){
            switch (s2){
                case "VNĐ": return 25752.6882;
                case "Dollar": return 1.0972;
                case "Pound": return 0.8718;
                case "Euro": return 1.0;
                case "Yuan": return 7.7336;
            }
        } else
        if(s1.equals("Yuan")){
            switch (s2){
                case "VNĐ": return 3329.9756;
                case "Dollar": return 0.1419;
                case "Pound": return 0.1127;
                case "Euro": return 0.1293;
                case "Yuan": return 1.0;
            }
        }
        return 0.0;
    }
}
