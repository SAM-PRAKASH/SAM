package com.example.webstore_lite.DAO;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.webstore_lite.Web_store;
import com.example.webstore_lite.Repositry.Web_repositry;

@Repository
public class Web_DAO {

	@Autowired
	Web_repositry wr;
	
	public void insertdao(Web_store p1) {
		wr.save(p1);
	}

	public List<Web_store> getdao() {
		return wr.findAll();
	}

	public void updatedao(Web_store p1) {
		
		wr.save(p1);
		
	}

	public void dltdao(int id) {
		
		wr.deleteById(id);
	}


	
}
