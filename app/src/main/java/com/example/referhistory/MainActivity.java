package com.example.referhistory;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private String totalfee, month, date, hours, minutes;
    //private String[] item_name, quantity, item_price;

    private TextView textview_totalfee, textview_month, textview_date, textview_hours, textview_minutes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //DBから注文情報を取得する
        totalfee = "5200";
        month = "1";
        date = "11";
        hours = "18";
        minutes = "30";
        String[] item_name = {"パン", "オレンジ", "オランゲ"};
        String[] quantity = {"4", "2", "89"};
        String[] item_price = {"520", "1200", "800"};


        textview_totalfee = findViewById(R.id.textView_totalfee);
        textview_totalfee.setText(totalfee);

        textview_month = findViewById(R.id.textView_month);
        textview_month.setText(month);

        textview_date = findViewById(R.id.textView_date);
        textview_date.setText(date);

        textview_hours = findViewById(R.id.textView_hours);
        textview_hours.setText(hours);

        textview_minutes = findViewById(R.id.textView_minutes);
        textview_minutes.setText(minutes);

    }
}