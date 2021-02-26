/*
 *  Sheridan College, Trafalgar Campus
 * Name/Student no.: Jaime Tavares, 991512643
 * Program: Information Systems Engineering
 */
package midtermexam_versiona_extensioncode;
import java.util.*;
/**
 *
 * @author jtava
 */
public class TestUserProfile {
    public static void main(String[] args){
        // create an instance of the UserProfile class
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome, Please enter your name: ");
        String name = input.nextLine();
        // movie-genre choices: comedy drama action mystery
        System.out.println("Please type a number corresponding to your favourite"
                + " genre of movie: 1.Comedy 2.Drama 3.Action 4.Mystery ");
        int genre = input.nextInt();
        UserProfile user1 = new UserProfile();
        switch (genre) {
            case 1:
                {
                    //UserProfile user1 = new UserProfile(name, "Comedy");
                    user1.setGenre("Comedy");
                    break;
                }
            case 2:
                {
                    //UserProfile user1 = new UserProfile(name, "Drama");
                    user1.setGenre("Drama");
                    break;
                }
            case 3:
                {
                    //UserProfile user1 = new UserProfile(name, "Action");
                    user1.setGenre("Action");
                    break;
                }
            case 4:
                {
                    user1.setGenre("Mystery");
                    //UserProfile user1 = new UserProfile(name, "Mystery");
                    break;
                }
            default:
                break;
        }
        System.out.println("Your User Profile has been created successfully!");
        
    }
    
}
