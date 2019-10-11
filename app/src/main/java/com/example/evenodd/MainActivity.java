package com.example.evenodd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a[]={14,25,36,37,1,3,26,40};
        for (int i=0;i<a.length;i++){
            if (a[i]%2==0){
                System.out.println("Even number:"+a[i]);
            }else {
                System.out.println("odd numbers are:"+a[i]);
            }

        }
    }
}
