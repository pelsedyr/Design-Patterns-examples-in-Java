package mvc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * One DAO class per table or view. 
 * CRUD functionality must be implemented.
 *
 */
public class PersonDAO {

	public int addPerson(Person person) throws SQLException{
		Connection conn = Database.getInstance().getConnection(); //usnig singleton
		
		PreparedStatement p = conn.prepareStatement("insert into people (name, password) values (?,?)");
	
		p.setString(1, person.getName());
		p.setString(2, person.getPassword());
		
		System.out.println("\nExecuting database updadte " + person.getName() + " " + person.getPassword());
		
		int updated = p.executeUpdate();
		p.close();
		
		return updated;
	}
	
	public Person getPerson(int id){
		return null;
	}
	
	public List<Person> getPeople(){
		return null;
	}
	
	public void updatePerson(Person person){
		
	}
	
	public void deletePerson(int id){
		
	}
}
