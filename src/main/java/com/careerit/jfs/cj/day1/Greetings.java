public class Greetings {
    public static void main(String[] args) {
        String username = "user";
        if(args.length > 0)
        {
            username = args[0];
        }

        System.out.println("Hello world!");
        System.out.println("hi "+username+",\n\tWelcome to java World");
    }

}