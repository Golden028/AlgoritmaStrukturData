public class ArrayOfObjects {
  public static void main(String[] args) {
    Rectangle[] rectangleArray = new Rectangle[3];

    rectangleArray[0] = new Rectangle();
    rectangleArray[0].length = 110;
    rectangleArray[0].width = 30;

    rectangleArray[1] = new Rectangle();
    rectangleArray[1].length = 80;
    rectangleArray[1].width = 30;

    rectangleArray[2] = new Rectangle();
    rectangleArray[2].length = 100;
    rectangleArray[2].width = 20;

    System.out.println("First rectangle, width: " + rectangleArray[0].width + ", lenght: " + rectangleArray[0].length);
    System.out.println("Second rectangle, width: " + rectangleArray[1].width + ", lenght: " + rectangleArray[1].length);
    System.out.println("Third rectangle, width: " + rectangleArray[2].width + ", lenght: " + rectangleArray[2].length);

  }
}
