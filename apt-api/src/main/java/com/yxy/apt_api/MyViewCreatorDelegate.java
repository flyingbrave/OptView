package com.yxy.apt_api;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;


public class MyViewCreatorDelegate implements IMyViewCreator{

    private IMyViewCreator mIMyViewCreator;

    //================================== 单例 start =====================================
    @SuppressWarnings("all")
    private MyViewCreatorDelegate(){
        try {
            // 通过反射拿到 Apt 生成的类
            Class aClass = Class.forName("com.dream.aptdemo.MyViewCreatorImpl");
            mIMyViewCreator = (IMyViewCreator) aClass.newInstance();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static MyViewCreatorDelegate getInstance(){
        return Holder.MY_VIEW_CREATOR_DELEGATE;
    }

    private static final class Holder{
        private static final MyViewCreatorDelegate MY_VIEW_CREATOR_DELEGATE = new MyViewCreatorDelegate();
    }
    //================================== 单例 end =======================================



    @Override
    public View createView(String name, Context context, AttributeSet attributeSet) {
        if(mIMyViewCreator != null){
            return mIMyViewCreator.createView(name, context, attributeSet);
        }
        return null;
    }
}
