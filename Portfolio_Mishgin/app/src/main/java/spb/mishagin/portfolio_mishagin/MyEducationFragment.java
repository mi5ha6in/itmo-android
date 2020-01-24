package spb.mishagin.portfolio_mishagin;


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
public class MyEducationFragment extends Fragment {


    public MyEducationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_education, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter = new EducationAdapter(initializeData());
        recyclerView.setAdapter(adapter);

        return view;
    }

    private List<Education> initializeData() {
        List<Education> educations = new ArrayList<>();
        educations.add(new Education("Gymnasium  №47", R.drawable.school));
        educations.add(new Education("Kurgan State University", R.drawable.kgu));
        educations.add(new Education("University ITMO", R.drawable.itmo));
        return educations;
    }
}



