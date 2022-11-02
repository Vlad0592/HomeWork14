import java.util.HashSet;
import java.util.Set;

public class RecipeBook {
    private Set<Recipe> recipeBook;


    public RecipeBook() {
        recipeBook = new HashSet<>();
    }

    public Set<Recipe> getRecipeBook() {
        return recipeBook;
    }

    public void addProduct(Recipe recipes) {
        if (!recipeBook.add(recipes)) {
            throw new RuntimeException();

        }
    }
}
