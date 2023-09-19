import java.awt.*;
public class BigRectangleFilter implements Filter {
    public boolean accept(Object x) {
        if (x instanceof Rectangle) {
            Rectangle rect = (Rectangle) x;
            double rectPerimeter = 2 * rect.getWidth() + 2 * rect.getHeight();
            if(rectPerimeter > 10) {
                System.out.println(rect);
            }
        }
        return false;
    }
}
