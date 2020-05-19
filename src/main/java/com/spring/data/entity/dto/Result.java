package com.spring.data.entity.dto;

public class Result {


    private String name;
    private int sum;
    private int count;

    public Result() {
    }

    public Result(String name, long sum, long count) {
        this.name = name;
        this.sum = (int) sum;
        this.count = (int) count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Result{" +
                "name='" + name + '\'' +
                ", sum=" + sum +
                ", count=" + count +
                '}';
    }
}
