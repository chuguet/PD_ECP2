package es.upm.miw.pd.text;

public class MainText {

	public static void main(String[] args) {
		Componente parrafo1 = new Parrafo();
		Componente parrafo2 = new Parrafo();
		Componente texto1 = new Texto();
		Componente texto2 = new Texto();
		Componente caracter;
		caracter = FactoriaCaracter.getFactoria().get('H');
		parrafo1.add(caracter);
		caracter = FactoriaCaracter.getFactoria().get('o');
		parrafo1.add(caracter);
		caracter = FactoriaCaracter.getFactoria().get('l');
		parrafo1.add(caracter);
		caracter = FactoriaCaracter.getFactoria().get('a');
		parrafo1.add(caracter);
		caracter = FactoriaCaracter.getFactoria().get(' ');
		parrafo1.add(caracter);
		caracter = FactoriaCaracter.getFactoria().get('J');
		parrafo1.add(caracter);
		caracter = FactoriaCaracter.getFactoria().get('o');
		parrafo1.add(caracter);
		caracter = FactoriaCaracter.getFactoria().get('e');
		parrafo1.add(caracter);
		texto1.add(parrafo1);
		caracter = FactoriaCaracter.getFactoria().get('C');
		parrafo2.add(caracter);
		caracter = FactoriaCaracter.getFactoria().get('o');
		parrafo2.add(caracter);
		caracter = FactoriaCaracter.getFactoria().get('m');
		parrafo2.add(caracter);
		caracter = FactoriaCaracter.getFactoria().get('e');
		parrafo2.add(caracter);
		caracter = FactoriaCaracter.getFactoria().get(' ');
		parrafo2.add(caracter);
		caracter = FactoriaCaracter.getFactoria().get('a');
		parrafo2.add(caracter);
		caracter = FactoriaCaracter.getFactoria().get('q');
		parrafo2.add(caracter);
		caracter = FactoriaCaracter.getFactoria().get('u');
		parrafo2.add(caracter);
		caracter = FactoriaCaracter.getFactoria().get('i');
		parrafo2.add(caracter);
		texto2.add(texto1);

		System.out.println(caracter.dibujar(true));
		System.out.println(parrafo1.dibujar(true));
		System.out.println(texto1.dibujar(false));
		System.out.println(texto2.dibujar(true));

	}

}
