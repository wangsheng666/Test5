package com.example.a123.test5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recylerView);

    // 为提高性能，设置为条目大小为固定。
    mRecyclerView.setHasFixedSize(true);

    // use a linear layout manager
    mLayoutManager = new LinearLayoutManager(this);
    mRecyclerView.setLayoutManager(mLayoutManager);

    // specify an adapter
    String[] myDataset={"北京","上海","广州","深圳"};
    mAdapter = new MyAdapter(myDataset);
    mRecyclerView.setAdapter(mAdapter);
    }
}
