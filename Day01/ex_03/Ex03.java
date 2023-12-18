import java.util.ArrayList;

public class Ex03 {
    public static void printArray(ArrayList<String> myArray) {
        for (int i = 0; i < myArray.size(); i++) {
            System.out.println(myArray.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<String> myArray = new ArrayList<>();
        myArray.add("Volvo");
        myArray.add("BMW");
        myArray.add("Ford");
        myArray.add("Mazda");

        printArray(myArray);
    }
}
