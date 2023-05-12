import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParamBunTest {
    private final String name;
    private final float price;

    public ParamBunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "Bun {index} -> Name: {0}, Price: {1} ")
    public static Object[][] dataForTest() {
        return new Object[][]{
                {"white bun", 100},
                {"blue bun", 200},
                {"red bun", 300},
                {"", 300},
                {"fghkljkапрлоьдлждэttyjkjklkl", 200},
                {null, 100},
                {"@#$%^^&&&*%$@#@@#%^&@errt", 200},
                {"blue bun", -100},
                {"blue bun", 0},
                {"blue bun", 0.01f},
                {"blue bun", 999999999},
                {"white 9876", 300},
                //{"bun", null}, // ошибка, если пустая цена

        };
    }

    @Test
    public void getNameReturnValidName() {
        Bun bun = new Bun(name, price);
        assertEquals(name, bun.getName());
    }

    @Test
    public void getPriceReturnValidPrice() {
        Bun bun = new Bun(name, price);
        assertEquals("Цена возвращается с ошибкой", price, bun.getPrice(), 0.0f);
    }
}
