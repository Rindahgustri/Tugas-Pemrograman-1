import java.util.Date;
import java.util.ArrayList;
import java.util.List;
public class Pembelian
{
		private Date tanggal;
		private String nilai;
		private List <PembelianDetail> daftarPembelianDetail=new ArrayList <PembelianDetail>();
		
		public Date getTanggal()
		{
			return tanggal;
		}
		
		public void setTanggal (Date tanggal)
		{
			this.tanggal=tanggal;
		}
		
		public String getNilai()
		{
			return nilai;
		}
		
		public void setNilai(String nilai)
		{
			this.nilai=nilai;
		}
}