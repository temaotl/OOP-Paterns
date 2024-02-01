package org.example.pattern;


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Создаем HashSet
        Set<String> hashSet = new HashSet<>();

        // Оборачиваем HashSet в InstrumentedSet
        InstrumentedSet<String> instrumentedSet = new InstrumentedSet<>(hashSet);

        // Добавляем элементы
        instrumentedSet.add("Apple");
        instrumentedSet.add("Banana");
        instrumentedSet.add("Orange");

        // Выводим количество добавленных элементов
        System.out.println("Добавлено элементов: " + instrumentedSet.getAddCount());

        // Добавляем группу элементов
        Set<String> anotherSet = new HashSet<>();
        anotherSet.add("Pineapple");
        anotherSet.add("Grape");

        instrumentedSet.addAll(anotherSet);

        // Выводим обновленное количество добавленных элементов
        System.out.println("Всего добавлено элементов: " + instrumentedSet.getAddCount());
    }
}
