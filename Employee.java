package cn.qianfeng.demo;

public class Employee<T> implements Comparable<Employee> {
    private int id;
    private int age;

    public Employee() {
    }

    public Employee(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public T[] saveMoney(T[] arr) {
        return arr;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.id - employee.getId();
    }


//    public int compareTo(Employee o) {
//        return this.id - o.getId();
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我被回收了");
        super.finalize();
    }
}
