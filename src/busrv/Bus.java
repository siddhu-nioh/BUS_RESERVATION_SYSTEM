package busrv;

public class Bus {

	private int BUS_no;
	private boolean ac;
	private int capacity;
	
	Bus(int no,boolean ac, int cap){
		this.BUS_no=no;
		this.ac=ac;
		this.capacity=cap;
		
	}
	public int getBusno() {
		return BUS_no;
		
	}
	public boolean getAc() {
		return ac;
	}
	public int getcapacity() {
		return capacity;
	}
	public void setac(boolean val) {
		ac=val;
		
	}
	public void setcapacity(int cap) {
		capacity=cap;
		
	}
	public void displayBusInfo(){
		System.out.println("Bus.No:"+BUS_no+"AC:"+ac+"TOTAL CAPACITY"+capacity);
	}
}


