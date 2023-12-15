package busrv;

import java.sql.Connection;
import java.sql.*;
public class BusDAO {
	public void dispalyBusInfo() throws Exception{
		String query ="select * from bus";
		Connection con=DBConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("BUS No: "+rs.getInt(1));
			if(rs.getInt(2)==0){
				System.out.println("Ac : No");				
			}
			else {
				System.out.println("Ac : Yes");	
			}
			System.out.println("Capacity: "+rs.getInt(3));
		}
		System.out.println("-------------------------------------------------------------------------");
	}
	public int getCapacity(int BUS_no) throws SQLException {
		String query = "Select capacity from bus where busno=" + BUS_no;
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
	}

}

