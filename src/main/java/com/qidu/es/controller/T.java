package com.qidu.es.controller;

import javax.swing.tree.TreeNode;

public class T {

    public int judge(TreeNode root){
        // 定义快慢指针
        int slow = 0 , fast = 0;
        while (!root.next()){
            slow = root.next;
            fast = root.next.next;
            if(slow == fast){
                return 1;
            }
        }
        return -1;
    }

}
