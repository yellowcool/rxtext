package test.collyellow.runhua.rxjavatest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import test.collyellow.runhua.rxjavatest.adapter.RxRecyclerAdapter;
import test.collyellow.runhua.rxjavatest.bean.ImageBean;
import test.collyellow.runhua.rxjavatest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private List<ImageBean> list = new ArrayList<>();
    private RxRecyclerAdapter adapter;

    public class Presenter {
        public void downLoad(View view) {
            for (int i = 0; i < 20; i++) {
                list.add(new ImageBean("http://img5.imgtn.bdimg.com/it/u=4155302816,1201715785&fm=21&gp=0.jpg"));
                list.add(new ImageBean("http://img3.imgtn.bdimg.com/it/u=4271053251,2424464488&fm=23&gp=0.jpg"));
            }
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setPresenter(new Presenter());
        adapter = new RxRecyclerAdapter(list);
        binding.recyclerview.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        binding.recyclerview.setAdapter(adapter);
    }
}
