package busrv;
import java.util.Date;
import java.sql.*;
public class BookingDAO {
public int getBookedCount(int BUS_no,Date date) throws SQLException{
		
		String query = "select count(psname) from Sbooking where busno=? and bdate=?";
		Connection con = DBConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		pst.setInt(1, BUS_no);
		pst.setDate(2, sqldate);
		ResultSet rs = pst.executeQuery();
		rs.next();
		return rs.getInt(1);
	}
	
	public void addBooking(Booking booking) throws SQLException{
		String query = "Insert into Sbooking values(?,?,?)";
		Connection con = DBConnection.getConnection();
		java.sql.Date sqldate = new java.sql.Date(booking.date.getTime());
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, booking.pname);
		pst.setInt(2, booking.BUS_no);
		pst.setDate(3, sqldate);
		
		pst.executeUpdate();
		
}}
