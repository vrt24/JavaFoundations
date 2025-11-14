package Day4;

public class UserLogin {
    private String username;
    private String password;

    public UserLogin(String username, String password){
        this.username=username;
        setPassword(password);
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(String newPassword){
        if(newPassword.length()<6){
            System.out.println("Weak Password");
            return;
        }
        this.password=newPassword;
    }
    public boolean validateLogin(String enteredPassword){
        return password.equals(enteredPassword);
    }
}
