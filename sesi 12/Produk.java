import java.util.ArrayList;
import java.util.List;
public class Produk
{
		private String kode;
		private String harga;
		private List <Pembelian> daftarPembelian= new ArrayList <Pembelian>();
		
		public String getKode ()
		{
			return kode;
		}
		
		public void setKode(String Kode)
		{
			this.kode=kode;
		}
		
		public String getHarga()
		{
			return harga;
		}
		
		public void setHarga(String harga)
		{
			this.harga=harga;
		}
}