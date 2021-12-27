package com.yxy.optview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import com.yxy.apt_api.MyViewCreatorDelegate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //该方法会多次执行，通过复写这个方法，拦截掉每一个view的创建逻辑
    @Nullable
    @Override
    public View onCreateView(@NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
        //1、优先使用我们生成的类去进行 View 的创建
        View view = MyViewCreatorDelegate.getInstance().createView(name, context, attrs);
        if (view != null) {
            return view;
        }
        //2、一些系统的 View ,则走系统的一个创建流程
        return super.onCreateView(name, context, attrs);
    }
}