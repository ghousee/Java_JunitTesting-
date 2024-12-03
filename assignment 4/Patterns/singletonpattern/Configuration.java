package singletonpattern;

public class Configuration {

    // Step 1: Create a private static instance of the class
    private static Configuration instance;

    // Step 2: Make the constructor private to prevent instantiation
    private Configuration() {
        // Initialize configuration settings here
    }

    // Step 3: Provide a public static method to get the instance
    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration(); // Lazy initialization
        }
        return instance;
    }

    // Example methods to manage configuration settings
    private String setting;

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public String getSetting() {
        return setting;
    }

    public static void main(String[] args) {
        // Access the Singleton instance
        Configuration config1 = Configuration.getInstance();
        Configuration config2 = Configuration.getInstance();

        // Test the Singleton behavior
        config1.setSetting("DatabaseURL: jdbc:mysql://localhost");
        System.out.println(config2.getSetting()); // Output: DatabaseURL: jdbc:mysql://localhost

        // Verify both references point to the same instance
        System.out.println(config1 == config2); // Output: true
    }
}

