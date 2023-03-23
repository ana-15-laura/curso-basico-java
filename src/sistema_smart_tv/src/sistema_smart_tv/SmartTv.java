package sistema_smart_tv;

public class SmartTv {
		
		boolean ligada = false;
		int canal = 1;
		int volume = 20;
		
		public void mudarCanal(int novoCanal) {//parâmetro 
			canal = novoCanal;
		}
		
		public void aumentarCanal() {
			//canal = canal +1;
			canal++;
		}
		
		public void diminuirCanal() {
			//canal = canal -1;
			canal--;
		}
		
		public void aumentarVolume () {
			//volume = volume +1;
			volume++;
			System.out.println("Aumentar o volume para: " + volume);
		}
		
		public void diminuirVolume () {
			//volume = volume -1;
			volume--;
			System.out.println("Diminuir o volume para: " + volume);
		}
		
		public void ligar () {
			ligada = true;
		}
		
		public void desligar () {
			ligada = false;
		}
}
