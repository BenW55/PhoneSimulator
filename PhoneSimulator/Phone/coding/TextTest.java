//I have the other apps working but there arent eough classes so I wont add them yet
import java.util.Scanner;
public class TextTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to your phone creation program.");
        System.out.println("What would you like for your phone?");
        System.out.println("You can chose OS, Screen size, memory, and color");
        
        System.out.println("What OS?");//get os
        String OS = input.nextLine();
        
        System.out.println("What size screen in inches?");//get size
        double screenSize = input.nextDouble();
        input.nextLine();
        
        System.out.println("How much memory?");// get memory
        double memory = input.nextDouble();
        input.nextLine();
        
        System.out.println("What color?");// get color
        String color = input.nextLine();
        Text newPhone = new Text(OS, screenSize, memory, color);//create new phone
        
        System.out.println(newPhone);
        System.out.println("Welcome to your phone.");
        System.out.println("Would you like to unlock it?(y/n)");
        boolean locaton = true;
        boolean settings = false;
        boolean choice2 = false;
        boolean specChoice = false;
        boolean appChoice = false;
        boolean gMap = false;
        //apps appp = new apps("Settings", "Appstore"); experimenting with array
        name2 name = new name2("Settings Appstore");
        while (true)
        {
            String unLock = input.nextLine();
             if (unLock.equals("n"))
            {
                System.exit(0);
            }
            else if (unLock.equals("y"))
            {
                while(true)
                {
                    System.out.println("");
                    System.out.println("Welcome to your phones home screen:");
                    System.out.println("Your current apps are: ");
                    //appp.printApps(); array
                    System.out.println(name);
                    System.out.println("Which would you like to chose? Type exit to quit");
                    String app = input.nextLine();
                    if (app.equals("Settings"))//if u choose settings
                    {
                        settings = true;
                        while (settings == true)
                        {
                            
                            System.out.println("Welcome to settings \n What would you like to customize?");
                            System.out.println("Phone spec \n Location privacy");
                            String choice1 = input.nextLine();
                            if (choice1.equals("Phone spec"))//PHONE SPECF
                            {
                                specChoice = true;
                                while (specChoice == true)
                                {
                                    
                                    System.out.print("What would you like to customize? \n OS\n Screen size\n Memory \n Color \n we also have some pre-set builds you can view \n for those respond with 'pre set'");
                                    String settingsChange = input.nextLine();
                                    
                                    if (settingsChange.equals("OS"))
                                    {
                                        System.out.println("What would you like to change your OS to?");
                                        String oss = input.nextLine();
                                        newPhone.osChange(oss);
                                        System.out.println("Your new phone specs are " + newPhone);
                                        System.out.println("You will be returned to the Settings app base");
                                        System.out.println("");
                                        specChoice = false;
                                        
                                    }
                                    else if (settingsChange.equals("exit"))
                                    {
                                        specChoice = false;
                                    }
                                    
                                    else if (settingsChange.equals("Screen size"))
                                    {
                                        System.out.println("What would you like to change your Screen size to?");
                                        double ss = input.nextDouble();
                                        newPhone.ssChange(ss);
                                        System.out.println("Your new phone specs are " + newPhone);
                                        System.out.println("You will be returned to the Settings app base");
                                        System.out.println("");
                                        specChoice = false;
                                    }
                                    else if (settingsChange.equals("Memory"))
                                    {
                                        System.out.println("What would you like to change your Memory to?");
                                        double mem = input.nextDouble();
                                        newPhone.memChange(mem);
                                        System.out.println("Your new phone specs are " + newPhone);
                                        System.out.println("You will be returned to the Settings app base");
                                        System.out.println("");
                                        specChoice = false;
                                    }
                                    else if (settingsChange.equals("Color"))
                                    {
                                        System.out.println("What would you like to change your Color to?");
                                        String col = input.nextLine();
                                        newPhone.colChange(col);
                                        System.out.println("Your new phone specs are " + newPhone);
                                        System.out.println("You will be returned to the Settings app base");
                                        System.out.println("");
                                        specChoice = false;
                                        
                                    }
                                    else if (settingsChange.equals("pre set")) 
                                    {
                                    	Text preOne = new Text();
                                    	Text preTwo = new Text(OS);
                                    	Text preThree = new Text(screenSize);
                                    	System.out.println(preOne);
                                    	System.out.println("");
                                    	System.out.println(preTwo);
                                    	System.out.println("");
                                    	System.out.println(preThree);
                                    	System.out.println("");
                                    	System.out.println("You will be returned to the Settings app base");
                                    	specChoice = false;
                                    	
                                    }
                                    else
                                    {
                                       System.out.println("Not a current option"); 
                                       System.out.println("");
                                    }
                                }
                            }
                            else if (choice1.equals("Location privacy"))
                            {
                                choice2 = true;
                                while (choice2 == true)
                                {
                                    
                                System.out.println("Right now your apps can access your location, would you like the apps to see your location? y/n");
                                String location = input.nextLine();
                                    if (location.equals("y"))
                                    {
                                     System.out.println("Ok they can now see your location");
                                      locaton = true;
                                      choice2 = false;
                                    }
                                    else if (location.equals("n"))
                                    {
                                        System.out.println("They can no longer see your location");
                                        locaton = false;
                                        choice2 = false;
                                    }
                                    else if (location.equals("exit"))
                                    {
                                        choice2 = false;
                                    }
                                    
                                    else
                                    {
                                        System.out.println("Not an option");
                                        System.out.println("");
                                    }
                                }
                            
                                
                            }
                            else if (choice1.equals("exit"))
                            settings = false;
                        }
                        
                        
                    } 
                    else if (app.equals("Google Maps")) 
                    {
                    	if (gMap == true) 
                    	{
                    		System.out.println("Welcome to Google Maps!");
                    		System.out.println("With with app you can calculate the distance between two cordinates.");
                    		System.out.println("What is the cordinates for the first location? Latidude then Longidute");
                    		double firstL = input.nextDouble();
                    		double firstLong = input.nextDouble();
                    		googleMaps firstLocation = new  googleMaps(firstL, firstLong);
                    		System.out.println("What is the cordinates for the second location?");
                    		double secondL = input.nextDouble();
                    		double secondLong = input.nextDouble();
                    		googleMaps secondLocation = new  googleMaps(secondL, secondLong);
                    		double distance = firstLocation.distanceFrom(secondLocation);
                    		System.out.println("The distance from location 1 to 2 is " + distance + " Miles ");
                    		
                    		
                    	}
                    	else if (gMap == true) 
                    	{
                    		System.out.println("Not an option");
                    		System.out.println("");
                    	}
                    }
                    else if (app.equals("Appstore"))//if u chose app store
                    {
                        appChoice = true;
                        while (appChoice == true)
                        {
                            
                        System.out.println("Welcome to the appstore \n The apps avaible are:\n Google Maps \n Calculator \n Word Scrambler \n type exit to leave");
                        String app1 = input.nextLine();
                         if (app1.equals("Google Maps"))
                         {
                             System.out.println("Thank you for chosing Google Maps");
                             System.out.println("We will now sell all of your data :)");
                             System.out.println("We will return you to your home screen while it's downloading");
                             appChoice = false;
                             gMap = true;
                             name.addName(app1);
                             //appp.addApp("Google Maps");
                             
                         }
                         else if (app1.equals("Calculator"))
                         {
                        	 System.out.println("Thank you for chosing Calculator");
                             System.out.println("We will now sell all of your data :)");
                             System.out.println("We will return you to your home screen while it's downloading");
                             appChoice = false;
                             //appp.addApp("Calculator");
                             name.addName(app1);
                         }
                         else if (app1.equals("Word Scrambler"))
                         {
                            
                        	 System.out.println("Thank you for chosing Word Scarmbler");
                             System.out.println("We will now sell all of your data :)");
                             System.out.println("We will return you to your home screen while it's downloading");
                             appChoice = false;
                             name.addName(app1);
                             //appp.addApp("Word Scrambler");
                             
                         }
                         else if (app1.equals("exit"))
                         {
                        appChoice = false;
                         }
                         else
                         {
                             System.out.println("Not an app current avaible right now");
                             System.out.println("");
                         }
                             
                        }
                        
                    } 
                    else if (app.equals("exit"))
                    {
                        System.exit(0);
                    }
                    else
                    {
                        System.out.println("Not an app you currently have.");
                        System.out.println("");
                    }
                    
                }
                
                
                
            }
            else
            {
                System.out.println("Not an option pal");
                System.out.println("");
            }
        
         
        }
        
    }
}