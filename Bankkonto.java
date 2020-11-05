package Bankprojekt;

public class Bankkonto {
		private float kontostand;
		private Bankkunde bkunde;
		private float ueberziehung;
		
		public Bankkonto () {
		}
		public Bankkonto (float kontostand, Bankkunde kunde, float ueberziehung) {
			this.kontostand=kontostand;
			this.bkunde=kunde;
			this.ueberziehung=ueberziehung; 
		}
		
		public void einzahlung(float betrag) {
			kontostand=kontostand+betrag;
		}
		public boolean auszahlung(float betrag) {
			if(betrag<kontostand+ueberziehung) {
				kontostand=kontostand-betrag;
				return true;
			}
			else
				return false;
		}
		
		public void setBankkunden(Bankkunde bkunden) {
			bkunde=bkunden;
		}
		public Bankkunde getKunde() {
			return bkunde;
		}
		public float getKontostand() {
			return kontostand;
		}
}
