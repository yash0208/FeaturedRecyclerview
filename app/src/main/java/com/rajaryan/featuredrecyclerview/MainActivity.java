package com.rajaryan.featuredrecyclerview;


import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import shivam.developer.featuredrecyclerview.FeatureLinearLayoutManager;
import shivam.developer.featuredrecyclerview.FeaturedRecyclerView;

public class MainActivity extends AppCompatActivity {

    List<String> dummyData = new ArrayList<>();
    FeaturedRecyclerView featuredRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createDummyDataList();

        featuredRecyclerView = (FeaturedRecyclerView) findViewById(R.id.featured_recycler_view);

        FeatureLinearLayoutManager layoutManager = new FeatureLinearLayoutManager(this);
        featuredRecyclerView.setLayoutManager(layoutManager);

        CustomRecyclerViewAdapter adapter = new CustomRecyclerViewAdapter();
        adapter.swapData(dummyData);

        featuredRecyclerView.setAdapter(adapter);
    }

    private void createDummyDataList() {
        for (int i = 1; i <= 20; i++) {
            dummyData.add("Item " + i);
        }
    }
}
