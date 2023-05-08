package sources_code;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

import io.cucumber.messages.types.DataTable;

public class ProdectSteps {
	 private  String Category;
	    private int id;
		private  String name;
		private  String picture;
	    private  String description;
		private  double price;
	    private  String material;
	    private  String cleaninig;
	    private  int quantity;
	    
	    ProdectSteps(String Category,int id,String name, String picture, String description, double price, String material, String cleaninig,int quantity) {
	    	this.Category = Category;
	    	this.id = id;
	    	this.name = name;
	    	this.picture = picture;
	    	this.description = description;
	    	this.price =price ;
	    	this.material = material;
	    	this.cleaninig = cleaninig;
	    	this.quantity=(quantity);
	    	
	    }
	    public ProdectSteps(){}

	     static ArrayList<ProdectSteps> rugDetails = new ArrayList<ProdectSteps>();
		private Scanner input0;
		
		public void carpetpage() {
			
			System.out.println("Welcome to the carpet page!\n");
			carpetdetails();			
			
			
		}

		public void coverpage() {
			System.out.println("Welcome to the cover page!\n");
         System.out.println("Please full the information about your product ");

			coverdetails();
		 	
		    
		}
		
		public String getCategory() {
			return Category;	
		}
		public void setCategory(String Category) {
			this.Category = Category;		
		}
		
		public int getid() {
			return id;	
		}
		public void setid(int id) {
			this.id = id;		
		}
		
		public String getName() {
			return name ;	
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
	    

	    public String getDescriptions() {
	        return description;
	    }
	    public void setDescriptions(String description) {
	       this.description = description;
	    }
	   
	    
	    public double getprice() {
	        return price;
	    }
	    public void setprice(double price) {
	        this.price = price;
	    }
	    
	    
	    public String getMaterial() {
	        return material;
	    }
	    public void setMaterial(String material) {
	        this.material = material;
	    }
	    
	    
		public String getCleaning() {
			return cleaninig;
		}
		public void setCleaning(String cleaninig) {
			this.cleaninig = cleaninig;
		}

		public void init() {
			rugDetails.add(new ProdectSteps("carpet",1, "Kitchen cleaning","www.kitchenimg.com","carpet sizes: 123*75",420,"Triexta Carpeting","Kitchen cleaning",1));
			rugDetails.add(new ProdectSteps("carpet",2, "Bathroom cleaning","www.bathimg.com", "carpet sizes: 20*75",100,"Acrylic Carpeting","Bathroom cleaning",1));
			rugDetails.add(new ProdectSteps("carpet",3, "Livingroom cleaning","www.livingimg.com", "carpet sizes: 200*100",345,"Polyster Carpeting","Living room cleaning",1));
			rugDetails.add(new ProdectSteps("cover",4, "Bedrooms covers cleaning","www.bedroomimg.com", "carpet sizes: 100*100",150,"Cotton","Bedroom cleaning",1));

		}
		
		public void carpetdetails() {
		
			for (int i=0;i<rugDetails.size();i++) {
	            if (rugDetails.get(i).getCategory() .equals("carpet")) {
	            	rugDetails.get(i). print();
	            }
	            }
	       
    }
			
			
			  
		
		

		public void coverdetails() {
	for (int i=0;i<rugDetails.size();i++) {
	            if (rugDetails.get(i).getCategory() == "cover") {
	            	rugDetails.get(i). print();
	            }
	            
	            }
	        
   
		}
		
		 
		public void print() {
			
			if(!rugDetails.isEmpty()) {
				 System.out.printf("Category product: %s || " , Category );
				 System.out.printf("Id  product: %s || ",getid());
				 System.out.printf("Name product: %s || ",name); 
				 System.out.printf("Link for Picture product: %s || ",picture);
				 System.out.printf("The discription : %s || ",description);
				 System.out.print("The price :  ");
				 System.out.print(price);
				 System.out.printf(" || The Material: %s  || ",material);
				 System.out.printf("The type cleaning : %s || .",cleaninig);
				 System.out.printf("The Quantity : ");
				 System.out.print(quantity);


				 System.out.print("\n");

					 }

					
				 
		}

		public void create_product() {
			
			
			System.out.println("enter Category product=");
			 input0 = new Scanner(System.in);
			 String Category = input0.next();
			 
			 System.out.println("enter the id product=");
			 input0 = new Scanner(System.in);
			 int id =  input0.nextInt();
			 
			System.out.println("enter name product=");
			 input0 = new Scanner(System.in);
			 String name =  input0.next();
			
			 System.out.println("enter picture product=");
			 input0 = new Scanner(System.in);
			 String pe = input0.next();
			 
			System.out.println("enter discription product=");
			 input0 = new Scanner(System.in);
			 String dis =  input0.next();
			
			 System.out.println("enter price product=");
			 input0 = new Scanner(System.in);
			double price =  input0.nextDouble();
			
			 System.out.println("enter material product=");
			 input0 = new Scanner(System.in);
			 String m =  input0.next();
			 
			System.out.println("enter cleanning product=");
			 input0 = new Scanner(System.in);
			 String c=  input0.next();
			 rugDetails.add(new ProdectSteps (Category,id,name,pe,dis,price,m,c,1));
			 
			
			  
			 System.out.println("Product created successfully. ");
			 print();
			 
		}
		
		public void Add_product() {
			 input0 = new Scanner(System.in);
			 System.out.println("Enter product Category: ");
		        String Category  =  input0.next();
		       
		        
		        System.out.println("Enter the id product=");
		        input0 = new Scanner(System.in);
				 int id =  input0.nextInt();
				 
				 for (ProdectSteps product : rugDetails) {
			            if (product.getid() == id) {
			            System.out.println("Product id already exists.");
			            for (int i=0;i<rugDetails.size();i++) {
				            System.out.println(rugDetails.get(i).id);

			            }
			            
			            
			                Add_product();
			            }
			        }
				 
		        System.out.println("enter name product=");
		        input0 = new Scanner(System.in);
				 String name =  input0.next();
				
				 System.out.println("enter picture product=");
				 input0 = new Scanner(System.in);
				 String pe =  input0.next();
				 
				System.out.println("enter discription product=");
				 input0 = new Scanner(System.in);
				 String dis =  input0.next();
				
				 System.out.println("enter price product=");
				 input0 = new Scanner(System.in);
				double price =  input0.nextDouble();
				
				 System.out.println("enter material product=");
				 input0 = new Scanner(System.in);
				 String m =  input0.next();
				 
				System.out.println("enter cleanning product=");
				 input0 = new Scanner(System.in);
				 String c=  input0.next();
				 rugDetails.add(new ProdectSteps (Category,id,name,pe,dis,price,m,c,1));
				 
		        System.out.println("Product added successfully.");
		    }
		    
		 public void deleteProduct() {
		    	
			 input0 = new Scanner(System.in);
				 System.out.println("Enter product ID: ");
			        int id  =  input0.nextInt();
			        for (int i=0;i<rugDetails.size();i++) {
			            if (rugDetails.get(i).getid() == id) {
			            	rugDetails.remove(i);
				                System.out.println("Product deleted successfully.");
				                
		    	
			            }
			            }
			        System.out.println("Product not found.");
		    }
		
			public void updateProduct() {
				int f=0;
				 input0 = new Scanner(System.in);
		        System.out.println("Enter product ID: ");
		       int id  =  input0.nextInt();
		       for (int i=0;i<rugDetails.size();i++) {
		            if (rugDetails.get(i).getid() == id) {
		            	f=1;
		            	//in3 = new Scanner(System.in);
		   		       // System.out.println("Enter product Category: ");
		   		        //String Category  = in3.next();
		   		        
		               // System.out.println("Enter name product=");
						// input13 = new Scanner(System.in);
						// String name = input13.next();
						
						// System.out.println("Enter picture product=");
						// input23 = new Scanner(System.in);
						// String pe = input23.next();
						 
						System.out.println("Enter discription product=");
						 input0 = new Scanner(System.in);
						 String dis =  input0.next();
						
						 System.out.println("Enter price product=");
						 input0 = new Scanner(System.in);
						double price = input0.nextDouble();
						
						 System.out.println("Enter material product=");
						 input0 = new Scanner(System.in);
						 String m =  input0.next();
						 
						System.out.println("Enter cleanning product=");
						 input0 = new Scanner(System.in);
						 String c=  input0.next();
						
			    		  

		    	    	rugDetails.get(i).changeprodect(dis,price,m,c);
		               
		                System.out.println("Product updated successfully.");
		               
		            }
		           
		        }
		      if(f==0){ System.out.println("Product not found.");}
		    }
			public void  changeprodect( String description, double price, String material, String cleaninig) {
				
	    	    	this.description =  description;
	    	    	this.price =price ;
	    	    	this.material = material;
	    	    	this.cleaninig = cleaninig;
			}
		    
		 
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
	

}
