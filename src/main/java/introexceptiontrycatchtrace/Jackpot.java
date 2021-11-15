package introexceptiontrycatchtrace;

public class Jackpot {
    public static void main(String[] args) {

        Winner winner = new Winner();

        try {
            winner.getWinner();
        }
        catch (NullPointerException npe){
            System.out.println("Null érték !! " + npe.getMessage());
        }

    }
}
