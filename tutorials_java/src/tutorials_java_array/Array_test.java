package tutorials_java_array;

public class Array_test {

	public static void main(String[] args) {
		String[] student = {"�达", "�־�", "�̾�", "�ھ�", "�Ӿ�"};
		
		for (int i=0; i<student.length; i++) {
			System.out.println(student[i]+"�� �⼮�߽��ϴ�.");
		}
		for (String e : student) {
			System.out.println(e+"�� �ϱ��߽��ϴ�.");
		}
	}
}