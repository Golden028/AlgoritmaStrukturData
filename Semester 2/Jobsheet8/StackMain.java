public class StackMain {
  public static void main(String[] args) {
      String sentence = "Politeknik Negeri Malang";

      Stack stack = new Stack(sentence.length());

      for (char c : sentence.toCharArray()) {
          stack.push(c);
      }

      System.out.println("Original Sentence: " + sentence);

      String reversedSentence = "";
      while (!stack.isEmpty()) {
          reversedSentence += stack.pop();
      }

      System.out.println("Reversed Sentence: " + reversedSentence);
  }
}
