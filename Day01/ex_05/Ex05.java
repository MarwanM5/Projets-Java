import java.util.ArrayList;

public class Ex05 {
    public static ArrayList<String> myGetArgs(String... var) {
        ArrayList<String> argsList = new ArrayList<>();

        for (String arg : var) {
            argsList.add(arg);
        }

        return argsList;

    }

    public static void main(String[] args) {
        ArrayList<String> arguments = myGetArgs("arg1", "arg2", "arg3");

        for (String arg : arguments) {
            System.out.println(arg);
        }
    }
}
