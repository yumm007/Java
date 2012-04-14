package com.login;
import com.config.Config;   
import java.util.Scanner;
public class Login{
    public static void main(String[ ] args){
	Scanner sc = new Scanner(System.in);
	while(true){
	    Config config = Config.getInstance();
	    System.out.print("your username:");
	    String username = sc.next();
	    System.out.print("your password:");
	    String password = sc.next();
	    if(username.equals(config.getUsername()) && password.equals(config.getPassword())){
		System.out.println("登录成功！");   break;
	    }else{
		System.out.println("用户名密码错误，请重新登录！");
	    }
	}
    }
}