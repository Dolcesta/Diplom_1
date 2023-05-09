import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class IngredientTest {
    @Mock
    IngredientType type;
    private Ingredient ingredient;
    private final String NAME = "tlf";
    private final float PRICE = 3.14f;

    @Before
    public void setUp() {
        ingredient = new Ingredient(type, NAME, PRICE);
    }

    @Test
    public void getPriceTest() {
        Assert.assertEquals(PRICE, ingredient.getPrice(), 0);
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals(NAME, ingredient.getName());
    }

    @Test
    public void getType() {
        Assert.assertEquals(type, ingredient.getType());
    }
}