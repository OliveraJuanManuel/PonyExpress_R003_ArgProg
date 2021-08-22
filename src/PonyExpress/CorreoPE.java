package PonyExpress;

public class CorreoPE {
	private static final int CABALLO_RECORRE = 99;

	public int caballos(int[] distancias) {
		int contDeCaballos = 1;
		int millas = CABALLO_RECORRE;

		distancias = this.validarDistancias(distancias);

		for (int i = 0; i < distancias.length; i++) {
			if (millas - distancias[i] <= 0) {
				contDeCaballos++;
				millas = CABALLO_RECORRE;
				i--;// como se suma otro caballo, se debe mantaner el indice de iteracion para
					// poder restar la distancia que no alcanzo el caballo anterior ...

			} else
				millas -= distancias[i];
		}
		return contDeCaballos;
	}

	private int[] validarDistancias(int[] distancias) {
		int largo = distancias.length;
		int[] retorno;
		for (int i = 0; i < distancias.length; i++) {
			if (distancias[i] < 0 && distancias[i] > 99) {
				for (int j = i; j < distancias.length - 1; j++) {
					distancias[j] = distancias[j + 1];
				}
				largo--;
			}
		}
		retorno = new int[largo];

		for (int i = 0; i < retorno.length; i++)
			retorno[i] = distancias[i];

		return retorno;
	}

}
