package spb.mishagin.lab3_mishagin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecycleView();
    }

    private void initRecycleView() {
        RecyclerView recyclerView = findViewById(R.id.recycle_view);
        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerView.Adapter adapter = new ListAdapter(generateImages());
        recyclerView.setAdapter(adapter);
    }

    private List<ImageItem> generateImages() {
        List<ImageItem> imageItems = new ArrayList<>();
        imageItems.add(new ImageItem("https://i.imgur.com/2KxoIsa.jpg"));
        imageItems.add(new ImageItem("https://i.imgur.com/EZHXbA0.jpg"));
        imageItems.add(new ImageItem("https://i.imgur.com/qb7Ev7A.jpg"));
        imageItems.add(new ImageItem("https://i.imgur.com/ZtXXAwX.jpg"));
        imageItems.add(new ImageItem("https://i.imgur.com/lrE9vha.jpg"));
        imageItems.add(new ImageItem("https://i.imgur.com/S66rx9n.jpg"));
        imageItems.add(new ImageItem("https://i.imgur.com/KaSkWef.jpg"));
        imageItems.add(new ImageItem("https://i.imgur.com/jp5z1s0.jpg"));
        imageItems.add(new ImageItem("https://i.imgur.com/iLNrl9Z.jpg"));
        imageItems.add(new ImageItem("https://i.imgur.com/Z3ei74h.jpg"));
        imageItems.add(new ImageItem("https://i.imgur.com/uXbb81d.jpg"));
        imageItems.add(new ImageItem("https://i.imgur.com/92mT0BB.jpg"));
        return imageItems;
    }
}
