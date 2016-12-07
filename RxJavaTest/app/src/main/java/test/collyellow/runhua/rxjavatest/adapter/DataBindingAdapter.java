package test.collyellow.runhua.rxjavatest.adapter;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import test.collyellow.runhua.rxjavatest.App;

/**
 * Created by collyellow on 2016/12/7.
 */

public class DataBindingAdapter {
    @BindingAdapter({"bind:imageUrl","bind:error"})
    public static void loadImage(ImageView imageView, String url, Drawable error){
        Glide.with(App.context)
                .load(url)
                .placeholder(error)
                .into(imageView);
    }
}
