

	import java.io.IOException;
	import java.util.ArrayList;

	import com.util.ExcelReader;

	public class CheckListHBP {
		
		public static ArrayList<String> eliminatedList = new ArrayList<String>();
		
		static boolean checkIngrediant(String i_Ingredient) {

			String p_Ingredient = i_Ingredient.toLowerCase();
			System.out.println("igredeintes coming" + p_Ingredient);

			eliminatedList.add("salt");
			eliminatedList.add("chips");
			eliminatedList.add("pretzel");
			eliminatedList.add("crackers");
			eliminatedList.add("coffee");
			eliminatedList.add("tea");
			eliminatedList.add("caffeine");
			eliminatedList.add("alcohol");
			eliminatedList.add("soft Drink");
			eliminatedList.add("frozen food");
			eliminatedList.add("pickles");
			eliminatedList.add("processed food");
			eliminatedList.add("canned food");
			eliminatedList.add("fries");
		    eliminatedList.add("sauces");
			eliminatedList.add("mayonnaise");
			eliminatedList.add("white bread");
			eliminatedList.add("white rice");
			

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
			addOnList.add("banana");
			addOnList.add("choclate");
			addOnList.add("cinnamon");
			addOnList.add("yogurt");
			addOnList.add("nuts");
			addOnList.add("pistachios");
			addOnList.add("beetroot");
			addOnList.add("watermelon");
			addOnList.add("kiwi");
			addOnList.add("garlic");
			addOnList.add("Tomatoes");
			addOnList.add("Avocado");
			addOnList.add("Pomegranate");
			addOnList.add("blueberries");
			addOnList.add("Chia seeds");
			addOnList.add("quinoa");
			addOnList.add("broccoli");
			addOnList.add("strawberries");
			addOnList.add("Sweet potato");
			addOnList.add("mushroom");
			addOnList.add("Celery");
			addOnList.add("Kiwi");
			
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
		
		 public static ArrayList<String> allergyList=new  ArrayList<String>();
			
		 static boolean allergy(String allg_Ingredient) 
		
		{
			 allergyList.add("milk");
			 allergyList.add("soy");
			 allergyList.add("egg");
			 allergyList.add("sesame");
			 allergyList.add("peanuts");
			 allergyList.add("walnuts");
			 allergyList.add("almonds");
			allergyList.add("hazelnut");
			allergyList.add("pecan");
			allergyList.add("pistachio");
			
			boolean isIngredientAllergy=true;
			//String isIngrediant="";
			String allergy_Ingredient = allg_Ingredient.toLowerCase();
			System.out.println("igredeintes coming" + allergy_Ingredient);

			for (String al: allergyList) 
			{
				if (allergy_Ingredient.contains(al)) // p_Ingredient
				{
					System.out.println("Allergy" + allg_Ingredient + "because of " + al + "recepid" + "");
					
					isIngredientAllergy=false;
				}
			}
			return isIngredientAllergy;
			
	}
	}


