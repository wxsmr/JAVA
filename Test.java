package cn.qianfeng.demo;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        HashSet hashSet = new HashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedList linkedList = new LinkedList();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();

        int x = 100;
        Integer x2 = new Integer(1);

        Stack stack = new Stack();
        PriorityQueue priorityQueue = new PriorityQueue();

        //1. 控制集合元素类型
        ArrayList<Employee> arrayList2 = new ArrayList<Employee>();
        for (Employee e: arrayList2) {
            String[] arr = {};
            e.saveMoney(arr);
        }

        LinkedHashMap<String,Employee> linkedHashMap = new LinkedHashMap<String,Employee>();

        //1.集合存入8个对象，不同id,通过id给集合中元素排序（升序）
        ArrayList<Employee> arrayList = new ArrayList<Employee>();
        arrayList.add(new Employee(1));
        arrayList.add(new Employee(3));
        arrayList.add(new Employee(2));
        arrayList.add(new Employee(4));
        arrayList.add(new Employee(5));
        arrayList.add(new Employee(8));
        arrayList.add(new Employee(11));
        arrayList.add(new Employee(13));



        int[] mixArr = {1,3,8,7,5,4,2,6};
        Employee[] employeeArr = {new Employee(1),new Employee(3),new Employee(2),new Employee(4)};
        Arrays.sort(employeeArr);
        for (Employee e:employeeArr) {
            System.out.println(e);
        }


        //使用  go  java  js  三选一，写一个排序算法，冒泡除外
        System.out.println(arrayList);
    }
}
