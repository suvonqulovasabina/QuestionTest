package com.example.questiontest.presentation.Scrin;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.DialogFragment;

import com.example.questiontest.R;

public class MyDialog extends DialogFragment {
    private SelectEventListener listener;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_title2,container);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        AppCompatButton button=view.findViewById(R.id.yes_answer);
        AppCompatButton button1=view.findViewById(R.id.no_answer);
        button.setOnClickListener(v -> {
            dismiss();
        });
        button1.setOnClickListener(v -> {
           listener.clickFinish();
            dismiss();
        });

    }
    @Override
    public void onStart() {
        super.onStart();
        this.getDialog().getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);


        Window window = getDialog().getWindow();
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

    }
    public void setEventListener(SelectEventListener listener) {
        this.listener = listener;
    }
}
