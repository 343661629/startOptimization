package com.noahedu.myapplication;

import android.app.Application;
import android.util.Log;

import com.noahedu.launchertool.launchstarter.TaskDispatcher;
import com.noahedu.myapplication.task.TaskFour;
import com.noahedu.myapplication.task.TaskOne;
import com.noahedu.myapplication.task.TaskThrid;
import com.noahedu.myapplication.task.TaskTwo;

/**
 * @Description: java类作用描述
 * @Author: huangjialin
 * @CreateDate: 2020/7/10 9:59
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
//        Debug.startMethodTracing("MyApplication");
        long time = System.currentTimeMillis();

        //启动器初始化
        TaskDispatcher.init(this);
        TaskDispatcher dispatcher = TaskDispatcher.createInstance();
        //添加任务并开启启动器
        dispatcher.addTask(new TaskOne())
                .addTask(new TaskTwo())
                .addTask(new TaskThrid())
                .addTask(new TaskFour())
                .start();
        dispatcher.await();
        long cost = System.currentTimeMillis() - time;
        Log.e("MyApplication","----> " + cost);
//        Debug.stopMethodTracing();

    }





}
