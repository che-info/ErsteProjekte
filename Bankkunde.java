package Bankprojekt;

public class Bankkunde {
		private int kundennummer;
		private String name;
		private String adresse;
		
		public Bankkunde () {
		} 
		public Bankkunde (int nr, String name, String adresse) {
			kundennummer=nr; 
			this.name=name;
			this.adresse=adresse;
		}
		public void setKundennummer(int nr) {
			kundennummer=nr;
		}
		public void setName(String kname) {
			name=kname;
		}
		public void setAdresse(String kadr) {
			adresse=kadr;
		}
		public String getName() {
			return name;
		}
		public String getAdresse() {
			return adresse;
		}
		public int getNummer() {
			return kundennummer;
		}
}
