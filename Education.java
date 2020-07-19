/**
 * Education
 */
import java.util.*;
public class Education {
    public static void main (String [] args)
    {
        while(!MyConsole())
        {
            System.out.println("Let's try again");
        }
        System.out.println("Good job");

    }


public static boolean MyConsole()
{
    System.out.println("Welcome to the Spanish Verb Maker");
    System.out.println("Please type in a verb to conjugate");

    Scanner scan = new Scanner(System.in);

    String verb = scan.nextLine();

    String substring = verb.substring(Math.max(verb.length() - 2, 0));
   
    
    switch(substring)
    {
        case "er":
        {
            System.out.println("ER Verb");
            ConjugateER(verb);
            break;
        }    
        case "ir":{
            System.out.println("IR Verb");
            ConjugateIR(verb);
            break;
        }
        case "ar":{
            System.out.println("AR Verb");
            ConjugateAR(verb);
            break;
        }
        default:
        {
            return false;
        }
    }
    return true;

}

    public static void ConjugateER(String verb){
        String toConjugate = WhoToConjugate();
        String root = verb.substring(0, verb.length() - 2);


        if(toConjugate.equals("I")){
            System.out.println(root+"o");
        }
        if(toConjugate.equals("Yo")){
            System.out.println(root+"o");
        }
        if(toConjugate.equals("You")){
            System.out.println(root+"es");
        }
        if(toConjugate.equals("Tu")){
            System.out.println(root+"es");
        }
        if(toConjugate.equals("Him")){
            System.out.println(root+"e");
        }
        if(toConjugate.equals("Her")){
            System.out.println(root+"e");
        }
        if(toConjugate.equals("El")){
            System.out.println(root+"e");
        }
        if(toConjugate.equals("Ella")){
            System.out.println(root+"e");
        }
        if(toConjugate.equals("We")){
            System.out.println(root+"emos");
        }
        if(toConjugate.equals("Nosotros")){
            System.out.println(root+"emos");
        }
        if(toConjugate.equals("Them")){
            System.out.println(root+"en");
        }
        if(toConjugate.equals("Ellos")){
            System.out.println(root+"en");
        }
    }
    public static void ConjugateIR(String verb){
        String toConjugate = WhoToConjugate();
        String root = verb.substring(0, verb.length() - 2);


        if(toConjugate.equals("I")){
            System.out.println(root+"o");
        }
        if(toConjugate.equals("Yo")){
            System.out.println(root+"o");
        }
        if(toConjugate.equals("You")){
            System.out.println(root+"es");
        }
        if(toConjugate.equals("Tu")){
            System.out.println(root+"es");
        }
        if(toConjugate.equals("Him")){
            System.out.println(root+"e");
        }
        if(toConjugate.equals("Her")){
            System.out.println(root+"e");
        }
        if(toConjugate.equals("El")){
            System.out.println(root+"e");
        }
        if(toConjugate.equals("Ella")){
            System.out.println(root+"e");
        }
        if(toConjugate.equals("We")){
            System.out.println(root+"imos");
        }
        if(toConjugate.equals("Nosotros")){
            System.out.println(root+"imos");
        }
        if(toConjugate.equals("Them")){
            System.out.println(root+"en");
        }
        if(toConjugate.equals("Ellos")){
            System.out.println(root+"en");
        }
    }
    
    public static void ConjugateAR(String verb){
        String toConjugate = WhoToConjugate();
        String root = verb.substring(0, verb.length() - 2);


        if(toConjugate.equals("I")){
            System.out.println(root+"o");
        }
        if(toConjugate.equals("Yo")){
            System.out.println(root+"o");
        }
        if(toConjugate.equals("You")){
            System.out.println(root+"as");
        }
        if(toConjugate.equals("Tu")){
            System.out.println(root+"as");
        }
        if(toConjugate.equals("Him")){
            System.out.println(root+"a");
        }
        if(toConjugate.equals("Her")){
            System.out.println(root+"a");
        }
        if(toConjugate.equals("El")){
            System.out.println(root+"a");
        }
        if(toConjugate.equals("Ella")){
            System.out.println(root+"a");
        }
        if(toConjugate.equals("We")){
            System.out.println(root+"amos");
        }
        if(toConjugate.equals("Nosotros")){
            System.out.println(root+"amos");
        }
        if(toConjugate.equals("Them")){
            System.out.println(root+"an");
        }
        if(toConjugate.equals("Ellos")){
            System.out.println(root+"an");
        }
    }
    
    
    
    public static String WhoToConjugate(){
        System.out.println("Are you conjugating for I (Yo)?");
        System.out.println("Are you conjugating for You (Tu)?");
        System.out.println("Are you conjugating for Him/Her (El/Ella)?");
        System.out.println("Are you conjugating for We (Nosotros)?");
        System.out.println("Are you conjugating for Them (Ellos)?");
        System.out.println("Please enter in Spanish or English (no accent)");
        Scanner Scan = new Scanner(System.in);
        String toConjugate = Scan.nextLine();
        

        return toConjugate;
        }
      

    } 
