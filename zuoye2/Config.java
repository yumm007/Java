//编写一个Config类，其在com.config包下，
//具有两个String类型的私有属性username和password，
//分别提供getUsername()和getPassword()两个公有的方法访问上述属性，
//在对象构造时通过控制台读入的方式给username和password赋值，
//该类提供一个static的方法getInstance()获取该类的一个实例,
//并保证客户代码多次调用总得到相同的实例。

package com.config;
import java.util.Scanner;
public class Config {
    private String username;
    private String password;

    private static Config one = null;

    public String getUsername() {
	return username;
    }

    public String getPassword() {
	return password;
    }

    Config() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter new user name: ");
	username = sc.next();
	System.out.print("Please enter the password for " + username + ": ");
	password = sc.next();
    }

    public static Config getInstance() {
	if (one == null)
	    one = new Config();
	return one;
    }

}
/*
class test {
    public static void main(String[] argv) {
	Config a = Config.getInstance();
	Config b = Config.getInstance();
	
	System.out.println("A: username = " + a.getUsername() + "; Password = " + a.getPassword());
    	System.out.println("B: username = " + b.getUsername() + "; Password = " + b.getPassword());
    }
}
*/
