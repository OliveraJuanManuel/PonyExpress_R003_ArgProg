package PonyExpress;

public class CorreoPE {
	private static final int CABALLO_RECORRE = 99;

	public int caballos(int[] distancias) {
		int contDeCaballos = 1;
		int millas = CABALLO_RECORRE;

		for (int i = 0; i < distancias.length; i++) {
			if (millas - distancias[i] <= 0) {
				contDeCaballos++;
				millas = CABALLO_RECORRE;
				i--;// como se suma otro caballo, se debe mantaner el indice de iteracion para
					// poder restar la distancia que no alcanzo el caballo anterior

			} else
				millas -= distancias[i];
		}
		return contDeCaballos;
	}

}
