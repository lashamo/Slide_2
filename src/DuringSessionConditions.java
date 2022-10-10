public class DuringSessionConditions {

    public static void main(String[] args) {

        // && - და
        // || - ან

        int number = 17;
        // **********************************
        if (number % 3 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        // **********************************
        if (number > 9 && number <= 99) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }


        // **********************************
        char c = 'p';
        if (c == 'a' || c == 'i' || c == 'o' || c == 'u' || c == 'i') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }



        // **********************************
        int a = 19, b = 20;
        if (a > b) {
            System.out.println("a");
        } else if (b > a) {
            System.out.println("b");
        } else {
            System.out.println("Equals");
        }



        // **********************************
        char operation = '-';
        int x = 15, y = 10;
        switch (operation) {
            case '+' :
                System.out.println(x + y);
                break;
            case '-' :
                System.out.println(x - y);
                break;
            case '*' :
                System.out.println(x * y);
                break;
            case '/' :
                System.out.println(x / y);
                break;
        }

    }
}
