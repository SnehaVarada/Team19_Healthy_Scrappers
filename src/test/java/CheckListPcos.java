package smartScrapper;

	
	
	import java.io.IOException;
	import java.util.ArrayList;

	import smartScrapper.ExcelReader;
	public class CheckListPcos {


	public static ArrayList<String> eliminatedList = new ArrayList<String>();
		
		static boolean checkIngrediant(String i_Ingredient) {

			String p_Ingredient = i_Ingredient.toLowerCase();
			System.out.println("igredeintes coming" + p_Ingredient);

			eliminatedList.add("cakes");
			eliminatedList.add("pastries");
			eliminatedList.add("white bread");
			eliminatedList.add("fried food");
			eliminatedList.add("pizza");
			eliminatedList.add("burger");
			eliminatedList.add("sweets");
			eliminatedList.add("icecreams");
			eliminatedList.add("soda");
			
			eliminatedList.add("red meat");
			eliminatedList.add("processed meat");
			eliminatedList.add("dairy");
			eliminatedList.add("soy products");
		    eliminatedList.add("gluten");
			eliminatedList.add("pasta");
			eliminatedList.add("white rice");
			eliminatedList.add("doughnuts");
			eliminatedList.add("fries");
			eliminatedList.add("coffee");
			eliminatedList.add("vegetable oil");
			eliminatedList.add("soybean oil");
			eliminatedList.add("canola oil");
			eliminatedList.add("rapeseed oil");
			eliminatedList.add("sunflower oil");
			
			boolean isIngrediant = true;
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
			addOnList.add("tomatoes");
			addOnList.add("cucumber");
			addOnList.add("carrot");
			addOnList.add("banana");
			addOnList.add("apple");
			addOnList.add("orange");
			addOnList.add("beetroot");
			addOnList.add("watermelon");
			addOnList.add("kiwi");
			
			
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
