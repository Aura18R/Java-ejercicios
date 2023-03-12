import java.time.LocalTime; 
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Ejercicios {
	
	// 1 Escribir un metodo para encontrar el área de un triángulo a partir de 3 lados ingresados
    // Revisar si es un triángulo válido
	
	public static double trianguloArea(double a, double b, double c){
		if (a!= b + c ) {
			if(b!= a + c) {
				if (c != a + b) {
					double semiPerimetro = (a + b + c)/2;
					double area = Math.sqrt(semiPerimetro*(semiPerimetro-a)*(semiPerimetro-b)*(semiPerimetro-c));
					return area;
				} else {
					System.out.println("No es triangulo");
					return 0;
				}
			} else {
				System.out.println("No es triangulo");
				return  0;
			}
			
		}else {
			System.out.println("No es triangulo");
			return 0;
		}
	}
	

    // 2 Escribir un metodo para encontrar el area y la circumferencia de un circulo dado el radio
    // Utilizar PI de la libreria de Java
	
	
	public static double[] areaCirculo (double radio) {
		double area = (Math.PI * radio * radio);
		double perimetro = (Math.PI * 2 * radio);
		double[] areaPerimetro = {area, perimetro};  
		return areaPerimetro;  
	}
	
    //buscarElemento(Arrelgo objeto, int valor)[1]
	
	
    // 3 Escribir un metodo que muestre por consola la hora del sistema
    // Utilizar e investigar la libreria de Java
	
	public static LocalTime horaActual () {
		LocalTime horaActualSistema = LocalTime.now();
		return horaActualSistema;
	}

    // 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos, segundos) segun sea el caso
    // ej 3600 = "1 hora = 60 min = 3600 seg"
	
	public static int[] convertirSegundos (int segundos) {
		
		int horas = segundos / 3600;
		int minutos = (segundos - (3600 * horas))/60;
		int segundosRestantes = (segundos - (3600 * horas) - (60 * minutos));
		int [] conversionHoraMinutos =  {horas, minutos, segundosRestantes};
		
		return conversionHoraMinutos;
	}
	
    // 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
	
	public static double volumenEsfera (double radio) {
		double volumen = (4/3) * Math.PI * radio * radio * radio;
		return volumen;
	}
	
    
    // 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura
	
	public static double volumenCono (double altura, double radio) {
		double volumen =  (altura * Math.PI * radio * radio)/3;
		return volumen;
	}
    
    // 7 Encontrar el area superficial de un cubo dado un lado a
	
	public static double areaSuperficialCubo (double lado) {
		double areaSuperficial = 6 * lado * lado;
		return areaSuperficial;
	}

    // 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
	
	public static boolean anioBisiesto(int anio) {
	    if (anio % 4 == 0) {
	        if (anio % 100 == 0) {
	            if (anio % 400 == 0) {
	                return true;
	            } else {
	                return false;
	            }
	        } else {
	            return true;
	        }
	    } else {
	        return false;
	    }
	}
	
	
	//NUEVOS EJERCICIOS
	// 9. Escribir mostrar en pantalla los primeros 100 numeros primos
	
	public static List<Integer> numerosPrimos (int limite) {
		List<Integer> numeros = new ArrayList<>();
		for (int i=2; i<600 && numeros.size()<limite; i ++){
			int contadorDivisible = 0;
			
			for (int j=1; j<=i; j++) {
				if(i%j == 0) {
					contadorDivisible = contadorDivisible+1;
				}
			}
			if (contadorDivisible == 2) {
				numeros.add(i);
			}
		
		}
		return numeros;
	}
	
	
	// 10. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos
	
	
	public static int sumarSinOperadores(int a, int b) {
        while (b != 0) {
            int suma = (a & b) << 1;
            a = a ^ b;
            b = suma;
        }
        return a;
    }
	
	
	
	// 11. Escribir un método para verificar si un numero positivo de 2 digitos es palindrom	
	
	public static boolean numeroPalindromo (int numero) {
		
		String cadena = Integer.toString(numero);
		List<Integer> listaNumeros = new ArrayList<>();
		
		for (int i=0; i<cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			listaNumeros.add(Integer.parseInt(Character.toString(caracter)));
		}
		
		int mitadLista = listaNumeros.size() / 2;
		List<Integer> primeraMitad = new ArrayList<>(listaNumeros.subList(0, mitadLista + 1));
		Collections.reverse(listaNumeros);
		List<Integer> segundaMitad = new ArrayList<>(listaNumeros.subList(0, mitadLista + 1));
	    
		if (primeraMitad.equals(segundaMitad)) {
		    return true;
		} else {
		    return false;
		}
		
	}
	
	
	// 12. Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10
	
	public static int sumarDigitos (int numero) {
		
		if (numero>=10 & numero <=99) {
			String cadena = Integer.toString(numero);
			List<Integer> digitosSeparados = new ArrayList<>();
			char digito = cadena.charAt(0);
			digitosSeparados.add(Integer.parseInt(Character.toString(digito)));
			char digito2 = cadena.charAt(1);
			digitosSeparados.add(Integer.parseInt(Character.toString(digito2)));
			
			int sumaTotal = digitosSeparados.get(0) + digitosSeparados.get(1);
			
			return sumaTotal;
			} else {
				System.out.println("Numero no valido, ingrese uno entre 10 y 99");
				return 0;
			}
	}
	
	
	// 13. Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"
	
	public static String removerEspacios(String cadena) {
		
		String[] subCadenas = cadena.split(" ");
		String cadenaUnida = String.join("", subCadenas);
		
		return cadenaUnida;
	}
	
	// 14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops
	
	public static String cadenaReves(String cadena) {
		StringBuilder cadenaBuilder = new StringBuilder(cadena);
		cadenaBuilder.reverse();
		String cadenaReversa = cadenaBuilder.toString();
		
		return cadenaReversa;
	}
	
	// 15. Escribir un metodo para encontrar el factorial de un numero sin loops
	public static int factorial (int numero) {
		if (numero == 0 || numero == 1) {
			return 1;
		} else {
			return numero * factorial(numero-1);
		}
	}
		
		
	//}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		double triangulo = trianguloArea(15, 8, 11);
		System.out.println("El area del triangulo es: " + triangulo);
		
		//2
		double circuloArea = areaCirculo(5)[0];
		System.out.println("El area del circulo es: " + circuloArea);
		double circuloPerimetro = areaCirculo(5)[1];
		System.out.println("Y el perimetro del circulo es: " + circuloPerimetro);
		
		//3
		LocalTime horaActual = horaActual();
        System.out.println("La hora actual es: " + horaActual);
        
        //4
        int segundos = 36674;
        int horas = convertirSegundos(segundos)[0];
        int minutos = convertirSegundos(segundos)[1];
        int segundosRestantes = convertirSegundos(segundos)[2];
        System.out.println("Hay " + horas + " horas con " + minutos + " minutos y " + segundosRestantes + " segundos en " +  segundos + " segundos" );
        
        //5
        double esfera = volumenEsfera(16);
		System.out.println("El volumen de la esfera es: " + esfera);
		
		
		//6
		double cono = volumenCono(13,5);
		System.out.println("El volumen del cono es: " + cono);
		
		//7
		double areaCubo = areaSuperficialCubo(6);
		System.out.println("El area superficial del cubo es: " + areaCubo);
		
		//8
		int anio = 2024;
		boolean anioResultado = anioBisiesto(anio);
		System.out.println("Es bisiesto el anio " + anio + "? " + anioResultado);
		
		//9
		List<Integer> primerosPrimos = numerosPrimos(10);
		System.out.println("Los primeros 100 numero primos son: " + primerosPrimos.toString());
		
		//10
		int suma = sumarSinOperadores (3 , 65);
		System.out.println("La suma es: " + suma);
		
		//11
		boolean palindromoResultado = numeroPalindromo(4567654);
		System.out.println("El numero ingresado es un palindromo? " + palindromoResultado);		
        
		//12
		int resultadoSumaDigitos = sumarDigitos(97);
		System.out.println("La suma de los digitos es: " + resultadoSumaDigitos);
		
		//13
		String resultadoCadenaEspacios = removerEspacios("Hola Mundo Feliz");
		System.out.println("La cadena sin espacios es: " + resultadoCadenaEspacios);
		
		
		//14
		String cadenaReversa = cadenaReves("anita lava la tina");
		System.out.println("La cadena al reves es: " + cadenaReversa);
		
		
		//15
		int resultadoFactorial = factorial(10);
		System.out.println("El resultado del factorial es: " + resultadoFactorial);
	}

}
