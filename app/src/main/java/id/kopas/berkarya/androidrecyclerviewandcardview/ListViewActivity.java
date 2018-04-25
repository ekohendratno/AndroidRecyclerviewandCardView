package id.kopas.berkarya.androidrecyclerviewandcardview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class ListViewActivity extends AppCompatActivity {

    private RecyclerView horizontalList;
    private RecyclerView verticalList;
    private HorizontalListAdapter horizontalAdapter;
    private VerticalListAdapter verticalAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        horizontalList = findViewById(R.id.horizontal_recycler);
        verticalList = findViewById(R.id.recyle_view);

        // horizontalList.setHasFixedSize(true);
        //verticalList.setHasFixedSize(true);

        //set horizontal LinearLayout as layout manager to creating horizontal list view
        LinearLayoutManager horizontalManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        horizontalList.setLayoutManager(horizontalManager);
        horizontalAdapter = new HorizontalListAdapter(this);
        horizontalList.setAdapter(horizontalAdapter);

        //set vertical LinearLayout as layout manager for vertial listview
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        verticalList.setLayoutManager(layoutManager);
        verticalAdapter = new VerticalListAdapter(this);
        verticalList.setAdapter(verticalAdapter);
    }
}