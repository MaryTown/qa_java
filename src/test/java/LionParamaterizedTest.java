import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParamaterizedTest {

    private final boolean hasMane;
    private final String sex;
    private Feline feline;

    public LionParamaterizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;

    }

    @Parameterized.Parameters
    public static Object[][] hasMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Before
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void doesHasManeReturnCorrectResult() throws Exception {
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(hasMane, lion.doesHaveMane());
    }

}