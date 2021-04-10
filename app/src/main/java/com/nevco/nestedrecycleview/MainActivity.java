package com.nevco.nestedrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView messagesRecycleView;


    private ArrayList<DataModel> messageList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageList = new ArrayList<>();


        initRecycleView();

        populateArray();



    }



    public void populateArray(){

        DataModel dataModel1= new DataModel("Bob","18");

        messageList.add(dataModel1);




    }


    //set up RecycleView
    public void initRecycleView() {
        messagesRecycleView = findViewById(R.id.rv_main);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setStackFromEnd(true);
        //linearLayoutManager.setReverseLayout(true);
        messagesRecycleView.setLayoutManager(linearLayoutManager);
        HomeAdapter homeAdapter = new HomeAdapter(MainActivity.this, messageList);
        messagesRecycleView.setAdapter(homeAdapter);

    }
}
