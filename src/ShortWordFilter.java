import java.awt.*;
public class ShortWordFilter implements Filter {
    public boolean accept(Object x) {
        if (x instanceof String) {
            String str = (String) x;
            return str.length() < 5;
        }
        return false;
    }
}
