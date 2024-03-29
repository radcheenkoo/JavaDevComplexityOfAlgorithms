package org.example;


/**
 * Просторова складність:
 *
 * Просторова складність алгоритму становить 0(1),
 * тому що використовується лише константна кількість змінних,
 * яка не залежна від розміру вхідних данних
 * (просторова складність не змінюється зі зростанням розміру вхідних даних).
 *
 *
 * Часова складність:
 *
 * Часова складність алгоритму дорівнює 0(n),
 * тому що ітерація циклу вимагає певного часу,
 * тут виконуються лише проста арифметична дія(додавання).
 *
 *
 * Короткий опис до алгоритму:
 *
 * Ітераційний підхід є ефективним з точки зору просторової
 * та часової складностей. Так як він використовує
 * постійну кількість пам'яті та вимагає
 * лінійної кількості операцій для обчислення.
 *
 * */
public class FibonacciIterative {
    public int calculateFibonacci(int n){
        if (n <= 1){
            return n;
        }
        int prevValue = 0;
        int currentValue = 1;

        for (int i = 2; i <= n; i++){
            int temp = currentValue;
            currentValue = prevValue + currentValue;
            prevValue = temp;
        }

        return currentValue;
    }
}
