package spb.mishagin.grumpycat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerView.Adapter adapter = new GrumpyCatAdapter(generateCats());
        recyclerView.setAdapter(adapter);
    }

    private List<GrumpyCat> generateCats() {
        List<GrumpyCat> grumpyCats = new ArrayList<>();
        grumpyCats.add(new GrumpyCat("1", "https://i.imgur.com/whrgItd.jpg"));
        grumpyCats.add(new GrumpyCat("2", "https://i.imgur.com/Iz38ukY.png"));
        grumpyCats.add(new GrumpyCat("3", "https://i.imgur.com/a6XzD.jpg"));
        return grumpyCats;
    }
}
