package java10_14;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-14
 * Time:19:18
 **/
class Node1 {
    public char val;
    public  Node1 left;
    public Node1 right;

    public Node1(char val){

        this.val = val;
    }

}
public class Tree {
    public static int height(Node1 root){
        if (root == null){
            return 0;
        }
        int left = height(root.left) +1;
        int right = height(root.right)+1;
        return Math.max(left,right)+1;
    }
    public static void print(Node root){
        if (root == null){
            return;
        }
        Queue<Node1> queue = new LinkedList<>();


    }

}
