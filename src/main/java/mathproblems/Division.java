package mathproblems;

public class Division {


    public void getDivisors(int number){
        for (int i=1; i<number+1; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
            }
    }

            public static void main (String[]args){
                Division division = new Division();
                System.out.println("A szám osztói:");
                division.getDivisors(55);
            }
        }