import javax.swing.JOptionPane;   //generates a dialog box apparently
public class pwdcheck 
{
    public static void main(String[]args)
    {
        //take inputs

        String username = JOptionPane.showInputDialog("Enter username : ");  
        String password = JOptionPane.showInputDialog("Enter password : ");

        if
        (password != null &&
        username != null &&
        (password.equals("sevenoptionsearly") &&
        username.equals("khyahahati")
        )
        )
        {
            JOptionPane.showMessageDialog(null,"***You're in!***");
        }
        else{
            JOptionPane.showMessageDialog(null,"***Incorrect Password***");
        }

    }
    
}
