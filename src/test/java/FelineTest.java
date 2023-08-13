import com.example.Feline;
import org.junit.Test;
import java.util.List;
import org.junit.Assert;

public class FelineTest {

    @Test
    public void felineEatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void felineGetFamilyTest() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void felineGetKittensTest() {
        Feline feline = new Feline();
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void felineGetKittensCountTest() {
        Feline feline = new Feline();
        int expectedResult = 10;
        int actualResult = feline.getKittens(10);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
