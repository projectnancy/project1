package sources_code;

import java.util.ArrayList;

public class Order {
	
	Customersteps C=new Customersteps();
	 private String Category;
	private int id;
	private String name;
	private String picture;
	private String description;
	private double price;
	private String material;
	private String cleaninig;
	private int quantity;
	private int ID;
	public Order(){}
		public Order(int ID,String Category,int id,String name, String picture, String description, double price, String material, String cleaninig,int quantity) {
	    	this.setID(ID);
			this.setCategory(Category);
	    	this.setId(id);
	    	this.setName(name);
	    	this.setPicture(picture);
	    	this.setDescription(description);
	    	this.setPrice(price) ;
	    	this.setMaterial(material);
	    	this.setCleaninig(cleaninig);
	    	this.setQuantity((quantity));
	    	
		}
		public ArrayList<Order> order=new ArrayList<Order>();
		public String getCategory() {
			return Category;
		}
		public void setCategory(String category) {
			Category = category;
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
		public String getPicture() {
			return picture;
		}
		public void setPicture(String picture) {
			this.picture = picture;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getCleaninig() {
			return cleaninig;
		}
		public void setCleaninig(String cleaninig) {
			this.cleaninig = cleaninig;
		}
		public String getMaterial() {
			return material;
		}
		public void setMaterial(String material) {
			this.material = material;
		}
		public void printorder() {
			 System.out.printf("ID: "  );
			 System.out.print( ID );
			 System.out.printf(" || Category product: %s || " , Category );
			 System.out.printf("Id  product: %s || ",getId());
			 System.out.printf("Name product: %s || ",name); 
			 System.out.printf("Link for Picture product: %s || ",picture);
			 System.out.printf("The discription : %s || ",description);
			 System.out.print("The price :  ");
			 System.out.print(price);
			 System.out.printf(" || The Material: %s  || ",material);
			 System.out.printf("The type cleaning : %s || .",cleaninig);
			 System.out.printf("The Quantity : ");
			 System.out.print(quantity);
			// System.out.printf("\n totalaccount "  );
			// System.out.print(C.getbalance() );
			 System.out.print("\n" );

		}
		
}
