package com.gktech.navigationgraph;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class SecondFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        return inflater.inflate(R.layout.navigation_second_fragment,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final NavController navController= Navigation.findNavController(getActivity(),R.id.my_nav_host_fragment);

        Button button=view.findViewById(R.id.button_frag5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // navController.navigate(R.id.action_secondFragment_to_thiredFragment);
            }
        });

      //  Product product=getArguments().getParcelable("obj");
      //  Toast.makeText(getActivity(),"this is  name:"+product.getQuality(),Toast.LENGTH_LONG).show();


    }
}
