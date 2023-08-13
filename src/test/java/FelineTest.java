import com.example.Feline;
import org.junit.Test;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;

public class FelineTest {

    @Before
    public void initFeline() {
        Feline feline = new Feline();
    }

    @Test
    public void felineEatMeatTest() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void felineGetFamilyTest() {
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void felineGetKittensTest() {
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void felineGetKittensCountTest() {
        int expected = 10;
        int actualResult = feline.getKittens(10);
        Assert.assertEquals(expectedResult, actualResult);
    }
}