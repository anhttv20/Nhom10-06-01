package com.example.nhom10_06_01;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_b,container,false);
        return v;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final EditText eName;
        Button btA;
        eName=view.findViewById(R.id.tv);
        btA=view.findViewById(R.id.bt);
        btA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=eName.getText().toString();
                eName.setTextColor(Color.WHITE);
                eName.setText("Hello "+name+" from Fragment B");
            }
        });
    }
}
