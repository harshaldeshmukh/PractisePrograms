package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderBinaryTree {

    public static class Tree{
        int data;
        Tree left;
        Tree right;

        public Tree(int data) {
            this.data = data;
        }
    }


    public static void main(String[] args) {


        Tree startNode= creatBinaryTree();

        Queue<Tree> queue = new LinkedList<>();
        queue.add(startNode);
        if(startNode==null){
            return;
        }
        while (!queue.isEmpty()) {
            Tree tempNode = queue.poll();
            System.out.printf("%d ", tempNode.data);
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }


    }


    public static Tree creatBinaryTree(){
        Tree root= new Tree(80);
        Tree node20=new Tree(20);
        Tree node10=new Tree(10);
        Tree node30=new Tree(30);
        Tree node60=new Tree(60);
        Tree node50=new Tree(50);
        Tree node70=new Tree(70);


        root.left=node20;
        root.left.left=node10;
        root.left.right=node30;
        root.right=node60;
        root.right.left=node50;
        root.right.right=node70;

        return  root;
    }
}
