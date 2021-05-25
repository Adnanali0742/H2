package Test;

//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

//import org.junit.Assert;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.adnan.datamodel.Movies;
import services.MoviesJPADAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class MoviesTest {
	
	@Inject
	MoviesJPADAO dao;
	
	@Inject
	@Named("dataSource")
	DataSource ds;
	
	
	@Test
	public void test() throws SQLException{
		// given
		Movies movies = new Movies();
		movies.setId(1);
		movies.setName("Irom-Man");
		movies.setDate("2017");
		
		
		// when
		dao.create(movies);
		dao.search(movies);
		
		dao.update(movies, 2, "Jumangi", "2030");
		dao.update(movies, 3, "Super-Man", "2010");
		dao.search(movies);
		
		dao.delete(movies);
		dao.search(movies);
		
		
//		PreparedStatement preparedStatement = ds.getConnection().prepareStatement("SELECT * FROM MOVIES");
//		preparedStatement.setInt(1, movies.getId());
//		preparedStatement.setString(2, movies.getName());
//		preparedStatement.setString(3, movies.getDate());
//		ResultSet rs = preparedStatement.executeQuery();
//		rs.next();
//		int id = rs.getInt("ID");
//		String name = rs.getString("Film-Name");
//		int date = rs.getInt("Released_Date");
//		
//		Assert.assertEquals(id, movies.getId());
//		Assert.assertEquals(name, movies.getName());
//		Assert.assertEquals(date, movies.getDate());
		
		
		
	}

}
