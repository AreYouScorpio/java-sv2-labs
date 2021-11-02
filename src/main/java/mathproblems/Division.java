package mathproblems;

public class Division {


    public void getDivisors(int number){
        for (int i=1; i<number+1; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
            }
    }

    public void getRightNumbers(int[] numbers){
        //if numbers[0]=1
        for (int i=1; i<numbers.length;i++){
            if (numbers[i]%(i+1)==0) {
                System.out.println(numbers[i]);
            };
        }
    }


    public static void main (String[]args){
                Division division = new Division();
                System.out.println("A szám osztói:");
                division.getDivisors(55);
                System.out.println();


                int [] numbers = {1,4,4,4,5};
                division.getRightNumbers(numbers);
            }
        }