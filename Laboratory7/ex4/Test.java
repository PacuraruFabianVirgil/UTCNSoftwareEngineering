package pacuraru.fabian.lab7.ex4;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> moreCars = new ArrayList<>();
        int n=0;
        while(n!=4) {
            System.out.print("\n1. Add a car\n2. Get a car\n3. Get all cars\n4. Exit\n");
            n = scanner.nextInt();
            switch(n) {
                case 1:
                    System.out.print("Write the model of the car\n");
                    String model = scanner.next();
                    System.out.print("Write the price of the car\n");
                    double price = scanner.nextDouble();
                    Car car = new Car(model, price);
                    moreCars.add(car);
                    URL path = Test.class.getResource("Cars.txt");
                    try {
                        FileOutputStream fileOut = new FileOutputStream("src/pacuraru/fabian/lab7/ex4/Cars.txt");
                        ObjectOutputStream out = new ObjectOutputStream(fileOut);
                        out.writeObject(moreCars);
                        out.close();
                        fileOut.close();
                    }
                    catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.print("Write the model of the car\n");
                    model = scanner.next();
                    try {
                        FileInputStream fileIn = new FileInputStream("src/pacuraru/fabian/lab7/ex4/Cars.txt");
                        ObjectInputStream in = new ObjectInputStream(fileIn);
                        moreCars = (ArrayList<Car>)in.readObject();
                        for(int i=0; i<moreCars.size(); i++){
                            Car car1 = moreCars.get(i);
                            if (car1.getModel().compareTo(model)==0) {
                                System.out.print("Car " + car1.getModel() + " is " + car1.getPrice() + " euro.\n");
                            }
                        }
                        in.close();
                        fileIn.close();
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                        return;
                    }
                    break;
                case 3:
                    try {
                        FileInputStream fileIn = new FileInputStream("src/pacuraru/fabian/lab7/ex4/Cars.txt");
                        ObjectInputStream in = new ObjectInputStream(fileIn);
                        moreCars = (ArrayList<Car>)in.readObject();
                        for(int i=0; i<moreCars.size(); i++){
                            Car car2 = moreCars.get(i);
                            System.out.print("Car "+car2.getModel()+" is "+car2.getPrice()+" euro.\n");
                        }
                        in.close();
                        fileIn.close();
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                        return;
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.print("Invalid input\n");
            }
        }
    }
}
