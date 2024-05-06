import com.example.AlexTheLion;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class AlexTheLionTest {

    @Mock
    private Feline felineMock;

    private AlexTheLion alexTheLion;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        alexTheLion = new AlexTheLion("Самец", felineMock);
    }

    @Test
    public void testDoesHaveMane() {
        assertEquals(true, alexTheLion.doesHaveMane());
    }

    @Test
    public void testGetFriends() {
        assertEquals(Arrays.asList("Marty", "Gloria", "Melman"), alexTheLion.getFriends());
    }

    @Test
    public void testGetPlaceOfLiving() {
        assertEquals("New York Zoo", alexTheLion.getPlaceOfLiving());
    }

    @Test
    public void testGetKittens() {
        // Mock behavior for getKittens method
        when(felineMock.getKittens()).thenReturn(0);
        assertEquals(0, alexTheLion.getKittens());
    }
}
