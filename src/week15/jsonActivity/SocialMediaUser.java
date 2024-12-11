package week15.jsonActivity;

// Define a simple class for SocialMediaUser
public class SocialMediaUser {
    private String username;
    private int age;
    private String email;
    private int followers;

    // Constructor
    public SocialMediaUser(String username, int age, String email, int followers) {
        this.username = username;
        this.age = age;
        this.email = email;
        this.followers = followers;
    }

    // Getters and setters (optional for zyBook style)
    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public int getFollowers() {
        return followers;
    }
}
