package sources_code;

import static sources_code.ProdectSteps.rugDetails;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Customersteps {
	static LoginSteps  log= new LoginSteps();
	static InvoiceSteps in=new InvoiceSteps();
	static ReportsSteps R=new ReportsSteps();
	static Worker w =new Worker();
    static Order o=new Order();
    static int x=log.getx();
    double count=0.0;
	public static boolean Generate;

	public ArrayList<ProdectSteps> shoppingcart=new ArrayList<ProdectSteps>();
	public ArrayList<Order> order=new ArrayList<Order>();
	ProdectSteps pro=new ProdectSteps();
	private int id;
	private String name;
	private Integer phone;
	private String address;
	public boolean issavee=false; 
	public static boolean issave;
    private double  balance;

	public Customersteps(int ids, String names, Integer phones,String addres){
		this.id=ids;
		this.name=names;
		this.phone=phones;
		this.address=addres;
	
	}
	public boolean Generate() {
		return Generate;
	}
	
	public void setGenerate(boolean Generate) {
		Customersteps.Generate=Generate;
	}
	
	public Customersteps(){}
	public int getid() {
		return id ;	
	}
	public double getbalance() {
		return  balance;
		
	}
	public void setbalance(double balance) {
		this.balance=balance;
	}
	
	public boolean getissave() {
		return issavee ;	
	}
	public void setissave(boolean issave) {
		this.issavee = issave;		
	}
	
	public void setid(int id) {
		this.id = id;		
	}
	public String getname() {
		return name ;	
	}
	public void setname(String name) {
		this.name = name ;		
	}
	public int getphone() {
		return phone;	
	}
	
	public void setphone(int phone) {
		this.phone= phone;		
	}
	public String getaddress() {
		return address ;	
	}
	public void setaddress(String address) {
		this.address = address ;		
	}
	
	public ArrayList <Customersteps> mylist =new ArrayList<Customersteps>();
	private Scanner input2;
	

	public void recordinformationinit() {
		mylist.add(new Customersteps(1,"nancy",0555,"nublse"));
		mylist.add(new Customersteps(2,"masa",0222,"tullkarem"));
		mylist.add(new Customersteps(4,"noor shole",1778,"hebron"));
		mylist.add(new Customersteps(5,"noor sawalmeh",1778,"hebron"));
		mylist.add(new Customersteps(6,"noor sawalmeh",1778,"hebron"));




	}
	
	
public void saveinformation_custmer(){
	
	System.out.println("enter id =");
	  input2 = new Scanner(System.in);
	 int idd=input2.nextInt();  
	  
	  for(int i=0; i<mylist.size();i++) {
		  if(mylist.get(i).id != idd) {
		  this. issavee=true;
		  issave=issavee;
		  }}
		
		 
	  
	  if(issavee) {
		  System.out.println(issavee);

	  System.out.println("\nenter name =");
	  input2 = new Scanner(System.in);
		String name =input2.next();
		
		 System.out.println("\n enter phone =");
		  input2 = new Scanner(System.in);
		int phone =input2.nextInt();
			
	
			 System.out.println("\n enter address =");
			  input2 = new Scanner(System.in);
				String address =input2.next();
				
	mylist.add(new Customersteps(idd,name,phone,address));
	System.out.println("\n successfull to save information");
	}
		

}
	  
	  
	
public void show_customer() {
System.out.printf(" id :  %s || ",getid());
System.out.printf(" Name customer : %s  ||",getname());
System.out.printf(" phone customer :  ");
System.out.print(getphone());
System.out.printf(" || Address customer : %s .",getaddress());
System.out.print(" \n");



}

public void updetecustomer() {
	int flag=0;
	for (Customersteps c:mylist) {
			c.show_customer();
	}
	System.out.println("\n ENTER ID =");
	input2 = new Scanner(System.in);
	 int id1=input2.nextInt(); 
	 for(int i=0;i<mylist.size();i++) {
		 if(mylist.get(i).getid()==id1) {
			 flag=1;
			 System.out.println("enter new name");
			 input2 = new Scanner(System.in);
			String namenew=input2.nextLine();
			 System.out.println("enter new phone");
			 input2 = new Scanner(System.in);
			int phonenew=input2.nextInt();
			
			 System.out.println("enter new address");
			 input2 = new Scanner(System.in);
			String adderssnew=input2.nextLine();
			mylist.get(i).updatecustomrer(id1,namenew,phonenew,adderssnew);
            
            System.out.println("customer updated successfully.");
			
		 }
		 
	 }
	 if (flag==0) {
         System.out.println("NOT FOUNG CUSTOMER.");

	 }
}


private void updatecustomrer(int id1, String namenew, int phonenew, String adderssnew) {
	this.id=id1;
	this.name=namenew;
	this.phone=phonenew;
	this.address=adderssnew;
	
}
public void deletecustomer() {
	for (Customersteps c:mylist) {
		c.show_customer();
}
System.out.println("\n ENTER ID =");
input2 = new Scanner(System.in);
 int id1=input2.nextInt(); 
 for(int i=0;i<mylist.size();i++) {
	 if(mylist.get(i).getid()==id1) {
		mylist.remove(i) ;
        System.out.println("customer deleted successfully.");

	 }
	 }
	
	
}

public void addshopping() {
	System.out.println(log.getx());

	pro.carpetdetails();
	pro.coverdetails();
	int copy=0;
	int flage=0;
	int f=1;
	input2 = new Scanner(System.in);
	System.out.println("\nEnter ID=");

	int idprodrct=(input2.nextInt());
	 if(mylist.get(log.getx()).shoppingcart != null) {
		 for(int i=0;i<mylist.get(log.getx()).shoppingcart.size();i++) {
	    		if(mylist.get(log.getx()).shoppingcart.get(i).getid()==(idprodrct)) {
	    			System.out.println("the prodect  is found\n");
	    			System.out.println("DO you want to change Quantity\n");
	    			while(f==1) {
	    			System.out.println("yes: Enter number 1 to increase\n");
	    			System.out.println("yes: Enter number 2 to reduce\n");
	    			System.out.println("NO: Enter number 2 \n");
	    			int number=Integer.parseInt(input2.nextLine()); 
	    			switch(number) {
	    			case 1:{
	    				
						  copy =mylist.get(log.getx()).shoppingcart.get(i).getQuantity() +1;
						  for(int j=0;j<ProdectSteps.rugDetails.size();j++) {
							  if(rugDetails.get(j).getid()==(idprodrct )) {
						    
							   mylist.get(log.getx()).shoppingcart.get(i).setQuantity(copy);
							  mylist.get(log.getx()). setbalance(mylist.get(log.getx()).getbalance()+(rugDetails.get(j).getprice()*1));
    						 flage=1;
    						   break;}

						  }
						  if(flage==0) {
	    		                   System.out.println("not available\n");
                                
	    					   }	
						  break;  }//case1
	    			 
	    		case 2:{
    				
					  copy = mylist.get(log.getx()).shoppingcart.get(i).getQuantity() -1;
					  for(int j=0;j<ProdectSteps.rugDetails.size();j++) {
						  if(rugDetails.get(j).getid()==(idprodrct )) {
							   mylist.get(log.getx()).shoppingcart.get(i).setQuantity(copy);
								  mylist.get(log.getx()). setbalance(mylist.get(log.getx()).getbalance()-(rugDetails.get(j).getprice()*1));
								  flage=1;
						   break;
					   
					    
					    }}
					  if(flage==0) {
		                   System.out.println("not available\n");
                       
					   }	
				  break; 
					  
	    		}//case2
	    		case 3:{
	    			f=0;
	    			break;}
	    		
    			default:{
                    System.out.println("Default! ");
                    break;}
    		  
	    			}
	    			}
	    		   
	    			}}
		 if(flage==0) {
			 for(int j=0;j<rugDetails.size();j++) {
				 if(rugDetails.get(j).getid()==(idprodrct)) {
					 System.out.print("\nEnter number of quantity=");
					   copy =(input2.nextInt());
						  mylist.get(log.getx()). setbalance(mylist.get(log.getx()).getbalance()+(rugDetails.get(j).getprice()*copy));
					   mylist.get(log.getx()).shoppingcart.add(new ProdectSteps(rugDetails.get(j).getCategory(),rugDetails.get(j).getid(),rugDetails.get(j).getName(),rugDetails.get(j).getPicture(),rugDetails.get(j).getDescriptions(),
							  rugDetails.get(j).getprice(),rugDetails.get(j).getMaterial(),rugDetails.get(j).getCleaning(),copy));
				   
				 }
				 
			 }
			
		 }
		 }
	 else {
		 for(int j=0;j<rugDetails.size();j++) {
			 if(rugDetails.get(j).getid()==(idprodrct)) {
				 System.out.print("Enter number of quantity=");
				   copy =Integer.parseInt(input2.nextLine());
					  mylist.get(log.getx()). setbalance(mylist.get(log.getx()).getbalance()+(rugDetails.get(j).getprice()*copy));
				   mylist.get(log.getx()).shoppingcart.add(new ProdectSteps(rugDetails.get(j).getCategory(),rugDetails.get(j).getid(),rugDetails.get(j).getName(),rugDetails.get(j).getPicture(),rugDetails.get(j).getDescriptions(),
						  rugDetails.get(j).getprice(),rugDetails.get(j).getMaterial(),rugDetails.get(j).getCleaning(),copy));
			   
			 }
			 
		 }
	 }
	    		}	      
								   
public void showshopping() {
	
	System.out.println(log.getx());
	
	for(int k=0;k<mylist.get(log.getx()).shoppingcart.size();k++) {
    	for(int i=0;i<rugDetails.size();i++) {
    		if(mylist.get(log.getx()).shoppingcart.get(k).getid()==rugDetails.get(i).getid()) {
    			mylist.get(log.getx()).setbalance(mylist.get(log.getx()).getbalance()-(mylist.get(log.getx()).shoppingcart.get(k).getprice()*mylist.get(log.getx()).shoppingcart.get(k).getQuantity()));
    			mylist.get(log.getx()).shoppingcart.get(k).setprice(rugDetails.get(i).getprice());
    			mylist.get(log.getx()).setbalance(mylist.get(log.getx()).getbalance()+(rugDetails.get(i).getprice()*mylist.get(log.getx()).shoppingcart.get(k).getQuantity()));
				
    		}}}
	
	 for(ProdectSteps pro :mylist.get(log.getx()).shoppingcart) {
		   pro.print();}
         System.out.println("balance= ");
         System.out.println(mylist.get(log.getx()).getbalance());
        
         System.out.println("\n ");
       
         if(mylist.get(log.getx()).getbalance()>=400) {
        	 in.setdiscount(true);
	         System.out.println("balance after discount=");
	        mylist.get(log.getx()).setbalance(mylist.get(log.getx()).getbalance()-(mylist.get(log.getx()).getbalance()*(.1)));
	         System.out.println(mylist.get(log.getx()).getbalance());
	         System.out.println("\n ");
	         }
         else {
        	 in.setdiscount(false);
         }
}
							   
public void removeshopping() {
	 for(ProdectSteps pro :mylist.get(log.getx()).shoppingcart) {
		   pro.print();}

	 if(mylist.get(log.getx()).shoppingcart.isEmpty()) {
		 System.out.println("the arraylist is null ");}
	 else {
		 System.out.println("Enter Id of prodect = ");
		  int idprodect=input2.nextInt();
		  for(int j=0;j<rugDetails.size();j++) {
				 if(rugDetails.get(j).getid()==idprodect) {
				 mylist.get(log.getx()).setbalance((mylist.get(log.getx()).getbalance())-(mylist.get(log.getx()).shoppingcart.get(j).getprice()*mylist.get(log.getx()).shoppingcart.get(j).getQuantity()));
				 
				 
		  mylist.get(log.getx()).shoppingcart.remove(j);}
	 }
	 }
	 
}
public void ckeckout()	{
	w.informationworker();
	int f=1;
	int count=0;
	System.out.println(log.getx());
if(mylist.get(log.getx()).shoppingcart .isEmpty() ) {
	 in.setisgenerate(false);
		System.out.println("shopping cart is null");
		f=0;
	}
	if(f==1) {
		
		in.setisgenerate(true);
		System.out.println("\n -----------------------------------------------------");
	    System.out.println("                -------Receipt ---------        ");
	System.out.println(" Address : "+mylist.get(log.getx()).getaddress());
	System.out.println("\n -----------------------------------------------------");

	for(ProdectSteps pro :mylist.get(log.getx()).shoppingcart) {
		   pro.print();
		   count++;}
	  System.out.println("Total balance="+mylist.get(log.getx()).getbalance());
	  System.out.println("  -----------------------------------------------------");

		if(count>=1||count<=5) {
			System.out.println("Delivery = from 1 to 5 days");
		}
		else if(count>=6||count<=15) {
			System.out.println("Delivery = from 5 to 10 days");
		}
		
		 System.out.println("\nEnter ok= ");
		 String check=input2.next();
		 if(check.equals("ok")) {
			 
			Worker.setIswaiting(true);
	             for(int j=0;j<mylist.get(log.getx()).shoppingcart.size();j++) {
	            	
				 order.add(new Order(log.getx() ,mylist.get(log.getx()).shoppingcart.get(j).getCategory(),mylist.get(log.getx()).shoppingcart.get(j).getid(),mylist.get(log.getx()).shoppingcart.get(j).getName(),mylist.get(log.getx()).shoppingcart.get(j).getPicture(),mylist.get(log.getx()).shoppingcart.get(j).getDescriptions(),
						 mylist.get(log.getx()).shoppingcart.get(j).getprice(),mylist.get(log.getx()).shoppingcart.get(j).getMaterial(),mylist.get(log.getx()).shoppingcart.get(j).getCleaning(),mylist.get(log.getx()).shoppingcart.get(j).getQuantity()));
				 writefile(); 
				w.workerlist.get(log.getx()).list.add(new Order(log.getx() ,mylist.get(log.getx()).shoppingcart.get(j).getCategory(),mylist.get(log.getx()).shoppingcart.get(j).getid(),mylist.get(log.getx()).shoppingcart.get(j).getName(),mylist.get(log.getx()).shoppingcart.get(j).getPicture(),mylist.get(log.getx()).shoppingcart.get(j).getDescriptions(),
						 mylist.get(log.getx()).shoppingcart.get(j).getprice(),mylist.get(log.getx()).shoppingcart.get(j).getMaterial(),mylist.get(log.getx()).shoppingcart.get(j).getCleaning(),mylist.get(log.getx()).shoppingcart.get(j).getQuantity()));
			
				 }
	            
	            
	         mylist.get(log.getx()).shoppingcart.clear();
			 mylist.get(log.getx()).setbalance(0);
			}
	}
}
public void allorder() {
	
	setGenerate(true);
	int t=0;
	for(int i=0;i<order.size();i++) {
		
		count=count+(order.get(i).getPrice()*order.get(i).getQuantity());
			order.get(i).printorder();
			t++;
		}
		System.out.println("\n--------------------------------------------------------- ");
		
		
		
	System.out.println("-------------Generate statistics------------------ ");
	System.out.println("\nTotal Paid = ");
	System.out.println(count);
	System.out.println("\nTotal orders  = ");
	System.out.println(t);
	if(count>0) {
	System.out.println("\nTotal Debts  = 0");}
	else {
		System.out.println("Caution, the application does not deal in debt");

	}

	System.out.println("--------------------------------------------------- ");

 
	
}
public void report() {
	ReportsSteps.setIsreport(true);
	int t=0;
	int t1=0;
	int t2=0;
	int t3=0;
	for(int i=0;i<order.size();i++) {
		
		count=count+(order.get(i).getPrice()*order.get(i).getQuantity());
			
			t++;
		}
		
		for (int i=0;i< mylist.size();i++) {
			t1++;
		}
		for (int i=0;i<rugDetails.size();i++) {
            if (rugDetails.get(i).getCategory() .equals("carpet")) {
            	t2++;
            }
            }
		for (int i=0;i<rugDetails.size();i++) {
            if (rugDetails.get(i).getCategory() == "cover") {
            	t3++;
            	
            }
            
            }
		
	System.out.println("-------------REPORTS IN APPLICATION------------------ ");
	System.out.println("\nTotal number of customer = ");
	System.out.println(t1);
	System.out.println("\nTotal number of product carpet = ");
	System.out.println(t2);
	System.out.println("\nTotal number of product cover = ");
	System.out.println(t3);
	System.out.println("\nTotal Paid = ");
	System.out.println(count);
	
	System.out.println("\nTotal orders  = ");
	System.out.println(t);
	if(count>0) {
	System.out.println("\nTotal Debts  = 0");}
	else {
		System.out.println("Caution, the application does not deal in debt");

	}

	System.out.println("--------------------------------------------------- ");

 
}
public void showorderw() {
	for(Order o:w.workerlist.get(log.getx()).list) {
		o.printorder();
	}
}
public void available() {
	if(w.workerlist.get(log.getx()).list.isEmpty()) {
		Worker.setAvailable(true);
	}
	else {
		Worker.setAvailable(false);
	}
}
public void trackorder() {
System.out.println("-----------------------------------------");
System.out.println("1. waiting");
System.out.println("2. in tretmeant");
System.out.println("3. completed");
int number=input2.nextInt();
switch(number) {
case 1:{
	Worker.setIswaiting(true);
	break;
}
case 2:{
	Worker.setIswaiting(false);
	Worker.setIntretmant(true);
	break;
}
case 3:{
	
	Worker.setIswaiting(false);
	Worker.setIntretmant(false);
	Worker.setIscompleted(true);
	Worker.setNotification(true);
	 w.workerlist.get(log.getx()).list.clear();
	break;
}
}


}
public void sendnotification() {
	if(Worker.isNotification()==true) {
		System.out.println("\nYour cleaning order is complete. Thank you for using our Application! ");

	}
}
public void sendmessage() {
	if(Worker.isIswaiting()==true) {
		System.out.println("the order is waiting");
	}
	else if(Worker.isIntretmant()==true) {
		System.out.println("the order in treatment");

	}
	else if(Worker.isIscompleted()) {
		
		System.out.println("the order is completed");

	}
}

public void ccustomernottrue() {
	if(name==null||phone==0||address==null) {
		System.out.println("\n Failed to save information \n please try again");
	
		issavee=false;

	}
	
}

/*private void Readfiles()
{
	
    try
    {  
        File readf = new File("input.txt"); 
        Scanner read = new Scanner(readf);
        while(read.hasNextLine())
        {
        	
       order.add(new Order(o.getID(),o.getCategory(),o.getId(),o.getName(),o.getPicture(),o.getDescription(),o.getPrice(),o.getMaterial(),o.getCleaninig(),o.getQuantity()));
       
        }
        read.close();
    }
    catch(FileNotFoundException e)
    {
        e.printStackTrace();
    }
    
    
    
}*/
private void writefile()
{
    try
    {
    File writef = new File("input.txt"); 
    PrintWriter write = new PrintWriter(writef);
    for(int i=0;i<mylist.get(log.getx()).order.size();i++)
    {
    	String tostring=(order.get(i).getID()+order.get(i).getCategory()+order.get(i).getId()+order.get(i).getName()+order.get(i).getPicture()+order.get(i).getDescription()+order.get(i).getPrice()+order.get(i).getMaterial()+order.get(i).getCleaninig()+order.get(i).getQuantity());
    
        write.print(tostring);
    }
    write.close();
    }
    catch(FileNotFoundException e)
    {
        e.printStackTrace();
    }
    }


}