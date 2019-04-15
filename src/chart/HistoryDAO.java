package chart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import pool.PoolManager;

/* Data Access Object
 * ���̺� �� �Ѱ��� DAO�� �ۼ��Ѵ�.
 * 
 * JSP_MEMBER ���̺�� ������ DAO��
 * ȸ�� �����͸� ó���ϴ� Ŭ�����̴�.
 */
public class HistoryDAO {
	PoolManager pool;

	public HistoryDAO() {
		pool = PoolManager.getInstance();
	}

	// ���� ���� ����Ʈ ������ �������� �޼ҵ�
	public ArrayList<HistoryDTO> getTopicList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = null;
		String sName = null;
		ArrayList<HistoryDTO> topicList = null;
		//

		try {
			// System.out.println("conn");
			conn = pool.getConnection();
			if (conn != null) {
				System.out.println("������ ���̽� ���� ����");
			}
			if (conn == null) {
				System.out.println("conn == null");
			}
			query = "select * from topicList";// ������ ���̺� �̸����� �ٲ� ��! + ���� ���� ����Ʈ�� ���̺� �̸�

			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			topicList = new ArrayList<HistoryDTO>();

			while (rs.next()) {
				HistoryDTO dto = new HistoryDTO();
				dto.setTopicName(rs.getString("topicName"));// ���ȸ���Ʈ
				sName = rs.getString("topicName");
				topicList.add(dto);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("����");
			// e.printStackTrace();
		} finally {
			pool.freeConnection(conn, pstmt, rs);

		}

		return topicList;

	}

	// sensor ������ �������� �޼ҵ�
	public ArrayList<HistoryDTO> getHistory(String sensorlist) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = null;
		String sTime = null;
		String sData = null;
		HistoryDTO dto = null;
		ArrayList<HistoryDTO> history = new ArrayList<HistoryDTO>();

		try {
			// System.out.println("conn");
			conn = pool.getConnection();
			if (conn != null) {
				System.out.println("������ ���̽� ���� ����");
			}
			if (conn == null) {
				System.out.println("conn == null");
			}

			query = "select * from " + sensorlist;// ������ ���̺� �̸����� �ٲ� ��! + ���� ���� ����Ʈ�� ���̺� �̸�
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {

				dto = new HistoryDTO();
				dto.setsDatetime(rs.getString("time"));// ���� ���̺� ��¥
				dto.setsData(rs.getString("data"));// ���� ���̺� ������

				sTime = dto.getsDatetime();
				sData = dto.getsData();
				history.add(dto);
				System.out.println(dto.getsData());
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("����");
			// e.printStackTrace();
		} finally {
			pool.freeConnection(conn, pstmt, rs);

		}

		return history;
	}

	/*
	 * public static void main(String[] args) { HistoryDAO a = new HistoryDAO();
	 * HistoryDTO t = new HistoryDTO(); a.getHi("HSFarm_mirae_cds"); }
	 */

}