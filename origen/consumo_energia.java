
public class consumo_energia {
	
	public int consumoEnergia(String plantaElectrica, String Ciudad) {
		int totalConsumo = 0;
		if(plantaElectrica.toLowerCase().equals("coca codo sinclair")) {
			if(Ciudad.toLowerCase().equals("guayaquil")) {
				int consumos[] = {20, 55, 32, 120, 75, 32, 150, 55, 32, 120, 97, 32};
				for (int i = 0; i < consumos.length; i++) {
					totalConsumo += consumos[i];
				}
				return totalConsumo;
				
			}if(Ciudad.toLowerCase().equals("quito")) {
				int [] consumos = {400, 432, 400, 432, 420, 432, 460, 432, 400, 432, 300 , 213};
				for (int i = 0; i < consumos.length; i++) {
					totalConsumo += consumos[i];
				}
				return totalConsumo;
			}
		}
		if(plantaElectrica.toLowerCase().equals("sopladora")) {
			if(Ciudad.toLowerCase().equals("guayaquil")) {
				int consumos[] = {310, 220, 321, 310, 220, 321, 310, 220, 321, 310, 220, 321};
				for (int i = 0; i < consumos.length; i++) {
					totalConsumo += consumos[i];
				}
				return totalConsumo;
			}
		if(Ciudad.toLowerCase().equals("Quito")) {
			int [] consumos = {400, 432, 587, 400, 432, 587, 400, 432, 587, 400, 432, 587};
			for (int i = 0; i < consumos.length; i++) {
				totalConsumo += consumos[i];
			}
			return totalConsumo;
		}
		if(Ciudad.toLowerCase().equals("Loja")) {
			int [] consumos = {50, 32, 32, 50, 32, 32, 50, 32, 32, 50, 32, 32};
			for (int i = 0; i < consumos.length; i++) {
				totalConsumo += consumos[i];
			}
			return totalConsumo;
		}
	}
		return totalConsumo;
}
}
