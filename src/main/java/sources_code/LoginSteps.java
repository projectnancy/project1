package sources_code;

import java.util.ArrayList;
import java.util.Scanner;




public class LoginSteps {

	public LoginSteps() {};
	 String password;
	 String username;
	
	private   static boolean isLoginadmin =false;
	private  static  boolean isLogincustomer =false;
	private   static boolean isLoginworker =false;
	private static boolean isLoginonuser =false;
	private static boolean f0 =false;
	private static boolean f1 =false;

	public static int x;
	public LoginSteps(String username, String password) {
		
		this.username=username;
		this.password=password;
		
		
	}
	public int getx() {
		return x;
	}
	public void setx(int x) {
		LoginSteps.x=x;
	}
	public boolean getisLoginadmin() {
		return isLoginadmin ;	
	}
	public void setisLoginadmin(boolean isLoginadmin) {

		LoginSteps.isLoginadmin = isLoginadmin;		
	}
	
	public boolean getisLogincustomer() {
		return isLogincustomer ;	
	}
	public void setisLogincustomer(boolean isLogincustomer) {
		LoginSteps.isLogincustomer = isLogincustomer;		
	}
	
	public boolean getisLoginworker() {
		return isLoginworker ;	
	}
	public void setisLoginworker(boolean isLoginworker) {
		LoginSteps.isLoginworker = isLoginworker;		
	}
	
	public boolean getisLoginonuser() {
		return isLoginonuser ;	
	}
	public void setisLoginonuser(boolean isLoginonuser) {
		LoginSteps.isLoginonuser = isLoginonuser;		
	}
	
	
	public String getName() {
		return username ;	
	}
	public void setName(String name) {
		this.username = name;		
	}
	public String getpassword() {
		return password ;	
	}
	public void setpassword(String password) {
		this.password = password;		
	}
	Scanner input=new Scanner(System.in);
	static ArrayList <LoginSteps> userslogin= new ArrayList<LoginSteps>();
	static ArrayList <LoginSteps> workerlogin= new ArrayList<LoginSteps>();

	boolean isLogin =false;
	public int failsauthentication;
	private static Scanner input2;
	private Scanner input3;
	
	

     public static  void  inti() {
    	 userslogin.add(new LoginSteps("nancy sawalmeh","***"));
    	 userslogin.add(new LoginSteps("nancys","12345"));
    	 userslogin.add(new LoginSteps("masa","19345"));
    	 userslogin.add(new LoginSteps("noor","12745"));
    	 

     }
     public static  void  inti1() {
    	 workerlogin.add(new LoginSteps("masar","1235"));
    	 workerlogin.add(new LoginSteps("masr","1325"));
    	 workerlogin.add(new LoginSteps("masar3","0335"));
    	 workerlogin.add(new LoginSteps("masr33","0035"));
     }
     
     
     
     public  void  addnewlogin() {
    	//boolean e= cus.getissave();
    	//System.out.print(e);1274
    	if(Customersteps.issave) {
    	 System.out.println("Enter Username : ");
 		input3 = new Scanner(System.in);
 		String username=input3.nextLine();
 		
 		System.out.println("Enter password : ");
		String pass=input3.nextLine();
		if(pass=="***") {
			System.out.println("invaild ");
			addnewlogin();
		}
   	 userslogin.add(new LoginSteps(username,pass));
    	}
    	 
     }
	public static int authenticate_login () {
		 inti();
		 inti1();
		 boolean flag=false;
		 boolean flag0=false;
		System.out.println("Enter Username : ");
		input2 = new Scanner(System.in);
		String username=input2.nextLine();
		for(int i=0;i<userslogin.size()&&i<workerlogin.size();i++) {
			 if(userslogin.get(i).username.equals(username)) {
				System.out.println("Enter password : ");
				String pass=input2.nextLine();
				if(userslogin.get(i).password.equals(pass)) {
					flag = true;
					f0=true;
					return i;
				}
				else {
					System.out.println(" Error :( wrong password,please enter password again) :");
					String pas=input2.nextLine();
					if(userslogin.get(i).password.equals(pas)) {
						flag =true;
						f0=true;
	                    return i;}
			 }
			  flag0=true; }
			 else {
				 if(workerlogin.get(i).username.equals(username)) {
						System.out.println("Enter password : ");
						String pass=input2.nextLine();
						if(workerlogin.get(i).password.equals(pass)) {
							flag = true;
							f1=true;
							return i;
						}
						else {
							System.out.println(" Error :( wrong password,please enter password again) :");
							String pas=input2.nextLine();
							if(workerlogin.get(i).password.equals(pas)) {
								flag =true;
								f0=true;
			                    return i;}
					 }
					  flag0=true; }
			 }
			 }
			 
		if(flag0==false) {
			for(int i=0;i<userslogin.size()&&i<workerlogin.size();i++) {
				 if(userslogin.get(i).username.equals(username)) {
					System.out.println("Enter password : ");
					String pass=input2.nextLine();
					if(userslogin.get(i).password.equals(pass)) {
						flag = true;
						f0=true;
						return i;
					}
					else {
						System.out.println(" Error :( wrong password,please enter password again) :");
						String pas=input2.nextLine();
						if(userslogin.get(i).password.equals(pas)) {
							flag =true;
							f0=true;
		                    return i;}
				 }
				  flag0=true; }
				 else {
					 if(workerlogin.get(i).username.equals(username)) {
							System.out.println("Enter password : ");
							String pass=input2.nextLine();
							if(workerlogin.get(i).password.equals(pass)) {
								flag = true;
								f1=true;
								return i;
							}
							else {
								System.out.println(" Error :( wrong password,please enter password again) :");
								String pas=input2.nextLine();
								if(workerlogin.get(i).password.equals(pas)) {
									flag =true;
									f1=true;
				                    return i;}
						 }
						  flag0=true; }
				 }
				 }
		}
		
		 if(flag0==false) {
				System .out.print(" you are not user\n");
				isLoginonuser =true;
			}
		 if(flag==false) {
			
				System .out.print("\n you are blocked\n");
				isLoginonuser =true;
			}
	return -1;
		}
		
	public static void  usernotfound () {
		
		if(isLoginonuser==true) {
			x=-1;
		}
		
		
	}
	
	public static void  Whos_the_user () {
		int count1=0;
		int count=0;
		String S=null;
		String A=null;
		x= authenticate_login ();
		if(x>-1) {
			if(f0==true) {S=userslogin.get(x).getpassword();}
		    if(f1==true) {A=workerlogin.get(x).getpassword();}
		
		if(S!=(null) ) {
		for(int k=0;k<S.length();k++) {
			 if(Character.isDigit(S.charAt(k))) {
				
			      count++;}
		}}
		if( A!=(null) ) {
		for(int k=0;k<A.length();k++) {
			 if(Character.isDigit(A.charAt(k))) {
			count1++;}}
		}
	
		if("***".equals(S))
	    {   
			
				isLoginadmin=true;
				f0=false;
				f1=false;
			
		}
        else {
			
			isLogincustomer =true;
			f0=false;
			f1=false;
		}
		
		
		 if(count1==4) { 
			
			
			isLoginworker =true;
			f0=false;
			f1=false;
			}
			
		
		if(x==-1) {
			isLoginonuser =true;
		}
		
		
	}
		
	}	
		
	
	 
	
}
