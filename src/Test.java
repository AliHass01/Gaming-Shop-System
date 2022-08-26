import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Name:");
        String name = input.next();
        System.out.println("Enter your Age:");
        int age = input.nextInt();
        System.out.println("Enter number of people: ");
        int number = input.nextInt();
        System.out.println("Enter number of hours:");
        double numOfHours = input.nextDouble();
        System.out.println("Enter type of Gaming device:");
        TypeOfDevice type = TypeOfDevice.valueOf(input.next().toUpperCase());

        System.out.println("Enter PR for private room, Enter PU for public room ");
        String ch = input.next().toUpperCase();

        switch (ch){
            case "PR":
                PrivateRoom pr = new PrivateRoom(name ,number ,age,numOfHours,type);
                System.out.println(pr);
                break;

            case "PU":
                PublicRoom pu = new PublicRoom(name ,number ,age,numOfHours,type);
                System.out.println(pu);
                break;
        }

    }



}
