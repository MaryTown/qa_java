import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void lionGetKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expectedResult = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualResult = lion.getKittens();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void lionDoesHaveMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean expectedResult = true;
        boolean actualResult = lion.doesHaveMane();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void femaleLionDoesHaveNoMane() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean expectedResult = false;
        boolean actualResult = lion.doesHaveMane();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void doesHaveManeByIncorrectSex() {
        boolean hasException = false;
        try {
            new Lion("Другое", feline);
        } catch (Exception e) {
            hasException = true;
        }
        Assert.assertTrue(hasException);
    }

    @Test
    public void lionEatMeatTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = lion.getFood();
        Assert.assertEquals(expectedResult, actualResult);
    }
}