package spb.mishagin.portfolio_mishagin;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutMeFragment extends Fragment {


    public AboutMeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_me, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        Objects.requireNonNull(getActivity()).setTitle("About me");
        Button buttonCall = view.findViewById(R.id.button_call);
        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri number = Uri.parse("tel: +79198889911");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    startActivity(callIntent);
            }
        });

        Button buttonMail = view.findViewById(R.id.button_email);
        buttonMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto",
                        "mi@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Vacancy");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Hi, we have a vacancy...");

                    startActivity(emailIntent);
                }
            });
        }
    }
