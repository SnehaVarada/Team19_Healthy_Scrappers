package smartScrapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddOnPcos extends BaseTest{
	
	public static ArrayList<String> recipeid = new ArrayList<String>();
	public static ArrayList<String> recipeName = new ArrayList<String>();
	public static ArrayList<String> ingredientList = new ArrayList<String>();
	public static ArrayList<String> prepTime = new ArrayList<String>();
	public static ArrayList<String> cookTime = new ArrayList<String>();
	public static ArrayList<String> prepMethod = new ArrayList<String>();
	public static ArrayList<String> NutrientList = new ArrayList<String>();
	public static ArrayList<String> RecipeUrlList = new ArrayList<String>();
	public static  String nutrients ;
	public static String ct;
    public static String foodCategory = "Vegetarian";
    public static String morbidities = "Pcos";

	@Test
	public static void Pcos() throws InterruptedException, IOException {
		
	
		driver.findElement(By.xpath("//ul[@id='nav']/li/a[1]")).click();
		driver.findElement(By.xpath("//a[@id='ctl00_cntleftpanel_ttlhealthtree_tvTtlHealtht335']")).click();
		int PcosPaginationSize=driver.findElements(By.xpath("//div[@id='pagination']/a")).size();
		//System.out.println(typhoidRecipeNameSize);
		System.out.println(PcosPaginationSize);
		for (int p = 1; p <= PcosPaginationSize; p++) {

			System.out.println("onpage:" + p);
			// String url
			/*
			 * ="https://www.tarladalal.com/RecipeSearch.aspx?term=High%20Blood%20Pressure&pageindex="
			 * +p; driver.get(url);
			 */

			
			  List<WebElement> RecipeList =
			  driver.findElements(By.xpath("//span[@class='rcc_recipename']"));
			  System.out.println(RecipeList.size());
			 
			driver.findElement(By.xpath("//div[@id='pagination']/a["+p+"]")).click();
			//driver.findElement(By.xpath("//div[@id='pagination']/a["+i+"]")).click();
			int PcosRecipeNameSize=driver.findElements(By.xpath("//span[@class='rcc_recipename']")).size();
			//Thread.sleep(2000);

			for (int k = 1; k <= PcosRecipeNameSize; k++)

			{
					try
					{
					
					// recipe id
					WebElement r_id = driver.findElement(By.xpath("//div[@class='recipelist']/article[\"+k+\"]/div[2]/span"));
					String s = r_id.getText();
					String formattedrecipeid = s.substring(8, s.length() - 9);
					// recipeid.add(formattedrecipeid.trim());
					System.out.println(formattedrecipeid);
					System.out.println(s);

					// Recipe name

					WebElement recipename = driver.findElement(
					By.xpath("//div[@class='recipelist']/article["+k+"]/div[3]/span/a"));
					String r = recipename.getText();
					System.out.println("Recipe Name:" + r);
					// recipeName.add(r);

					// click on Recipe
					driver.findElement(By.xpath("//div[@class='recipelist']/article[\"+k+\"]/div[3]/span/a")).click();
					

					// ingredient
					String Ingrediants = driver.findElement(By.xpath("//div[@id='rcpinglist']")).getText();
					System.out.println("Ingrediants are : " + Ingrediants);
					boolean isIngrediant = CheckListPcos.checkIngrediant(Ingrediants);
					boolean isIngrediantAdds=CheckListPcos.checkAddOns(Ingrediants);

					
					  // preparation Time
					WebElement Preptime =driver.findElement(By.xpath("//p//time[1]"));
					String pt = Preptime.getText();
					 

					// cook time
					
					  WebElement Cooktime = driver.findElement(By.xpath("//p//time[2]")); 
					  ct = Cooktime.getText();
					 

					// preparation method
					
					  WebElement Prepmethod =driver.findElement(By.xpath("//div[@id='recipe_small_steps']"));
					  String pm = Prepmethod.getText();
					 
					// nutrients
					
					  try
					  { 
						   nutrients = driver.findElement(By.xpath("//div[@id='rcpnuts']")).getText();
					  
					  }
					  catch(Exception e) 
					  {
						  System.out.println("not available");
					  }
					  
					  String strUrl = driver.getCurrentUrl();
			        	System.out.println("Recipe URL : "+strUrl);
			        
					 
					if (isIngrediant && isIngrediantAdds )
					{
						recipeid.add(formattedrecipeid.trim());
						recipeName.add(r);

						ingredientList.add(Ingrediants);
						System.out.println("Ingrediants are : " + Ingrediants);

						
						  prepTime.add(pt); System.out.println("Preperation Time is : " + pt);
						 
						
						  try { 
							  cookTime.add(ct);
							  System.out.println("Cooking Time is : " + Cooktime.getText()); } 
						  catch (Exception e) 
						  { 
							  cookTime.add("NA"); 
							  }
			
						// preparation method
						
						  prepMethod.add(pm);
						  System.out.println("Preperation Method is : " + Prepmethod.getText());
						 
						//Thread.sleep(4000);
						
						
						  try
						  {
						  
						  NutrientList.add(nutrients); 
						  System.out.println("Nutrient Values are : " + nutrients); 
						  } 
						  catch(Exception e) 
						  {
							  NutrientList.add("NA"); 
						  }
						
				        	RecipeUrlList.add(strUrl);
				        	System.out.println("Recipe URL : "+strUrl);
				        }
					
					driver.navigate().back();

				}
				catch(Exception e)
				  {
					System.out.println("no such element"+e.getMessage());
				  }
				 

			}

ExcelReader xlreader = new ExcelReader(".\\datafiles\\Pcos.xlsx");
		xlreader.setcelldata("AddonPcos", 0, 0, "recipeid");
		xlreader.setcelldata("AddonPcos", 0, 1, "recipename");
		xlreader.setcelldata("AddonPcos", 0, 2,"Food Category(Veg/non-veg/vegan/Jain)");
		xlreader.setcelldata("AddonPcos", 0, 3, "ingrediant");

		xlreader.setcelldata("AddonPcos", 0, 4, "preparation Time");
		xlreader.setcelldata("AddonPcos", 0, 5, "cook Time");

		xlreader.setcelldata("AddonPcos", 0, 6, "preparation method");
		xlreader.setcelldata("AddonPcos", 0, 7, "Nutrients");
		xlreader.setcelldata("AddonPcos", 0,8,"Targetted morbid conditions");
		xlreader.setcelldata("AddonPcos", 0, 9, "url");
		
		
		
				
				for (int a = 0; a <=recipeName.size(); a++) 
				{
					try
					{
					xlreader.setcelldata("AddonPcos", a+1, 0, recipeid.get(a));
					xlreader.setcelldata("AddonPcos", a+1, 1, recipeName.get(a));
					xlreader.setcelldata("AddonPcos", a+1, 2,foodCategory);
					xlreader.setcelldata("AddonPcos", a+1, 3, ingredientList.get(a));

					xlreader.setcelldata("AddonPcos", a+1, 4, prepTime.get(a));
					xlreader.setcelldata("AddonPcos", a+1, 5, cookTime.get(a));
					xlreader.setcelldata("AddonPcos", a+1, 6, prepMethod.get(a)); 
					xlreader.setcelldata("AddonPcos", a+1, 7, NutrientList.get(a));
					xlreader.setcelldata("AddonPcos", a+1, 8, morbidities);
					xlreader.setcelldata("AddonPcos", a+1, 9, RecipeUrlList.get(a));
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}

				}
		 
	}

}

}
