package learn;

import javax.swing.plaf.basic.BasicTreeUI;

public class MyHashSet {

    private  boolean[] arr;



    public MyHashSet() {
        this.arr=new boolean[10*10*10*10*10*10+1];
    }

    private void remove(int i) {
        this.arr[i]=false;
    }

    private boolean contains(int i) {
        return this.arr[i];
    }

    private void add(int i) {
        this.arr[i]=true;
    }

    public static void main(String[] args) {

        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        System.out.println("myHashSet.contains(1) = " + myHashSet.contains(1));
        System.out.println("myHashSet.contains(3) = " + myHashSet.contains(3));
        myHashSet.add(2);      // set = [1, 2]
        System.out.println("myHashSet.contains(2) = " + myHashSet.contains(2));
        myHashSet.remove(2);   // set = [1]
        System.out.println("myHashSet.contains(2) = " + myHashSet.contains(2));

    }
}
