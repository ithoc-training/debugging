import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RectangleTest {

    @Test
    void perimeter() {

        // given
        int a = 5;
        int b = 10;

        // when
        Rectangle rectangle = new Rectangle(a, b);

        // then
        assertEquals(30, rectangle.perimeter());
    }


    @Test
    void area() {

            // given
            int a = 5;
            int b = 10;

            // when
            Rectangle rectangle = new Rectangle(a, b);

            // then
            assertEquals(50, rectangle.area());
    }

}