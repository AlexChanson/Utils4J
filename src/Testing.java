import com.alexsxode.utilities.collection.MultiSet;

import java.awt.*;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        MultiSet<Color> colors = new MultiSet<>();
        MultiSet<Rectangle> rectangles = new MultiSet<>();
        colors.add(new Color(1,2,3));
        System.out.println(((ParameterizedType) colors.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0]);
        System.out.println(rectangles.getClass());
        System.out.println(colors.getClass() == rectangles.getClass());
        System.out.println(colors.containsAll(rectangles));
    }

}
