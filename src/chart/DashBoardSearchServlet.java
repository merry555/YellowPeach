package chart;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
@WebServlet("/DashBoardSearchServlet")
public class DashBoardSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�Ű����� ���� ó���� �� 
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html);charset=UTF-8");
		String dashboardName = request.getParameter("dashboardName"); 
		response.getWriter().write(getJSON(dashboardName));
	}
	//Ư���� ��ú��带 �˻����� �� �� ��� ������ JSON���·� ��µ����ν� ������ �´�
	// �ٽ� �Ľ��ؼ� �м��� ���� ����ڿ��� �����ִ� ��
	//���� ���������� �ϴ� ������ JSON�� ������ִ� ������ �Ѵ�
	public String getJSON(String dashboardName) {
		if(dashboardName ==null) dashboardName = "";
		StringBuffer result = new StringBuffer("");
		result.append("{\"result\":[");
		ChartDAO cDao = new ChartDAO();
		ArrayList<ChartDTO> cList = cDao.search(dashboardName);
		for(int i=0; i<cList.size(); i++) {
			result.append("[{\"value\"\""+cList.get(i).getName()+"\"},");
			result.append("{\"value\"\""+cList.get(i).getName()+"\"}],");
		}
		result.append("]}");
		return result.toString();
	}

}
*/