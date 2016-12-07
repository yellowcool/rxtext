package test.collyellow.runhua.rxjavatest.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by collyellow on 2016/12/7.
 */

public class ImageBean extends BaseObservable{
    public ImageBean(String imagUrl){
        this.imagUrl = imagUrl;
    }
    @Bindable
    public String getImagUrl() {
        return imagUrl;
    }

    public void setImagUrl(String imagUrl) {
        this.imagUrl = imagUrl;
    }

    private String imagUrl;
}
