package org.gyt.liuh.impl;

import org.gyt.task.Task3;

/**
 * 作业三
 * 返回一个从1到n组成的字符串，格式如下：
 * 如果n=100
 * 1,2,3,4,...,97,98,99,100
 * Created by 刘洪 on 2016-11-23.
 */

public class Practice3Impl implements Task3 {
/*    private int count;
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }*/
    public String getValues(int count) {
        StringBuffer str=new StringBuffer();
        for (int i = 1; i <= count; i++) {
            str.append(i);
            if(i!=count){
                str.append(",");
            }
        }
        return str.toString();
    }
}

