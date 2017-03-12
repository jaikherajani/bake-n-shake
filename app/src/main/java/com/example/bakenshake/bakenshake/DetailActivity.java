package com.example.bakenshake.bakenshake;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    private TextView order_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        order_no = (TextView) findViewById(R.id.search_result);

        Intent intent = getIntent();
        String order_id = intent.getStringExtra("ORDER_ID");

        displayData(order_id);
    }

    private void displayData(String order_id) {
            //use the query to search your data somehow
            Toast.makeText(this, "You Searched : "+order_id, Toast.LENGTH_SHORT).show();
            order_no.setText(order_id);
    }
}
