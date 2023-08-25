import com.example.Cat;
import com.example.Feline;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private Cat cat;
    @Mock
    private Feline feline;

    @Before
    public void initFeline() {
        cat = new Cat(feline);
    }

    @Test
    public void catGetSoundTest() {
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void catEatMeatTest() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = cat.getFood();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
