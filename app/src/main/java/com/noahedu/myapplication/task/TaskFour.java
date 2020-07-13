package com.noahedu.myapplication.task;

import com.noahedu.launchertool.launchstarter.task.Task;

/**
 * @Description: java类作用描述
 * @Author: huangjialin
 * @CreateDate: 2020/7/10 16:58
 */
public class TaskFour extends Task {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
