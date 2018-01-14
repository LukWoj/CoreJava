import java.util.*;
import java.io.*;

import java.util.Stack;

public class StackExample {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    System.out.println("Stos jest pusty? " + stack.empty());
    stack.push(1);
    System.out.println("Stos jest pusty? " + stack.empty());
    stack.push(2);
    System.out.println("Liczba na górze stosu to:" + stack.peek());
    System.out.println("Mo¿emy jeszcze raz zobaczyæ co jest na górze: " + stack.peek());
    System.out.println("Teraz wyci¹gamy ostatni elemet ze stosu: " + stack.pop());
    System.out.println("Kolejny element jaki mo¿ey pobraæ ze stosu to: " + stack.peek());
    System.out.println("Poniewa¿ u¿yliœmy metody peek() , na wierzchu stosu ci¹gle znajduje siê: " + stack.peek());
    System.out.println("Dobrze, wyci¹gnijmy w koñcu ten element: " + stack.pop());
    System.out.println("Stos jest pusty? " + stack.empty());
  }
}