package chart;

public class ChartDTO {
	String json;
	String name; //dashboard �̸� �������� �κ�
	int id; //��ú��� ���̵� �������� �κ�
	int available; //���� ���� �������� �κ� default�� 1

	public String getJson() {
		return json;
	}
	public void setJson(String json) {
		this.json = json;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	
}
