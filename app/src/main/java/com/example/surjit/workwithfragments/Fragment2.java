package com.example.surjit.workwithfragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {


    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Toast.makeText(getActivity(),"onCreateView Fragment 2 Started",Toast.LENGTH_SHORT).show();
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment2, container, false);

        Button b = v.findViewById(R.id.but22);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.frag, new Fragment1(), "First");
                ft.commit();

            }
        });
        return v;
    }

    /*
        @Override
        public void onAttach(Context context) {
            super.onAttach(context);
            Toast.makeText(getActivity(),"onAttach Fragment Started", Toast.LENGTH_SHORT).show();
        }
    */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(),"onCreate Fragment 2 Started",Toast.LENGTH_SHORT).show();
    }
    /*
        @Override
        public void onActivityCreated(@Nullable Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            Toast.makeText(getActivity(),"onActivityCreated 2  Fragment Started",Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onStart() {
            super.onStart();
            Toast.makeText(getActivity(),"onStart  Fragment 2 Started",Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onResume() {
            super.onResume();
            Toast.makeText(getActivity(),"onResume  Fragment 2 Started",Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onPause() {
            super.onPause();
            Toast.makeText(getActivity(),"onPause  Fragment 2 Started",Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onStop() {
            super.onStop();
            Toast.makeText(getActivity(),"onStop  Fragment 2 Started",Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            Toast.makeText(getActivity(),"onDestroyView Fragment  2 Started",Toast.LENGTH_SHORT).show();
        }
    */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getActivity(),"onDestroy Fragment 2 Started",Toast.LENGTH_SHORT).show();
    }
/*
    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(getActivity(),"onDetach  Fragment 2 Started",Toast.LENGTH_SHORT).show();
    }*/
}


