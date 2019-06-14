import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {

    static int calcVolume(int l, int w, int h){
        int volume = l * w * h;
        return volume;
    }


    public static void main(String[] args){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Please provide dimensions of package. Length, Width, Height & Weight:");



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

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
