package cursoCImaven;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorEngine {

	// logger para la salida de información
	private static final Logger loger = Logger.getLogger(CalculatorEngine.class.getName()); 

	private enum Operator {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    double currentTotal;

    public String getTotalString() {
        return currentTotal % 1.0 == 0
                ? Integer.toString((int) currentTotal)
                : String.valueOf(currentTotal);
    }

    public void resultado(String number) {
        currentTotal = Double.parseDouble(number);
    }

    public void add(String number) {
        convertToDouble(number, Operator.ADD);
    }

    public void subtract(String number) {
        convertToDouble(number, Operator.SUBTRACT);
    }

    public void multiply(String number) {
        convertToDouble(number, Operator.MULTIPLY);
    }

    public void divide(String number) {
        convertToDouble(number, Operator.DIVIDE);
    }

    private void convertToDouble(String number, Operator operator) {
        double dblNumber = Double.parseDouble(number);
        switch (operator) {
            case ADD:
                add(dblNumber);
                break;
            case SUBTRACT:
                subtract(dblNumber);
                break;
            case MULTIPLY:
                multiply(dblNumber);
                break;
            case DIVIDE:
                divide(dblNumber);
				// Nueva funcionalidad para salida por consola
				List<Double> valores = new ArrayList<Double>();
				valores.add(new Double(10));
				valores.add(new Double(5));
				valores.add(new Double(0));
				
				String palabra = "El resultado" + " de "  + "la división " + " es ";
				
				if(operator != null && !palabra.isEmpty() && valores != null && !valores.isEmpty()){
					for(Double valor : valores) {
						if(dblNumber >= 0){
							if(dblNumber <= 10) {
								if(valor.equals(dblNumber)) {
									System.out.println(palabra + valores.get(valores.indexOf(valor)));
								} else {
									System.out.println("División no encontrada");
								}
								
							} else {
								System.out.println("División no encontrada");
							}
						} else {
							System.out.println("División no encontrada");
						}
					}
				}
				break;
			}
		}

    void add(double number) {
        currentTotal += number % 1.0 == 0 ? (int) number : number;
    }

    void subtract(double number) {
        currentTotal -= number % 1.0 == 0 ? (int) number : number;
    }

    void multiply(double number) {
        currentTotal *= number % 1.0 == 0 ? (int) number : number;
    }

    void divide(double number) {
        currentTotal /= number % 1.0 == 0 ? (int) number : number;
    }

}
