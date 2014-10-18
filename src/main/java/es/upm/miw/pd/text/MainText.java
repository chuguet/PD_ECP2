package es.upm.miw.pd.text;

public class MainText {

	public static void main(String[] args) {
		Componente parrafo = new Parrafo();
		Componente texto = new Texto();
		Componente caracter;
		caracter = FactoriaCaracter.getFactoria().get('H');
		parrafo.add(caracter);
		caracter = FactoriaCaracter.getFactoria().get('o');
		parrafo.add(caracter);
		caracter = FactoriaCaracter.getFactoria().get('l');
		parrafo.add(caracter);
		caracter = FactoriaCaracter.getFactoria().get('a');
		parrafo.add(caracter);
		texto.add(parrafo);

		System.out.println(caracter.dibujar(true));
		System.out.println(parrafo.dibujar(true));
		System.out.println(texto.dibujar(false));

	}

}
