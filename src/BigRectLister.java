import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {

    public static void main(String[] args) {
        ArrayList rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(10, 5));
        rectangles.add(new Rectangle(20, 10));
        rectangles.add(new Rectangle(5, 15));
        rectangles.add(new Rectangle(1, 1));
        rectangles.add(new Rectangle(2, 2));
        rectangles.add(new Rectangle(3, 3));
        rectangles.add(new Rectangle(10, 10));
        rectangles.add(new Rectangle(15, 15));
        rectangles.add(new Rectangle(20, 20));
        rectangles.add(new Rectangle(25, 25));

        BigRectangleFilter rectangleFilter = new BigRectangleFilter();

        for(Object rectangle: rectangles) {
            rectangleFilter.accept(rectangle);
        }
    }
}
