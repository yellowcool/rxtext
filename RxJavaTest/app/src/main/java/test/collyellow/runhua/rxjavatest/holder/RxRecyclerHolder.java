package test.collyellow.runhua.rxjavatest.holder;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * Created by collyellow on 2016/12/7.
 */

public class RxRecyclerHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {
    private T binding;
    public RxRecyclerHolder(T binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public T getBinding(){
        return binding;
    }
}
