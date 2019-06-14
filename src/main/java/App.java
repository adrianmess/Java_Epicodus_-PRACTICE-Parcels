import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {

    static int calcVolume(int l, int w, int h){
        int volume = l * w * h;
        return volume;
    }

    static double costToShip(int volume, String speed, String giftWrap, double weight){
        int costToShip = 0;
        int volumeCost =(volume / 10);
        int wrapCost = 0;
        double weightCost = weight * .25;

        if (speed.equals("priority")) {
            costToShip += 9;
        } else if (speed.equals("ground")) {
            costToShip += 3;
        }

        if (giftWrap.equals("yes")) {
            costToShip +=4;
        } else if (giftWrap.equals("no")) {
            costToShip +=0;
        }
        double finalCost = costToShip + volumeCost + wrapCost + weightCost;
        return finalCost;
    }

    public static void main(String[] args){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Please provide dimensions of package. Length, Width, Height & Weight:");

        boolean programRunning = true;

        while (programRunning) {
            try {
                System.out.println("Length: ");
                int length = Integer.parseInt(bufferedReader.readLine());

                System.out.println("Width: ");
                int width = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Height: ");

                int height = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Weight (in lbs): ");

                double lbs = Integer.parseInt(bufferedReader.readLine());
                int volume = calcVolume(length, width, height);

                System.out.println("The volume of your package is: " + volume);

                System.out.println(" ");
                System.out.println("Please type the shipping speed you want:");
                System.out.println("'Priority' (1-3 days):");
                System.out.println("'Ground' (3-7 days):");
                String speed = bufferedReader.readLine().toLowerCase();

                System.out.println(" ");
                System.out.println("Would you like gift wrapping?  Yes or No?");
                String giftWrap = bufferedReader.readLine().toLowerCase();

                System.out.println(" ");
                System.out.println("Your total shipping price comes to ");


                double finalCost = costToShip(volume, speed, giftWrap, lbs);
                System.out.println(finalCost);

                System.out.println("Type 'exit' to quite or hit return to start new order");
                String newOrderOrExit = bufferedReader.readLine();
                System.out.println(newOrderOrExit);
                if (newOrderOrExit.equals("exit")) {
                     programRunning = false;
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
        }



        }

}
