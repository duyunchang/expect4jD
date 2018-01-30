package com.demo.test;

import com.nemo.javaexpect.shell.Shell;
import com.nemo.javaexpect.shell.driver.SshDriver;
import com.nemo.javaexpect.shell.driver.TelnetDriver;

public class Demo {
	  public static void main(String[] args) {  
		  Demo demo=new Demo();     
		  demo.sshLogin();
	 }  
	  
	  private void sshLogin(){
		  SshDriver driver = new SshDriver("15.252.181.79", "guest", "guest","guest>");  
		  Shell shell = driver.open();  
		  shell.execute("ls");  
		  shell.send("ls");  
		  shell.expect("guest>" );  
		  System.out.println(shell.execute("ls").getCommandResult());    
		  
	  }
	 private void telnetLogin(){
		 TelnetDriver driver= new TelnetDriver("47.93.253.241");  
	      driver.setAutoLogin("root", "dycdyc000@", "root>");  
	      Shell shell = driver.open();  
	      shell.execute("ls");  
	      shell.execute("pwd");  
	      shell.close();    
		  
	  }
}
