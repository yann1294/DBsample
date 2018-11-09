package Tables;

import java.sql.ResultSet;
import java.sql.SQLException;

public class students {

    public static void getStudents(ResultSet rs) throws SQLException {
        while(rs.next()){
            StringBuffer buffer = new StringBuffer();
            buffer.append("Students ID " + rs.getInt("Id") + '\t');
            buffer.append(rs.getString("first_name") + '\t');
            buffer.append(rs.getString("last_name") +'\t' ) ;

            buffer.append(rs.getDate("dob"));

            System.out.println(buffer.toString());

        }
    }
}
