package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import Model.Employee;
import Model.Student;

public class InheritanceMain {

	public static void main(String[] args) throws ParseException {
			Student s = new Student();
			s.setNim("12101011");
			s.setNama ("Rindah Gustri");
			s.setAlamat ("Jl.Margonda Raya gang Pepaya no.33");
			s.setTglLahir(new SimpleDateFormat ("dd-MM-yyyy").parse("22-08-1992"));
			s.setNoHp ("082124573837");
			
			Employee e = new Employee();
			e.setNip ("21100989");
			e.setNama ("Adi Sulistinno");
			e.setAlamat ("Jl.Asem Jajar No.6");
			e.setTglLahir(new SimpleDateFormat ("dd-MM-yyyy").parse("13-06-1986"));
			e.setNoHp ("08520831766");
			
			showData(s);
			System.out.println("\n==================================================\n");
			showData(e);
			
		}
		
		static void showData(Student s) {
			System.out.println("Class Student");
			System.out.println("NIM : " + s.getNim());
			System.out.println("Nama : " + s.getNama());
			System.out.println("Alamat : " + s.getAlamat());
			System.out.println("Tgl Lahir : " + new SimpleDateFormat("dd MMMM yyyy"). format(s.getTglLahir()));
			System.out.println("No HP : " + s.getNoHp());
		}
		
		static void showData(Employee e) {
			System.out.println("Class Employee");
			System.out.println("NIP : " + e.getNip());
			System.out.println("Nama : " + e.getNama());
			System.out.println("Alamat : " + e.getAlamat());
			System.out.println("Tgl Lahir : " + new SimpleDateFormat("dd MMMM yyyy").format(e.getTglLahir()));
			System.out.println("No HP : " + e.getNoHp());
		}

}
		
		
			
			
			

			
