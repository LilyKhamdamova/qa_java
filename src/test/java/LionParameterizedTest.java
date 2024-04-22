import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;
    private final boolean expectedHasMane;
    private final Feline felineMock;

    private Lion lion;

    public LionParameterizedTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
        this.felineMock = mock(Feline.class);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Самец", true},  // Male lion should have mane
                {"Самка", false}  // Female lion should not have mane
        });
    }

    @Before
    public void setUp() throws Exception {
        lion = new Lion(sex, felineMock);
    }

    @Test
    public void testDoesHaveMane() {
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}
