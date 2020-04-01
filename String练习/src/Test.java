import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class UserError extends Exception{
    public UserError(String message){
        super(message);
    }
}

class PasswordError extends Exception{
    public PasswordError(String message){
        super(message);
    }
}

public class Test {
    private static String username="admin";
    private static String password="123456";

    public static void main(String[] args) {
        try {
            login("admin", "123456");
        }catch(UserError userError){
            userError.printStackTrace();
        }catch (PasswordError passwordError){
            passwordError.printStackTrace();
        }

    }

    private static void login(String username, String password) throws UserError,PasswordError{
        if(!Test.username.equals(username)){
            throw new UserError("用户名错误");
        }
        if(!Test.password.equals(password)){
            throw new PasswordError("密码错误");
        }

        System.out.println("登录成功");
    }

    /*public static void main(String[] args) {
        int[] arr={1,2,3};
        try{
            System.out.println("before");
            System.out.println(arr[100]);
            System.out.println("after");

        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("after try catch");

    }*/
}
