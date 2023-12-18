
public class Ex04 {
    public static void  printMovieFromNbr(int nbr) {
        String movieTitle;

        switch (nbr) {
            case 3:
                movieTitle = "The Three Brothers";
                break;
        
            case 6:
                movieTitle = "The Sixth Sense";
                break;

            case 23:
                movieTitle = "The Number 23";
                break;

            case 28:
                movieTitle = "28 Days Later";
                break;

            
            default:
                movieTitle = "I don't know."; 
                break;
        }
        System.out.println(movieTitle);
    }   

    public static void main(String[] args) {
        int value = 3;
        printMovieFromNbr(value);
    }
}
