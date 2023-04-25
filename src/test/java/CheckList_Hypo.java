
//package testcase;
import java.io.IOException;
import java.util.ArrayList;

//import com.util.ExcelReader
public class CheckList_Hypo {
	
	public static ArrayList<String> eliminatedList = new ArrayList<String>();
	
	static boolean checkIngrediant(String i_Ingredient) {

		String p_Ingredient = i_Ingredient.toLowerCase();
		System.out.println("igredeintes coming" + p_Ingredient);

		eliminatedList.add("tofu");
		eliminatedList.add("cauliflower");      
		eliminatedList.add("cabbage");
		eliminatedList.add("broccoli");
		eliminatedList.add("kale");
		eliminatedList.add("spinach");
		eliminatedList.add("strawberries");
		eliminatedList.add("peanuts");
		eliminatedList.add("peaches");
		eliminatedList.add("frozen food");
		eliminatedList.add("fried food");
		eliminatedList.add("sugar");
		eliminatedList.add("gluten");
		eliminatedList.add("fries");
	    eliminatedList.add("cakes");
		eliminatedList.add("candies");
		eliminatedList.add("white bread");
		eliminatedList.add("coffee");
		eliminatedList.add("alcohol");
		eliminatedList.add("soy milk");
		eliminatedList.add("edamame");
		eliminatedList.add("sweet potatoes");
		eliminatedList.add("pine nuts");
		

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
		 addOnList.add("milk");
			addOnList.add("dairy");      
			addOnList.add("eggs");
			addOnList.add("nuts");
			addOnList.add("pumpkin seeds");
			addOnList.add("iodized salt");
			addOnList.add("brazil nuts");
			addOnList.add("blue berries");
			addOnList.add("low-fat yogurt");
			addOnList.add("brown rice");
			addOnList.add("quinoa");
			addOnList.add("mushroom");
			
		
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
