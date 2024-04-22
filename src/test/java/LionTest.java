import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LionTest {

    private final Feline felineMock;
    private Lion lion;

    public LionTest() {
        this.felineMock = mock(Feline.class);
    }

    @Before
    public void setUp() throws Exception {
        lion = new Lion("Самец", felineMock);
    }

    @Test
    public void testGetKittens() {
        when(felineMock.getKittens()).thenReturn(3);
        assertEquals(3, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        when(felineMock.getFood("Хищник")).thenReturn(expectedFood);
        assertEquals(expectedFood, lion.getFood());
    }

    @Test
    public void testInvalidSex() {
        try {
            new Lion("Невалидный", felineMock);
            fail("Expected an Exception to be thrown for invalid sex");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }
}
