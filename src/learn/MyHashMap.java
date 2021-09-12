package learn;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyHashMap {
    private int[] valueSet;


    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        this.valueSet = new int[10 * 10 * 10 * 10 * 10 * 10 + 1];
        Arrays.fill(valueSet,-1);
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        this.valueSet[key] = value;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        return this.valueSet[key];
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        this.valueSet[key] = -1;
    }

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1); // myHashMap 现在为 [[1,1]]
        myHashMap.put(2, 2); // myHashMap 现在为 [[1,1], [2,2]]
        System.out.println("myHashMap.get(1) = " + myHashMap.get(1));
        System.out.println("myHashMap.get(3) = " + myHashMap.get(3));
        myHashMap.put(2, 1); // myHashMap 现在为 [[1,1], [2,1]]（更新已有的值）
        System.out.println("myHashMap.get(2) = " + myHashMap.get(2));
        myHashMap.remove(2); // 删除键为 2 的数据，myHashMap 现在为 [[1,1]]
        System.out.println("myHashMap.get(2) = " + myHashMap.get(2));


    }
}
