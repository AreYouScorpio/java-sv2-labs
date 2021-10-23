package registration;

public class UserValidator {
    public String username;
    public String password1;
    public String password2;
    public String email;

/*    public UserValidator (String username)
    {
        this.username = username;
    }
*/
    public boolean isValidUsername(String username)

    {
        boolean a = username.length()> 0;
        return a;
    }
    public boolean isValidPassword(String password)

    {
        boolean b = password.length()==8;
        return b;
    }

    public boolean isValidEmail(String email)

    {
        int kukac;
        kukac = email.indexOf("@");
        System.out.println("Kukac helye: " + (kukac+1));
        int pont;
        pont = email.indexOf(".",kukac+1);
        System.out.println("Pont helye: " + (pont+1));

        boolean c = email.length()> 0 && kukac>0 && pont>kukac ;
        return c;
    }

}
