import java.util.Scanner; //The Input thing
public class recipeHelper
{
    public static void main(String args[]) //This is the main function this, so this is what you invoke in BlueJ
    {
        Scanner scanner = new Scanner(System.in); //We have to make it first though
        System.out.println("HOW MANY COOKIES?");
        double batches = scanner.nextDouble();
        
        double tbsBS = 1.0*batches;
        double tsBP = 0.5*batches;
        double cB = 1.0*batches;
        double cWS = 1.5*batches;
        double eggs = 1.0*batches;
        System.out.println("Cookie Recipe");
        System.out.println(tbsBS+" tsp baking soda");
        System.out.println(tsBP+" tsp baking powder");
        System.out.println(cB+" c butter");
        System.out.println(cWS+" c white sugar");
        System.out.println(eggs+" egg");
        System.out.println("And a lot of fun");
    }
}
