/*
This Program is made for the purpose of Animal Rescue in some specific area.
In this Program the user can contact to Animal Rescue NGO and the user can tell
at which place animal is harmed,so that the medical team is arrivied at that place.
NGO also has shelter.If any animal is injured seriously then the team bring
them to Shelter.
*/
#include <stdio.h>
    // Declaration of Information_about_NGO function.
    void
    Information_about_NGO();

    // Declaration of Contact_Details function.
    void 
    Contact_Details();

    // Declaration of Animal_Type function.
    void 
    Animal_Type(char[]);

    // Declaration of Place_where_Animal_is_harmed function.
    void 
    Place_where_Animal_is_harmed(char[]);

    // Declaration of Animal_Adoption function.
    void
    Animal_Adoption(char []);

    // Declaration of Adopter_Details function.
    void 
    Adopter_Details();

    // Declaration of Donation_To_NGO function.
    void 
    Donation_To_NGO();

    // Declaration of Donater_Details function.
    void 
    Donater_Details();
 
    // Declaration of Transaction_Details function.
    void 
    Transaction_Details();

    // Declaration of Report function.
    void 
    Report();

int main()
{ 
    printf("Select : 1. Information about NGO.\n\t 2. Contact details of NGO.\n\t");
    
    printf(" 3. Which Animal is suffered.\n\t 4. Place where Animal is harmed.\n\t");
    
    printf(" 5. Want to Adopt Animal?\n\t 6. Adopter Details.\n\t");
    
    printf(" 7. Donation.\n\t 8. Donater Details.\n\t");
    
    printf(" 9. Transaction.\n\t 10. Report.\n");

    short int  select_options;    // Declaration of select_options to select above options.
    printf("Select options from above: ");
    scanf("%hu",&select_options);
    
    char    buffer;              // creating buffer.
    scanf("%c",&buffer);
    
    char    Animal[20];         // Declaration of Animal string.

    char    Animal_Adopted[20]; // Declaration of Animal_Adopted string.

    char    name[100];          // Declaration of name string.

/*
Switch case is used to implement the selected option.
*/
   switch(select_options)
    {
        case 1 : 
                 Information_about_NGO(); // calling of the Information_about_NGO function.
                 printf("\n");
                 
                 break;

        case 2 :
                printf(" Dear Sir!\n Thankyou for contacting us.\n\n");
                
                Contact_Details(); // calling of the Contact_Details function.
    
                 break;

        case 3 : 
                printf("Please Enter which animal is suffered : ");
                gets(Animal);    
                
                Animal_Type(Animal);   // calling  of the Animal_Type function.
                
                break;

        case 4 : 
                printf("Please Enter the location where Animal is harmed: ");
                char     location[100];
                fgets(location,100,stdin); 
                
                Place_where_Animal_is_harmed(location); // calling of the Place_where_Animal_is_harmed function.
                
                break;

        case 5 : 
                printf("Animal is Recovered from injury.\nIf you want to Adopt the Animal then \n");
                printf("Please Enter your full name : ");
                gets(name);
                
                printf("Enter the animal you want to Adopt: ");
                fgets(Animal_Adopted,20,stdin);

                Animal_Adoption(name); //calling of the Animal_Adoption function

                FILE     *fh;             // file pointer to point the character of the AdopterDetails.txt file.
                
                fh = fopen("AdopterDetails.txt","a");
                
                fprintf(fh,"%s \t \t %s \t %s   %s" ,name,"10/04/2023","02:45pm",Animal_Adopted);
                
                fclose(fh);

                break;

        case 6 : 
               printf("Adopter Details:\n\n");
               
               Adopter_Details(); //calling Adopter_Details function.

               break;
        
        case 7 :
              Donation_To_NGO(); // calling Donater_To_NGO function.
             
              break;

       case 8 :
              printf("Donater Details:\n\n");
              
              Donater_Details();  // calling Donater_Details function.
              
              break;

        case 9 :
              printf("Transaction Details:\n\n");
              
              Transaction_Details(); // calling Transaction_Details function.
              
              break;

        case 10 :
              Report();       // calling Report function.
              
              break;

        default :
             printf("Please choose valid option.");
   
    }   
   
    return 0;
}

/*
The Information_about_NGO function gives the information about NGO.
*/
void
Information_about_NGO()
{
FILE     *fh;   // file pointer to point the character of the Information_about_NGO.txt file.
    
        fh = fopen("Information_Of_NGO.txt","r");
        
        char character ;
    
        while((character = fgetc(fh)) != EOF){
         putchar(character);
        }
    
        fclose(fh);
    }

/*
Contact_Details function gives the contact details of the various branch of the NGO.
*/
void 
Contact_Details()
{
FILE     *fh;   // file pointer to point the character of Contact_Details.txt file.
     
     fh = fopen("Contact_Details_Of_Different_Branch.txt","r"); 
    
     char character ;
    
     while((character = fgetc(fh)) != EOF){
        putchar(character);
     }
    
     fclose(fh);
}

/* 
Animal_Type function shows which Animal is injured example: Dog,cat,cow,horse etc..
*/
void
Animal_Type(char Animal[])
{
printf("Animal injured or suffering is : %s",Animal);
}

/*
Place_where_Animal_is_harmed function shows the location where animal is harmed.
*/
void Place_where_Animal_is_harmed(char location[])
{
 printf("location where Animal is harmed is %s",location);
}

/*
Animal_Adoption function is used to give name of the person who adopt the animal.
*/
void
Animal_Adoption(char name[])
{
 printf("Thankyou %s Sir! for adoption.\nWe hope that you take care them.",name);  
}

/*
Adopter_Details function gives details of the name of person,date,time of adoption etc..
*/
void 
Adopter_Details()
{
FILE     *fh;  // file pointer to point the character of the AdopterDetails.txt file.

     fh = fopen("AdopterDetails.txt","r");
    
     char character ;
     
     while((character = fgetc(fh)) != EOF){
          putchar(character);
     }
     
     fclose(fh);
}

/*
If anyone is willing to help the NGO,so he/she can donate money to NGO using Donation_To_NGO function.
*/
void
Donation_To_NGO()
{
  int     money;
  printf("Support us,So we can reach and rescue animals in every part of India.\n");
  printf("Enter the amount of money you want to donate : ");
  scanf("%d",&money);

  if(money != 0)
  {
   printf("Thankyou so much for your support.\nHave a nice day!!");
  }
  
  else printf("Enter the valid amount.");
}

/*
Donater_Details function shows the name of person who donate money,date,time. 
*/
void 
Donater_Details()
{
FILE     *fh;   // file pointer to point the character of the DonaterDetails.txt file.
     
     fh = fopen("DonaterDetails.txt","r");
     
     char character ;

     while((character = fgetc(fh)) != EOF){
        putchar(character);
     }
    
     fclose(fh);
}

/*
Transaction_Details function gives all transaction histroy.
*/
void 
Transaction_Details()
{
FILE     *fh;  // file pointer to point the character of the TransactionDetails.txt file.
     
     fh = fopen("TransactionDetails.txt","r");
     
     char character ;
     
     while((character = fgetc(fh)) != EOF){
        putchar(character);
     }
     
     fclose(fh);
}

/*
If user has face any problem so user can report this, so that the NGO team can resolve it. 
*/
void
Report()
{
    char     report[500];
    gets(report);

    printf("Sorry Sir for inconvinence for the above problem you faced.\n");
    printf("We will definetly work on it.\nThankyou.");
}