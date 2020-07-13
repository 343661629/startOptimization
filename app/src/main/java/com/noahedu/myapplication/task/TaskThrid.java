package com.noahedu.myapplication.task;

import android.util.Log;

import com.noahedu.launchertool.launchstarter.task.Task;

/**
 * @Description: java类作用描述
 * @Author: huangjialin
 * @CreateDate: 2020/7/10 16:58
 */
public class TaskThrid extends Task {


    @Override
    public void run() {
        try {
            Thread.sleep(3050);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.e("task","--TaskThrid--> " + Thread.currentThread().getName());
    }
}
