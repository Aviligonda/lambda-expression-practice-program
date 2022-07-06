package com.bridzelab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class NumberPlayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        // simple foreach implicit lambda function
        list.forEach(
                numbers -> System.out.println("Lambda Implicit ForEach  is :" + numbers)
        );
        // consumer class
        class MyConsumer implements Consumer<Integer> {
            public void accept(Integer i) {
                System.out.println("Consumer Class  is :" + i);
            }
        }
        MyConsumer action = new MyConsumer();
        list.forEach(action);
        // through iterating
        Iterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println("Through Iterator  is :" + i);
        }
        /// using anonymous class
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println("ForEach anonymous class is :" + i);
            }
        });
        // explicit lambda function
        Consumer<Integer> listAction = n -> {
            System.out.println("Lambda Foreach explicit is :" + n);
        };
        list.forEach(listAction);
        // input is integer value outPut is Double value
        Function<Integer, Double> toDoubleFunction = Integer::doubleValue;
        list.forEach(
                n -> System.out.println("Lambda forEach double value is :" + toDoubleFunction.apply(n))
        );
        // Print only Even Numbers
        Predicate<Integer> even = n -> n > 0 && n % 2 == 0;
        list.forEach(
                n -> System.out.println("For each value is :" + n + " check for even :" + even.test(n))
        );
        // using stream.forEach loop
        list.stream().forEach(
                n -> System.out.println("Stream forEach value is :" + n)
        );
        // store the double value using stream.map
        List<Double> doubleList = list.stream().map(toDoubleFunction).toList();
        System.out.println("Stream double list is :" + doubleList);
        // filter the data (greater than of 2 )print the integers
        List<Integer> integerList = list.stream().filter(n -> n > 2).toList();
        System.out.println("Filter the data :" + integerList);
    }

}

