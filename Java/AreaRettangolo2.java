/* Area del rettangolo con passaggio di 2 parametri*/
/* javac AreaRettangolo2.java 3 5*/

public class AreaRettangolo2{
	public static void main(String[] args) {
		int baseRettangolo, altezzaRettangolo, areaRettangolo;
		baseRettangolo=Integer.valueOf(args[0]).intValue();
		altezzaRettangolo=Integer.valueOf(args[1]).intValue();
		areaRettangolo=altezzaRettangolo*baseRettangolo;
		System.out.println("Area="+areaRettangolo);

	}
}


/*
 * Nome della classe parte con la maiuscolo
 * Nome della variabile parte con la minuscola
*/
