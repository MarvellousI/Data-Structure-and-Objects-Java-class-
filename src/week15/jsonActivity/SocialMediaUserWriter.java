package week15.jsonActivity;

import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;

public class SocialMediaUserWriter {
    public static void main(String[] args) {
        // Create an instance of SocialMediaUser
        SocialMediaUser user = new SocialMediaUser("john_doe", 25, "john.doe@example.com", 1000);

        // Use Gson to write the object to a JSON file
       // Gson gson = new Gson();
        try (FileWriter writer = new FileWriter("socialMediaUser.json")) {
            gson.toJson(user, writer);
            System.out.println("User written to socialMediaUser.json");
        } catch (IOException e) {
            System.out.println("Error writing JSON file: " + e.getMessage());
        }
    }
}

