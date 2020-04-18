package com.abhishek.test_databinding;

import android.view.View;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

import static com.abhishek.test_databinding.R.drawable.ic_launcher_background;

public class Userentity {

    String name,imageurl;
    int age;


    public Userentity() {
    }

    public Userentity(String name, int age,String imageurl) {
        this.name = name;
        this.age = age;
        this.imageurl=imageurl;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    @BindingAdapter({"bind:img"})
    public static void loadimage(ImageView view, String imageurl){

        Glide.with(view.getContext()).load(imageurl).placeholder(ic_launcher_background).into((ImageView) view);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
