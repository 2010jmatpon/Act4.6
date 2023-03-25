package Actividad4_6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char [] cadena = {'b', 'e', 't', 'i', 's'};
        String a = new String(cadena);
        System.out.println(a);

        char cadena2 = 't';

        int[] numbers = {2,1,11,10};
        String[] convertir;
        imprimeLongitudCadena(cadena);
        caracterEnPosicionEmpezandoEn1(cadena,4);
        cuentaOcurrenciasDeUnCaracter(cadena, cadena2);
        sustituirCaracteres(a);
        convertir = convertirAString(numbers);
        System.out.println(Arrays.toString(convertir));
    }

    public static void imprimeLongitudCadena(char[] cadena){
        System.out.println("La longitud de la cadena es " + cadena.length);
    }

    public static void caracterEnPosicionEmpezandoEn1(char[] cadena, int posicion) {
        System.out.println("La posición "+ posicion + " está ocupada por la letra " +cadena[posicion]);
    }

    public static void cuentaOcurrenciasDeUnCaracter(char [] cadena, char cadena2){
        int contador = 0;
        for (int i = 0; i<cadena.length; i++){
            if (cadena[i] == cadena2){
                contador++;
            }
        }
        System.out.println("La "+ cadena2 + " aparece " + contador + " veces");
    }

    public static void imprimeCadenasEnOrdenAlfabético(char [] cadena){

    }
    public static void sustituirCaracteres(String otraCadena){
        char [] nuevaCadena = otraCadena.toCharArray();

        for (int i = 0; i< nuevaCadena.length; i++) {
            if (nuevaCadena[i] == 'a') {
                nuevaCadena[i] = '4';
            } else if (nuevaCadena[i] == 'e') {
                nuevaCadena[i] = '3';
            } else if (nuevaCadena[i] == 'i') {
                nuevaCadena[i] = '1';
            } else if (nuevaCadena[i] == 'o') {
                nuevaCadena[i] = '0';
            } else if (nuevaCadena[i] == 'u') {
                nuevaCadena[i] = 'V';
            }
        }
        System.out.println(Arrays.toString(nuevaCadena));

    }

    static String[] convertirAString (int [] numbers){
        String [] convertir = new String[numbers.length];
        for (int i = 0; i <numbers.length; i++){
            convertir[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(convertir);
        return convertir;
    }

}