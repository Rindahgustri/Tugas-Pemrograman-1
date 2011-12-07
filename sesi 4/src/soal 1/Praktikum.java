//ini adalah nama class yang harus sama pada file nya yaitu Praktikum.java
 public class Praktikum{
//ini adalah method utama yang akan dieksekusi oleh java.
	public static void main(String[] args) {
//inisialisasi variable favNum dengan tipe data int
		int number1, number2, results;
		boolean number;
		number1 = 20;
		number2 = 10;

//proses nya yaitu 20/10		
		results = number1 / number2;
			System.out.println(results);
		results = number1 + number2;
			System.out.println(results);
		number = (20 !=10);
			System.out.println(number);
		number = (20 ==10);
			System.out.println(number);
	}
}