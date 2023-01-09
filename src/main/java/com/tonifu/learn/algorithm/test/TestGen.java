package com.tonifu.learn.algorithm.test;

import java.util.ArrayList;
import java.util.List;

public class TestGen {
    public static void main(String[] args) {
        List<? extends Person> list=new ArrayList<>();
        //list.add(new User(1));//上限限定符extends 存进去的元素不知道是那个子类的 所以不能存（不知道存的是那个子类） 只能取（因为子类可以强转成父类，父类不能强转子类 不知道那个子类 会出错）
        Person p=list.get(0);
        User a= (User) list.get(0);
        List<? super Person> list2=new ArrayList<>();
        list2.add(new User());
        Object u=list2.get(0);//只能是Object类型，所以存用super 下限限定符
    }


    /*public <T extends Person> T getPerson(List<? super Person> list){
        list.add(new User());

        return new User();
    }*/
}
