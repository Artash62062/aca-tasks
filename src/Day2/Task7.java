package Day2;

/**
 * @author Artash-PC on 4/27/2021
 * @product IntelliJ IDEA
 * @project FirstLesson
 */
public class Task7 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,25);
        RightAngledTriangle triangle = new RightAngledTriangle(15,84);
        Square square = new Square(5);
        System.out.println("Triangle Area = " + triangle.getArea() + "square Area = "+ square.getArea() + "rectangle Area = " + rectangle.getArea());
    }
}

class RightAngledTriangle {
    private int sideA;
    private int sideB;

    public RightAngledTriangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getArea() {
        return this.sideA*this.sideB/2;
    }

}

class Square {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getArea() {
        return side*side;
    }
}

class Rectangle {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getArea (){
        return this.sideA*this.sideB;
    }
}