import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {


    @Spy
    private Feline feline = new Feline();


    @Test
    public void testEatMeat() throws Exception {
        when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
       assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
        System.out.println(feline.eatMeat());
    }



    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String family = feline.getFamily();
        assertEquals("Кошачьи", family);
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int kittens = feline.getKittens();
        assertEquals(1, kittens);
    }

    @Test
    public void testGetKittens_WithCount() {

        Feline feline = new Feline();
        int kittens = feline.getKittens(3);
        assertEquals(3, kittens);
    }
}
