//39.	Write a Program to display name in short form. E.g. Ram Kishore Singh  -> R. k. Singh

package Assignment;

public class Q39StringShortForm {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = sc.next();*/
        Q39StringShortForm ob = new Q39StringShortForm();
        System.out.print("Initials with surname is: ");
        ob.printNameWithInitials("giri raJ arYal");
    }

    void printNameWithInitials(String name) {
       name = name.trim(); // removes leading and training spaces, if present
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' ') {
                str1 = str1 + ch;
            } else {
                System.out.print(Character.toUpperCase(str1.charAt(0)) + ". ");
                str1 = "";
            }
        }
        // output: str1= G. R. arYal

        for (int j = 0; j < str1.length(); j++) {
            if (j == 0) {
                System.out.print(str2);
                str2 = str2 + Character.toUpperCase(str1.charAt(0));

            } else {
                str2 = str2 + Character.toLowerCase(str1.charAt(j));
            }
        }
            System.out.print(str2);
        }
    }
