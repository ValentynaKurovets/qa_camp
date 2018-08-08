public class EmailServiceSingleton {
    private static EmailServiceSingleton INSTANCE = new EmailServiceSingleton();

    protected EmailServiceSingleton() {
    }

    public static EmailServiceSingleton getInstance() {
        return INSTANCE;
    }

    public void sendMessage(String message) {
        System.out.println("Email is sent " + message);
    }


}
