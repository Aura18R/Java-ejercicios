import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;


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
	
	public static List<Integer> numerosPrimos () {
		List<Integer> numeros = new ArrayList<>();
		int contadorPrimos = 0;
		int contadorDivisible = 0;
		for (int i=2; i<600; i ++){
			while (numeros.size()<=100) {
			for (int j=1; j<=i; j++) {
				if(i%j == 0) {
					contadorDivisible = contadorDivisible+1;
				}
			}
			if (contadorDivisible == 2) {
				contadorPrimos = contadorPrimos + 1;
				numeros.add(i);
			}
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
	// 12. Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10
	// 13. Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"
	// 14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops
	
	// 15. Escribir un metodo para encontrar el factorial de un numero sin loops


	
	
	

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
        
        
	}

}