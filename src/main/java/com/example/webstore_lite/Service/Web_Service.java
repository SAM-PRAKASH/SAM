package com.example.webstore_lite.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.webstore_lite.Web_store;
import com.example.webstore_lite.DAO.Web_DAO;
import com.example.webstore_lite.Repositry.Web_repositry;

@Service
public class Web_Service {

	@Autowired
	Web_DAO wb;
	@Autowired
	Web_repositry wr;

	public String  insertserv(Web_store p1) {
		
		Web_store ws= wr.getverif(p1.getEmail_id());
		if(ws==null) {
			wb.insertdao(p1);
	return	"User Registered";
		}
		return "Existing User or Give another Mail ID";

	}
	
	public List<Web_store> getsevice() {
		return wb.getdao();

	}

	public void updateservice(Web_store p1) {
		wb.updatedao(p1);

	}

	public String getverifserv(String email_id, String pasword) {
		Web_store ws = wr.getverif(email_id);

		if (ws != null) {
			if (ws.getPasword().equals(pasword)) {
				return "Login Success";
			}
			return "Enter valid password";
		}

		return "Ivalid user please reg";
	}


	public void dltservice(String email_id) {
		Web_store ws= wr.getverif(email_id);
		
		 wb.dltdao(ws.getId());
		
	}

}
