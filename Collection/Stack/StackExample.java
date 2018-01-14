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
    System.out.println("Liczba na g�rze stosu to:" + stack.peek());
    System.out.println("Mo�emy jeszcze raz zobaczy� co jest na g�rze: " + stack.peek());
    System.out.println("Teraz wyci�gamy ostatni elemet ze stosu: " + stack.pop());
    System.out.println("Kolejny element jaki mo�ey pobra� ze stosu to: " + stack.peek());
    System.out.println("Poniewa� u�yli�my metody peek() , na wierzchu stosu ci�gle znajduje si�: " + stack.peek());
    System.out.println("Dobrze, wyci�gnijmy w ko�cu ten element: " + stack.pop());
    System.out.println("Stos jest pusty? " + stack.empty());
  }
}