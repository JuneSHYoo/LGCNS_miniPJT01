package service;

import java.util.List;

import entity.Recipe;
import entity.User;

public interface RecipeService {	
	Recipe saveRecipe(Recipe recipe);
	List<Recipe> getAllRecipes();
	void softDeleteRecipe(Long recipId, User user);
	List<Recipe> getAllRecipesForAdmin();
}
