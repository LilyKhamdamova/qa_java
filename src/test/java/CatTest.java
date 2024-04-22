import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline mockFeline;

    @Test
    public void testGetSound() {
        Cat cat = new Cat(mockFeline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {

        when(mockFeline.eatMeat()).thenReturn(Arrays.asList("мясо"));
        Cat cat = new Cat(mockFeline);

        List<String> food = cat.getFood();
        assertEquals(Arrays.asList("мясо"), food);
    }
}
