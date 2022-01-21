package com.example.webstore_lite.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.webstore_lite.Web_store;

public interface Web_repositry extends JpaRepository<Web_store, Integer>{

	
	@Query(value="select * from web_store where email_id=?",nativeQuery = true)
	Web_store getverif(String email_id);
	
}

