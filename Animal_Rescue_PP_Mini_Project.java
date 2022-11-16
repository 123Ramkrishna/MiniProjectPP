/*
This Program is made for the purpose of Animal Rescue in some specific area.
In this Program the user can contact to Animal Rescue NGO and the user can tell
at which place animal is harmed,so that the medical team is arrivied at that place.
NGO also has shelter.If any animal is injured seriously then the team bring
them to Shelter.
*/

import java.util.*;
import java.io.*;

public class Animal_Rescue_PP_Mini_Project {
    /*
      The Information_about_NGO function gives the information about NGO.
    */
    public void information_about_NGO() throws Exception
    {

           File file = new File("C:\\Users\\ramkr\\PPMiniProjectJava\\Information_of_NGO.txt");

           try
           {
              Scanner sc = new Scanner(file);
              while (sc.hasNextLine()) {
                  String line = sc.nextLine();
                  System.out.println(line);
              }
              sc.close();
          }

           catch(FileNotFoundException e)
          {
              e.printStackTrace();
          }

    }

    /*
    Contact_Details function gives the contact details of the various branch of the NGO.
    */
    public  void Contact_Details() throws Exception
    {
        File file = new File("C:\\Users\\ramkr\\PPMiniProjectJava\\Contact_Details_Of_Different_Branch.txt");
        try
        {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }

        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    /*
Animal_Type function shows which Animal is injured example: Dog,cat,cow,horse etc..
    */
    public void Animal_Type()
    {
        Scanner input = new Scanner(System.in);
        String Animal ;
        Animal = input.nextLine();
        System.out.println("Animal injured or suffered is :"+ Animal);
    }

    /*
    Place_where_Animal_is_harmed function shows the location where animal is harmed.
    */
    public void Place_where_Animal_is_harmed()
    {
        Scanner input = new Scanner(System.in);
        String location;
        location = input.nextLine();
        System.out.println("Location where animal is harmed : "+location);
    }

    /*
    Animal_Adoption function is used to give name of the person who adopt the animal.
    */
    public void Animal_Adoption()
    {
        String    name;
        String    Animal;

        Scanner   input = new Scanner(System.in);

        System.out.println("Please Enter your full name : ");
        name = input.nextLine();

        System.out.println("Enter the animal you want to Adopt : ");

        Animal = input.nextLine();

    }

    /*
    Adopter_Details function gives details of the name of person,date,time of adoption etc..
    */
    public  void Adopter_Details() throws Exception
    {
        File    file = new File("C:\\Users\\ramkr\\PPMiniProjectJava\\AdopterDetails.txt");
        try
        {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    /*
    If anyone is willing to help the NGO,so he/she can donate money to NGO using Donation_To_NGO function.
    */
    public void Donation_To_NGO()
    {
        Scanner input = new Scanner(System.in);

        int     money;

        System.out.println("Support us,So we can reach and rescue animals in every part of India.\n");
        System.out.println("Enter the amount of money you want to donate : ");

        money = input.nextInt();

        if(money != 0)
        {
            System.out.println("Thankyou so much for your support.\nHave a nice day!!");
        }

        else System.out.println("Enter the valid amount.");
    }

    /*
   Donater_Details function shows the name of person who donate money,date,time.
    */
    public void Donater_Details() throws Exception
    {
        File    file = new File("C:\\Users\\ramkr\\PPMiniProjectJava\\DonaterDetails.txt");
        try
        {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    /*
    Transaction_Details function gives all transaction histroy.
    */
    public void Transaction_Details() throws Exception
    {
        File file = new File("C:\\Users\\ramkr\\PPMiniProjectJava\\TransactionDetails.txt");
        try
        {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    /*
    If user has face any problem so user can report this, so that the NGO team can resolve it.
    */
    public void Report()
    {
        Scanner input = new Scanner(System.in);

        String  report = input.nextLine();

        System.out.println("Sorry Sir for inconvinence for the above problem you faced.\n");
        System.out.println("We will definetly work on it.\nThankyou.");
    }

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        Animal_Rescue_PP_Mini_Project Rescue = new Animal_Rescue_PP_Mini_Project();

        System.out.println("Select: 1. Information about NGO.\n\t    2. Contact details of NGO.");
        System.out.println("        3. Which animal is suffered.\n\t    4. Place where Animal is harmed.");
        System.out.println("        5. Want to Adopt Animal.\n\t    6.Adopter Details.");
        System.out.println("        7. Donation.\n\t    8. Donater Details.");
        System.out.println("        9. Transaction.\n\t   10. Report.");

        int    select_options;
        String     name;
        String     Animal;

        System.out.println("Select options from above : ");

        select_options = input.nextInt();

        switch(select_options)
        {
            case 1 :
                try
                {
                    Rescue.information_about_NGO();  // calling of the Information_about_NGO function.
                } catch (Exception e)
                {
                    throw new RuntimeException(e);
                }

                System.out.println();

                break;

            case 2 :
                    System.out.println("Dear Sir !\n Thankyou for contacting us. ");
                    try
                    {
                        Rescue.Contact_Details();  // calling of the Contact_Details function.
                    }catch(Exception e)
                    {
                        throw new RuntimeException(e);
                    }

                    break;

            case 3 :
                System.out.println("Please Enter which Animal is suffered : ");

                Rescue.Animal_Type();    // calling  of the Animal_Type function.

                break;

            case 4 :
                System.out.println("Please Enter the location where animal is harmed : ");

                Rescue.Place_where_Animal_is_harmed(); // calling of the Place_where_Animal_is_harmed function.

                break;

            case 5 :
                System.out.println("Animal is Recovered from injury.\nIf you want to Adopt the Animal then \n");

                Rescue.Animal_Adoption();    //calling of the Animal_Adoption function


                break;

            case 6 :
                System.out.println("Adopter Details:\n\n");
                try
                {
                   Rescue.Adopter_Details();   //calling Adopter_Details function.
                }catch(Exception e)
                {
                    throw new RuntimeException(e);
                }

                break;

            case 7 :
                Rescue.Donation_To_NGO();    // calling Donater_To_NGO function.

                break;

            case 8 :
                System.out.println("Donater Details:\n\n");

                try
                {
                    Rescue.Donater_Details();  // calling Donater_Details function.
                }catch(Exception e)
                {
                    throw new RuntimeException(e);
                }

                break;

            case 9 :
                System.out.println("Transaction Details:\n\n");

                try
                {
                    Rescue.Transaction_Details();   // calling Transaction_Details function.
                }catch(Exception e)
                {
                    throw new RuntimeException(e);
                }

                break;

            case 10 :
                Rescue.Report();     // calling Report function.

                break;

            default:
                System.out.println("Please choose valid option.");
        }
    }
}
