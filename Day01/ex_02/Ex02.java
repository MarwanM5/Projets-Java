public class Ex02 {
    public static String getAngryDog(int nbr) {
        String woofs = "";
        for (int i = 0; i < nbr; i++) {
            woofs += "woof";
        }


        return woofs;
    }

    public static void main(String[] args) {
        int numberOfWoofs = 3;
        String woofString = getAngryDog(numberOfWoofs);
        System.out.println(woofString);
    }
}

