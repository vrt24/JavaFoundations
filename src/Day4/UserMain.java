package Day4;

public class UserMain {
    public static void main(String[] args){
        UserLogin u1=new UserLogin("vamsi24","vamsirohit");
        u1.setPassword("123");
        u1.setPassword("welcome");
        System.out.println(u1.validateLogin("hello"));
        System.out.println(u1.validateLogin("vamsirohi"));
        System.out.println(u1.validateLogin("welcome"));
    }
}
