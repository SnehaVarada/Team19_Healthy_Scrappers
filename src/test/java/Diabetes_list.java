

	import java.io.IOException;
	import java.util.ArrayList;

	import com.util.ExcelReader;

	public class Diabetes_list {
		
		public static ArrayList<String> eliminatedList = new ArrayList<String>();
		
		static boolean checkIngrediant(String i_Ingredient) {

			String p_Ingredient = i_Ingredient.toLowerCase();
			System.out.println("igredeintes coming" + p_Ingredient);

			eliminatedList.add("cream of rice");
			eliminatedList.add("rice flour");
			eliminatedList.add("rice rava");
			eliminatedList.add("corn");
			eliminatedList.add("sugar");
			eliminatedList.add("white rice");
			eliminatedList.add("white bread");
			eliminatedList.add("pasta");
			eliminatedList.add("soda");
			eliminatedList.add("flavoured water");
			eliminatedList.add("gatorade");
			eliminatedList.add("apple juice");
			eliminatedList.add("orange juice");
			eliminatedList.add("pomegranate juice");
			eliminatedList.add("flavoured curd");
			eliminatedList.add("yogurt");
			eliminatedList.add("corn flakes");
			eliminatedList.add("puffed rice");
			eliminatedList.add("bran flakes");
			eliminatedList.add("instant oatmeal");
			eliminatedList.add("honey");
			eliminatedList.add("maple syrup");
			eliminatedList.add("jaggery");
			eliminatedList.add("sweets");
			eliminatedList.add("candies");
			eliminatedList.add("chocolates");
			eliminatedList.add("refined");
			eliminatedList.add("all purpose flour");
			eliminatedList.add("alcoholic beverages");
			eliminatedList.add("bacon");
			eliminatedList.add("sausages");
			eliminatedList.add("hot dos");
			eliminatedList.add("deli meats");
			eliminatedList.add("chicken nuggets");
			eliminatedList.add("chciken patties");
			eliminatedList.add("bacon");
			eliminatedList.add("jams");
			eliminatedList.add("jelly");
			eliminatedList.add("mango");
			eliminatedList.add("cucumber");
			eliminatedList.add("tomatoes");
			eliminatedList.add("pineapple");
			eliminatedList.add("peaches");
			eliminatedList.add("mangos ");
			eliminatedList.add("pear");
			eliminatedList.add("mixed");
			eliminatedList.add("fruit");
			eliminatedList.add("mandarine");
			eliminatedList.add("oranges");
			eliminatedList.add("cherries");
			eliminatedList.add("chips");
			eliminatedList.add("mayonnaise");
			eliminatedList.add("palmolein oil");
			eliminatedList.add("powdered milk");
			eliminatedList.add("beans");
			eliminatedList.add("peas");
			eliminatedList.add("corn");
			eliminatedList.add("doughnuts");
			eliminatedList.add("cakes");
			eliminatedList.add("pastries");
			eliminatedList.add("cookies");
			eliminatedList.add("croissants");
			eliminatedList.add("sweetened tea");
			eliminatedList.add("coffee");
			eliminatedList.add("packaged snacks");
			eliminatedList.add("soft drinks");
			eliminatedList.add("banana");
			eliminatedList.add("melon");
			eliminatedList.add("dairy milk");
			eliminatedList.add("butter");
			eliminatedList.add("cheese");



			

			boolean isIngrediant= true;
			for (String v : eliminatedList) {
				if (p_Ingredient.contains(v)) // p_Ingredient
				{
					System.out.println("Eliminated::" + p_Ingredient + "because of " + v + "recepid" + "");
					isIngrediant = false;
					break;
				}
			}

			return isIngrediant;

		}
		public static ArrayList<String> addOnList=new  ArrayList<String>();
		
		 static boolean checkAddOns(String b_Ingredient) 
		
		{
			addOnList.add("brocoli");
			addOnList.add("pumpkin");
			addOnList.add("pumpkin seeds");
			addOnList.add("chia seeds");
			addOnList.add("Apples");
			addOnList.add("nuts");
			addOnList.add("ladys finger/okra");
			addOnList.add("beans");
			addOnList.add("Berries");
			addOnList.add("strawberries");
			addOnList.add("blue berries");
			addOnList.add("blackberries");
			addOnList.add("yogurt");
			addOnList.add("eggs");
			addOnList.add("Bitter gourd");
			addOnList.add("rolled oats");
			addOnList.add("chicken");
			addOnList.add("fish");
			addOnList.add("quinoa");
			addOnList.add("mushrooms");
			
			boolean isIngredientAdds=true;
			//String isIngrediant="";
			String a_Ingredient = b_Ingredient.toLowerCase();
			System.out.println("igredeintes coming" + a_Ingredient);

			
			for (String v : addOnList) 
			{
				if (a_Ingredient.contains(v)) // p_Ingredient
				{
					System.out.println("Add ons" + a_Ingredient + "because of " + v + "recepid" + "");
					
				 return isIngredientAdds;
				}
			}
			return false;
			}
		
		
		
		}
		
		




