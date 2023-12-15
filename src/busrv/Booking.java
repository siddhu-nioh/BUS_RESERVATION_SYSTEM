package busrv;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Booking {

	String pname;
	int BUS_no;
	Date date;
	Booking(){
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name of The Passenger :");
		pname=sc.nextLine();
		System.out.println("Enter the Bus No :");
		BUS_no=sc.nextInt();
		System.out.println("Enter date dd-mm-yy :");
		String dateip=sc.next();
		SimpleDateFormat dt=new SimpleDateFormat("dd-mm-yy");
		try {
			date=dt.parse(dateip);
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
}
	public boolean isAvaialble() throws SQLException{
		BusDAO busdao=new BusDAO();
		BookingDAO bdo = new BookingDAO();
		int capacity=busdao.getCapacity(BUS_no);
		int booked=bdo.getBookedCount(BUS_no,date);
		return booked<capacity;
	}
}
