package datastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class UseMap {

	public static <Lsit> void main(String[] args) throws SQLException {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		Connection connection = null;
		Statement statement = null;
		Map<String, List<String>> list = new HashMap<String, List<String>>();


		List<String> list1 = new ArrayList();
		list1.add("UK");
		list1.add("Belgium");
		list1.add("Spain");
		list1.add("Italy");

		List<String> list2 = new ArrayList();
		list2.add("USA");
		list2.add("Canada");
		list2.add("Brazil");


		List<String> list3 = new ArrayList();
		list3.add("China");
		list3.add("Pakistan");
		list3.add("India");

		list.put("Europe", list1);
		list.put("America", list2);
		list.put("Asia", list3);

		list.forEach((k, v) -> System.out.println("Key = "
				+ k + ", Value = " + v));

		System.out.println(" using iterator");
		Iterator<Map.Entry<String, List<String>>> itr = list.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<String, List<String>> entry = itr.next();
			System.out.println("Key = " + entry.getKey() +
					", Value = " + entry.getValue());


		}
		String url = "jdbc:mysql://localhost:3306/pnt?serverTimezone=UTC";
		String user = "root";
		String password = "ABCD123";

		try {
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();
			//String query=" create table UseMap (continent   varchar(20) primary key not null, countries varchar(30));";
			//String query2 = " insert into UseMap (continent,countries) values ('Europe','UK,Belgium,Spain,Italy');";
			String query2 = "select * from UseMap;";
			statement.execute(query2);
			System.out.println(statement.execute(query2));


		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println("something wrong with your connection");
		} finally {
			statement.close();
			connection.close();
		}
	}
}