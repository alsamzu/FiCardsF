package com.example.ficards;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.ficards.ui.AttendanceActivity;
import com.example.ficards.ui.BusActivity;
import com.example.ficards.ui.DisciplineActivity;
import com.example.ficards.ui.ExamsActivity;
import com.example.ficards.ui.FeesActivity;
import com.example.ficards.ui.HealthActivity;
import com.example.ficards.ui.NewsActivity;

public class MainFragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view= inflater.inflate(R.layout.main_menu_fragment, container, false);
        CardView attendance = view.findViewById(R.id.attendance);
        attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getActivity(), AttendanceActivity.class);
                startActivity(intent);
            }
        });

        CardView bus = view.findViewById(R.id.bus);
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getActivity(), BusActivity.class);
                startActivity(intent);
            }
        });

        CardView discipline = view.findViewById(R.id.discipline);
        discipline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getActivity(), DisciplineActivity.class);
                startActivity(intent);
            }
        });

        CardView exams = view.findViewById(R.id.exams);
        exams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getActivity(), ExamsActivity.class);
                startActivity(intent);
            }
        });

        CardView fees = view.findViewById(R.id.fees);
        fees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getActivity(), FeesActivity.class);
                startActivity(intent);
            }
        });

        CardView health = view.findViewById(R.id.health);
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getActivity(), HealthActivity.class);
                startActivity(intent);
            }
        });

        CardView news = view.findViewById(R.id.news);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getActivity(), NewsActivity.class);
                startActivity(intent);
            }
        });

        return view;


    }

}

