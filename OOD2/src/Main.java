public class Main {
    public static void main(String[] args) {

        EmailServiceSingleton.getInstance().sendMessage("dfdfdsfs");
        emailService();
    }

    public static void emailService() {
        EmailServiceSingleton.getInstance().sendMessage("rerere");
    }
}
