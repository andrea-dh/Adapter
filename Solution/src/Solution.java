import java.util.Scanner;

class UsernameValidator{
    public static String regularExpression;
    static {
        String userName=Solution.getUserName();
        String user = String.valueOf(userName.charAt(0));
        if ((userName.length() >= 8 && userName.length() <= 30) &&
                (userName.matches("")) &&
                (user.matches("^[a-zA-Z^]+$"))) {
            regularExpression=userName;
        }
        else regularExpression=" ";
    }

}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    public static String userName;

    public static String getUserName() {
        return userName;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

        }


    }
    }
