import javax.swing.JOptionPane;

public class PasswordDriver
{
   public static void main(String[] args)
   {
      String password;
      
      // input a password
      password = JOptionPane.showInputDialog("Choose a Password: \n "+
                                             "Passwords must be at least 6 characters long \n" +
                                             "Have at least 1 UPPERCASE letter \n" +
                                             "Have at least 1 lowerCASE letter \n" +
                                             "And have at least 1 numerical digit \n\n" +
                                              "Enter a Password: ");
      // determine whether or not the password is valid
      if(PasswordVerifier.validPassword(password))
         JOptionPane.showMessageDialog(null, password + " is valid");
      else
         JOptionPane.showMessageDialog(null, password + " is invalid");
   }
}
//working with github

//I think it works this way