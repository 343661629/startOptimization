package com.noahedu.myapplication.task;

import android.util.Log;

import com.noahedu.launchertool.launchstarter.task.Task;

/**
 * @Description: java类作用描述
 * @Author: huangjialin
 * @CreateDate: 2020/7/10 16:57
 */
public class TaskOne extends Task {

    @Override
    public boolean needWait() {
        return true;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.e("task","--TaskOne--> " + Thread.currentThread().getName());
    }
}
