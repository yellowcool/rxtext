package test.collyellow.runhua.rxjavatest.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import test.collyellow.runhua.rxjavatest.App;
import test.collyellow.runhua.rxjavatest.BR;
import test.collyellow.runhua.rxjavatest.R;
import test.collyellow.runhua.rxjavatest.bean.ImageBean;
import test.collyellow.runhua.rxjavatest.holder.RxRecyclerHolder;

/**
 * Created by collyellow on 2016/12/7.
 */

public class RxRecyclerAdapter extends RecyclerView.Adapter<RxRecyclerHolder> {
    private List<ImageBean> list;
    public RxRecyclerAdapter(List<ImageBean> list){
        this.list = list;
    }

    @Override
    public RxRecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(App.context), R.layout.recycler_item, parent, false);
        return new RxRecyclerHolder(binding);
    }

    @Override
    public void onBindViewHolder(RxRecyclerHolder holder, int position) {
        holder.getBinding().setVariable(BR.item, list.get(position));
        holder.getBinding().executePendingBindings();

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
