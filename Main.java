/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author ???
 * @version ???
 */

public class Main {
	public static void main(String[] args) {
		String tulsaDescription = "A black teenager, who was working as a shoe shiner in downtown Tulsa, Oklahoma, was arrested and accused of assaulting a white woman on a public elevator in broad daylight. A group of white vigilantes, intent on lynching him, and armed black men intent on protecting him gathered at the courthouse. A shot rang out, and the violence began. The riot resulted in 35 square blocks of destruction, including more than 1,250 homes, churches, schools, businesses, a hospital, and a library.";
		Date tulsaDay = new Date(5, 31, 1921);
		HistoricalEvent tulsaRiot = new HistoricalEvent(tulsaDescription, tulsaDay);

		// System.out.println("====================================================");
		// System.out.println("HISTORICAL EVENT EXAMPLE:");
		// System.out.println("====================================================");
		//System.out.println(tulsaRiot);
		tulsaRiot.teach();


		// int[] array = { 4, 5, 9, 2, 3, 6, 7 };
		
		// //Bubble sort
		// for (int j = 0; j < array.length; j++)
		// {
		// 	for (int i = 0; i < array.length - 1; i++) 
		// 	{
		// 		if (array[i] > array[i + 1]) {
		// 			int temp = array[i];
		// 			array[i] = array[i + 1];
		// 			array[i + 1] = temp;
		// 		}
		// 	}
		// }
		
		// for (int i = 0; i < array.length; i++)
		// {
		// 	System.out.print(array[i] + "; ");
		// }
		
		// String tulsaRevised = "It started with newspaper reports that a black man had assaulted a white elevator operator. He was arrested, and black World War I vets rushed to the courthouse to prevent a lynching. Whites were deputized and handed weapons, the shooting started and then it got out of hand. It was mob rule for two days, and the result was the complete devastation of the entire black community. The white mobs looted the homes and businesses before they set fire to the community. Planes circled mid-air and bombed what was known as Black Wall Street. The National Guard was called out after the governor declared martial law, and imprisoned all blacks that were not already in jail. More than 35 blocks were destroyed, along with more than 1,200 homes, and some 300 people died, mostly Blacks.",
		// 	tulsaCitation = "https://www.smithsonianmag.com/smithsonian-institution/long-lost-manuscript-contains-searing-eyewitness-account-tulsa-race-massacre-1921-180959251/";
			
		
		String LADescription = "The 1992 LA riots all began when 4 LAPD officers were acquited on a charge of severly beating a black motorist named Rodney King which sparked ",
				laRiotsCitation = "https://www.britannica.com/event/Los-Angeles-Riots-of-1992";
				
				String LARevised = " ";

			Date LADay = new Date(4, 29, 1992);
			HistoricalEvent laRiot = new RevisedEvent(LADescription, LADay, LARevised, laRiotsCitation);
			
			//RevisedEvent tulsaMassacre = new RevisedEvent(tulsaDescription, tulsaDay, tulsaRevised, tulsaCitation);
		
		// System.out.println("\n====================================================");
		// System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		// System.out.println("====================================================");
		//tulsaMassacre.teach();
		laRiot.teach();
	}
}