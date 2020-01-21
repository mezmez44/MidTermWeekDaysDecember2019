package datastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) throws SQLException {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 *
		 */

		ArrayList<String> arrayList = new ArrayList();
		//adding data into the arraylist
		arrayList.add("Canada");
		arrayList.add("USA");
		arrayList.add("Mexico");
		arrayList.add("Chile");
		arrayList.add("Argentina");
		arrayList.add("Brazil");
		System.out.println("Get the element at index 2:" + " " + arrayList.get(2));
		System.out.println(" Remove the element at index 1: " + " " + arrayList.remove(1));
		System.out.println(" Set a value  at index 0: " + " " + arrayList.set(0, "UK"));
		//using for each loop
		System.out.println(" Use for each loop to print all the elements of an ArrayList");
		for (String s : arrayList) {
			System.out.println(s);
		}

		//using Iterator
		System.out.println("Use White loop With Iterator print all the elements of an ArrayList");
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		String url = "jdbc:mysql://localhost:3306/pnt?serverTimezone=UTC";
		String user = "root";
		String password = "ABCD123";
		Statement statement=null;
		Connection connection=null;

		try {
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();

			String query = "insert into arraylist (id,name) values (2,'france');";
			statement.execute(query);

		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println(" something went wrong with connection");
		}
		finally {

			statement.close();
			connection.close();
		}
	}
}