public class Stack {

  private int[] data;
  private int top;

  public Stack(int size) {
      data = new int[size];
      top = -1;
  }

  public boolean isEmpty() {
      return top == -1;
  }

  public boolean isFull() {
      return top == data.length - 1;
  }

  public void push(char element) {
      if (isFull()) {
          System.out.println("Stack is full!");
          return;
      }

      top++;
      data[top] = element;
  }

  public char pop() {
      if (isEmpty()) {
          System.out.println("Stack is empty!");
          return (char) -1;
      }

      char element = data[top];
      top--;
      return element;
  }

  public void print() {
      if (isEmpty()) {
          System.out.println("Stack is empty!");
          return;
      }

      for (int i = top; i >= 0; i--) {
          System.out.print(data[i]);
      }

      System.out.println();
  }
}
