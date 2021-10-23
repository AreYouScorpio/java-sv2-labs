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
        boolean a = username.length()>0;
        return a;
    }
}
