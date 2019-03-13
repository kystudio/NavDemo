package com.kystudio.navdemo;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class Sub2Fragment extends Fragment {


    public Sub2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sub2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TextView tvInfo = view.findViewById(R.id.tv_info);
        tvInfo.setText(getArguments().getString("come_from"));
        Button button = view.findViewById(R.id.btn_goto_sub3);
        final NavController navController = Navigation.findNavController(view);
//        final Bundle bundle = new Bundle();
//        bundle.putString("come_from", "我来自sub2");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                navController.navigate(R.id.action_sub2_to_sub3, bundle);
                String comeFrom = "我来自sub2";
                NavDirections nd1 = Sub2FragmentDirections.actionSub2ToSub3(comeFrom);
                navController.navigate(nd1);
            }
        });
    }
}
