package com.example.androidevennumberlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewNumber;
    ArrayList<Integer> sochang = new ArrayList<Integer>();
    int[] numbers = new int[100];
    int dem = 0;
    int i = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewNumber = findViewById(R.id.recyclerview_id);
        recyclerViewNumber.setLayoutManager(new LinearLayoutManager((this)));
        final NumberAdapter numberAdapter = new NumberAdapter();
        recyclerViewNumber.setAdapter(numberAdapter);

        do {
            if (i % 2 == 0) {
                sochang.add(i);
                dem++;
            }
            i++;
        } while (dem < numbers.length);

        numberAdapter.numbers = sochang;
    }
}
