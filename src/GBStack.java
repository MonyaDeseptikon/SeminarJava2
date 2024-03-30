//Реализовать стэк с помощью массива.
//Нужно реализовать методы:
//size(), empty(), push(), peek(), pop().


//Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке,
// а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.Scanner;

public class GBStack {
    int top = -1;
    int capacity = 2;
    int size = 0;
    int[] array = new int[capacity];

    private void addCapacity() {
        capacity = capacity * 2;
        int[] temp = new int[capacity];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private boolean isFull() {
        return capacity == size;
//        if(capacity==size) return true;
//        else return false;
    }

    public void push(int value) {
        if (isFull()) addCapacity();
        array[++top] = value;
        size++;
    }

    public int peek() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty");
        else return array[top];
    }

    public int pop() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty");
        size--;
        return array[top--];
    }

    @Override
    public String toString() {
        if(isEmpty()) return "[]";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            builder.append(array[i]).append(", ");
        }

        builder.delete(builder.length() - 2, builder.length());
        return String.format("[%s]", builder);
    }
}

class MainStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GBStack stack  = new GBStack();
        while (true){
            int input = scanner.nextInt();
            if(input==-1)break;
            stack.push(input);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    public static boolean isInputPrint(int value){
        return value==-1;
    }

}