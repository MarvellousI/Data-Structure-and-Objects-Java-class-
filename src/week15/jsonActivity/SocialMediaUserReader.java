package week15.jsonActivity;

import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;

public class SocialMediaUserReader {
    public static void main(String[] args) {
        // Use Gson to read the JSON file and create a SocialMediaUser object
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("socialMediaUser.json")) {
            SocialMediaUser user = gson.fromJson(reader, SocialMediaUser.class);

            // Print the user's details
            System.out.println("User information:");
            System.out.println("Username: " + user.getUsername());
            System.out.println("Age: " + user.getAge());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Followers: " + user.getFollowers());
        } catch (IOException e) {
            System.out.println("Error reading JSON file: " + e.getMessage());
        }
    }
}

