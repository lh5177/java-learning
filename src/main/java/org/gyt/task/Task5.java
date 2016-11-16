package org.gyt.task;

/**
 * 作业五
 * 找出指定返回内的素数
 * <p>
 * 什么是素数？
 * 质数定义为在大于1的自然数中，除了1和它本身以外不再有其他因数的数称为质数。
 * <p>
 * 比如：
 * n = 3
 * 返回： 2,3
 * n = 5
 * 返回： 2,3,5
 * Created by y27chen on 2016/11/16.
 */
public interface Task5 {
    String getResult(int from, int to);
}
