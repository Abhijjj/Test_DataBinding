package com.abhishek.test_databinding;

import android.app.Application;
import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class Mainviewmodel extends AndroidViewModel {

  MainView mainView;

    MutableLiveData<Userentity> userentityMutableLiveData=new MutableLiveData<>();
   private Userentity userentity;
    public Mainviewmodel(@NonNull Application application) {
        super(application);

        userentity=new Userentity("abhishek",123,"https://cdn.pixabay.com/photo/2020/04/10/23/17/waterfall-5028130_960_720.jpg");

        userentityMutableLiveData.setValue(userentity);


    }

    public Mainviewmodel(@NonNull Application application, MainView mainView) {
        super(application);
        this.mainView = mainView;
    }

    public void click(View view){

        mainView.success();
    }

    public Userentity getUserentity(){


        return userentityMutableLiveData.getValue();
    }


}
