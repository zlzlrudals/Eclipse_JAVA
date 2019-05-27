package tutorials_java_array;

public class Array_test {

	public static void main(String[] args) {
		String[] student = {"±è¾¾", "ÃÖ¾¾", "ÀÌ¾¾", "¹Ú¾¾", "ÀÓ¾¾"};
		
		for (int i=0; i<student.length; i++) {
			System.out.println(student[i]+"°¡ Ãâ¼®Çß½À´Ï´Ù.");
		}
		for (String e : student) {
			System.out.println(e+"°¡ ÇÏ±³Çß½À´Ï´Ù.");
		}
	}
}