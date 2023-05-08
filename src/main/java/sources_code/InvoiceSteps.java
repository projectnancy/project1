package sources_code;



public class InvoiceSteps {
	public static boolean invoice;
	public static boolean isdiscount;

	Customersteps o=new Customersteps();
	static LoginSteps  log= new LoginSteps();
	ProdectSteps prod=new ProdectSteps();
	
	
	public boolean isgenerate() {
		return invoice;
	}
	
	public void setisgenerate(boolean invoice) {
		InvoiceSteps.invoice=invoice;
	}
	
	public boolean getdiscount() {
		return isdiscount;
	}
	
	public void setdiscount(boolean isdiscount) {
		InvoiceSteps.isdiscount=isdiscount;
	}
}
