package sources_code;

import java.util.ArrayList;

public class Worker {
	public ArrayList<Worker> workerlist=new ArrayList<Worker>();
	public ArrayList<Order> list=new  ArrayList <Order>();

	Customersteps obj=new Customersteps();
     private static boolean iswaiting;
     private static boolean intretmant;
     private static boolean iscompleted;
     private static boolean notification;
     private static boolean  available;


  int id;
	private String name;
	private int age;
	private int phone;
	private String address;
	
	
 public Worker(){}
 public Worker( int id, String name,int age,int phone,String address) {
	 this.id=id;
	 this.name=name;
	 this.age=age;
	 this.phone=phone;
	 this.address=address;
	 
	 
 }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public void informationworker() {
	workerlist.add(new Worker(1,"eman",23,054754,"nablus"));
	workerlist.add(new Worker(2,"haya",23,65666686,"nablus"));
	workerlist.add(new Worker(3,"eman sawalmeh",30,755494,"nablus"));
	workerlist.add(new Worker(4,"aya",22,0756654,"nablus"));
	workerlist.add(new Worker(5,"marah",24,6707654,"nablus"));
	workerlist.add(new Worker(6,"jehad",35,90307654,"nablus"));
}
public void show_worker() {
	
	System.out.printf(" id :  %s || ",getId());
	System.out.printf(" Name worker : %s  ||",getName());
	System.out.printf(" Age worker :  ");
	System.out.print(getAge());
	System.out.printf("||  phone worker :  ");
	System.out.print(getPhone());
	System.out.printf(" || Address worker : %s .",getAddress());
	System.out.print(" \n");

	
}
public static boolean isIswaiting() {
	return iswaiting;
}
public static void setIswaiting(boolean iswaiting) {
	Worker.iswaiting = iswaiting;
}
public static boolean isIntretmant() {
	return intretmant;
}
public static void setIntretmant(boolean intretmant) {
	Worker.intretmant = intretmant;
}
public static boolean isIscompleted() {
	return iscompleted;
}
public static void setIscompleted(boolean iscompleted) {
	Worker.iscompleted = iscompleted;
}
public static boolean isNotification() {
	return notification;
}
public static void setNotification(boolean notification) {
	Worker.notification = notification;
}
public static boolean isAvailable() {
	return available;
}
public static void setAvailable(boolean available) {
	Worker.available = available;
}

}
