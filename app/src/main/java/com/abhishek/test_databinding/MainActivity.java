package com.abhishek.test_databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;

import com.abhishek.test_databinding.R;
import com.abhishek.test_databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements MainView {
    ActivityMainBinding activityMainBinding;
   Mainviewmodel mainviewmodel,mainviewmodel1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding=DataBindingUtil.setContentView(this, R.layout.activity_main);


           mainviewmodel= ViewModelProviders.of(this).get(Mainviewmodel.class);
           mainviewmodel1=new Mainviewmodel(getApplication(),this);

//hi my name is ahiishek
       activityMainBinding.setClickinmain(mainviewmodel1);

String name="my name is Abhishek krishnatrye123";
String gender="Male";
Boolean True=false;
    }


    @Override
    public void success() {
        activityMainBinding.setMainviewmodel(mainviewmodel);

    }
}
