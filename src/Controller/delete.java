package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ClassDAO;

public class delete implements Command {

	@Override
	public String execute(ClassDAO classe, HttpServletRequest request, HttpServletResponse response) {
		return classe.delete(request, response);
	}

}
