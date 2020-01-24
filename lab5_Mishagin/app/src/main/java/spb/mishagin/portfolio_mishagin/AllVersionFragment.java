package spb.mishagin.lab5_mishagin;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class AllVersionFragment extends Fragment {


    public AllVersionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_all_version, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter = new AndroidVersionAdapter(initializeData());
        recyclerView.setAdapter(adapter);

        return view;
    }

    private List<AndroidVersion> initializeData() {
        List<AndroidVersion> androidVersions = new ArrayList<>();
        androidVersions.add(new AndroidVersion("Android 1.5 Cupcake", R.drawable.cupcake));
        androidVersions.add(new AndroidVersion("Android 1.6 Donut", R.drawable.donut));
        androidVersions.add(new AndroidVersion("Android 2.0-2.1 Eclair", R.drawable.eclair));
        androidVersions.add(new AndroidVersion("Android 2.2 Froyo", R.drawable.froyo));
        androidVersions.add(new AndroidVersion("Android 2.3 Gingerbread", R.drawable.gingerbread));
        androidVersions.add(new AndroidVersion("Android 3.0 Honeycomb", R.drawable.honeycomb));
        androidVersions.add(new AndroidVersion("Android 4.0 Ice Cream Sandwich", R.drawable.ice_cream_sandwich));
        androidVersions.add(new AndroidVersion("Android 4.1-4.3 Jelly Bean", R.drawable.jelly_bean));
        androidVersions.add(new AndroidVersion("Android 4.4 KitKat", R.drawable.kit_kat));
        androidVersions.add(new AndroidVersion("Android 5.0 Lollipop", R.drawable.lollipop));
        androidVersions.add(new AndroidVersion("Android 6.0 Marshmallow", R.drawable.marshmallow));
        androidVersions.add(new AndroidVersion("Android 7.0 Nougat", R.drawable.nougat));
        androidVersions.add(new AndroidVersion("Android 8.0 Oreo", R.drawable.oreo));
        androidVersions.add(new AndroidVersion("Android 9.0 Pie", R.drawable.pie));
        androidVersions.add(new AndroidVersion("Android 10 Q", R.drawable.q));
        return androidVersions;
    }
}



