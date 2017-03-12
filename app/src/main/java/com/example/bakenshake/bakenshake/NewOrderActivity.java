package com.example.bakenshake.bakenshake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

public class NewOrderActivity extends AppCompatActivity {

    private EditText name,number,flavour,weight,message;
    private Button order;
    private CheckBox eggless;
    private DatePicker date;
    private TimePicker time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_order);

        name = (EditText) findViewById(R.id.cust_name);
        number = (EditText) findViewById(R.id.cust_number);
        flavour = (EditText) findViewById(R.id.flavour);
        weight = (EditText) findViewById(R.id.weight);
        message = (EditText) findViewById(R.id.cake_message);

        order = (Button) findViewById(R.id.place_order);

        eggless = (CheckBox)findViewById(R.id.eggless);

        date = (DatePicker) findViewById(R.id.delivery_date);

        time = (TimePicker) findViewById(R.id.delivery_time);
    }
}
