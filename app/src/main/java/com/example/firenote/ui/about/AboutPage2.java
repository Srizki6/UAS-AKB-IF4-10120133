
package com.example.firenote.ui.about;
// NIM   : 10120133
// Nama  : Muhammad Saeful Rizki
// Kelas : IF - 4

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.firenote.R;


public class AboutPage2 extends Fragment {


    public AboutPage2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_page2, container, false);
    }
}