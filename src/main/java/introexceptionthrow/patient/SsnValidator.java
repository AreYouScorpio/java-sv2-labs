package introexceptionthrow.patient;

public class SsnValidator {

        public boolean isValidSsn(String ssn){
            int checkvalue1 = 0;
            int checkvalue2 = 0;
            if (ssn.length()<9) throw new IllegalArgumentException("túl rövid TAJ szám");
            char [] taj = ssn.toCharArray();
                checkvalue1 = ((int) taj[1] * 3 + (int) taj[2] * 7 +
                        (int) taj[3] * 3 + (int) taj[4] * 7 +
                        (int) taj[5] * 3 + (int) taj[6] * 7 +
                        (int) taj[7]  *3 )  ;
            checkvalue2 = checkvalue1 % 10;
            String checkvalue3 = String.valueOf(taj[8]);
            System.out.println(checkvalue1); //1726
            System.out.println(checkvalue2); // 6
            System.out.println(checkvalue3); // 6 string
            System.out.println(taj[8]); // 6

            try{
           if (checkvalue2 == Integer.parseInt(checkvalue3)) {

               System.out.println("okay");
               return true;
           }
           }

            catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
return false;
    }
}
