import javax.swing.JOptionPane;

public class MainPengiriman extends Paket {
	public MainPengiriman () {
	
	}
	
	public static void main (String args []) {
		MainPengiriman elie = new MainPengiriman();
		
		String nmPengiriman = JOPtionPane.showInputDialog("Biaya Pengiriman Paket" + "\n Inputkan Nama Pengirim ");
		
		elie.setNmPengirim (nmPengirim) ;
		
		String tujuanPaket = JOptionPane.showInputDialog("Biaya Pengiriman Paket" + "\n Inputkan Tujuanpaket : Bali | Surabaya | Jakarta | Bandung");
		
		elie.setTujuanPaket(tujuanPaket);
		
		String br = JOPtionPane.showInputDialog("Biaya Pengiriman Paket" + "\n Inputkan Berat paket :");
								
		int beratPaket = Integer.parseInt(br);
		elie.setBeratPaket(beratPaket);
		elie.biayaPerKg();
		elie.Bayar ();
		
		JOptionPane.showMessageDialog(null, "biaya Pengiriman Paket Adalah" + "\n Nama Pengirim : " + elie.getNmPengirim() + "\n Tujuan paket : "+  elie.getTujuanPaket() + "\n Berat paket : " + elie.getBeratPaket () + " Kg " + "\n Biaya Per Kg : " + elie.biayaPerKg() +"\n Total Bayar : " + elie.Bayar() + "\nTerima Kasih....^_^");
	}
}
	