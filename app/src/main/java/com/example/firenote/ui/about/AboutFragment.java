
package com.example.firenote.ui.about;
// NIM   : 10120133
// Nama  : Muhammad Saeful Rizki
// Kelas : IF - 4

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.firenote.R;
import com.example.firenote.adapter.ViewPagerAdapter;
import com.example.firenote.databinding.FragmentAboutBinding;
import com.google.android.material.tabs.TabLayout;


public class AboutFragment extends Fragment {

    private FragmentAboutBinding binding;
    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentAboutBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        viewPager = root.findViewById(R.id.viewpager);

        // setting up the adapter
        viewPagerAdapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager());

        // add the fragments
        viewPagerAdapter.add(new AboutPage1(), "Page 1");
        viewPagerAdapter.add(new AboutPage2(), "Page 2");


        // Set the adapter
        viewPager.setAdapter(viewPagerAdapter);

        tabLayout = root.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}