import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {


    //    Scanner scanner = new Scanner(System.in);
    //    System.out.println("Ingrese un entero");
    //    int numero = scanner.nextInt();
    //  System.out.println("Entero:" + numero);
    //  scanner.close();

    
     //String input = JOptionPane.showInputDialog("Ingrese un número:");
      //String input2 = JOptionPane.showInputDialog("Ingrese un número:");
     
     //int num1 = Integer.parseInt(input);
     //int num2 = Integer.parseInt(input2);
//     var suma = sumar(num1, num2);
//     var resta = restar(num1, num2);
//     var mul = mult(num1, num2);
//     var div = div(num1, num2);
//     JOptionPane.showMessageDialog(null, "Resultado de la suma" + suma + "\n" + "Resultado de la resta" + resta+ "\n" + "Resultado de la multiplicacion" + mul + "\n" + "Resultado de la division" + div);
    

//     var par = esPar(num1);
//     JOptionPane.showMessageDialog(null, "El numero ingresado es:" + par);
    
//    String input3 = JOptionPane.showInputDialog("Ingrese el radio del circulo:");


//     double num3 = Double.parseDouble(input3);
//     var peri = perimetro(num3);
//     var area = area(num3);
//     JOptionPane.showMessageDialog(null, "El perimetro es " + peri + "\n" + "El area es:" + area);
    

//     String input4 = JOptionPane.showInputDialog("Ingrese la edad:");
//     var edad = edad(input4); 
//     JOptionPane.showMessageDialog(null, edad);


//    var mayor = mayor(num1, num2);
//    JOptionPane.showMessageDialog(null, "El numero mayor es:" + mayor);
    

// var num = numeroNP(input);
// JOptionPane.showMessageDialog(null, num);

//tablaMult(num1);

//adivina();

//factorial

// int fac;
// do{
//   String inputUs = JOptionPane.showInputDialog("Introduce un numero entero mayor o igual a 0:");
//       fac = Integer.parseInt(inputUs);
// }while(fac < 0);
 
// JOptionPane.showMessageDialog(null, "El factorial de:"+" " +fac+"!" +"=" +factorial(fac));


// int num = 20;
// for (int i=0; i<= num; i++){
//     System.out.println(i+ " "+fibonacciRecursivo(i));
// }

// String input = JOptionPane.showInputDialog("Ingrese un numero:");
// String input2 = JOptionPane.showInputDialog("Ingrese un numero:");
// String input3 = JOptionPane.showInputDialog("Ingrese un numero:");

// double a = Double.parseDouble(input);
// double b = Double.parseDouble(input2);
// double c = Double.parseDouble(input3);
// var area = areaTriangulo(a, b, c);

// JOptionPane.showMessageDialog(null, "El area del triangulo es: " + area);


// String input = JOptionPane.showInputDialog("Ingrese un numero:");
// int num1 = Integer.parseInt(input);

// var primo = esPrimo(num1);

// if(primo){
//     JOptionPane.showMessageDialog(null, "el numero es primo" + num1); 
// }else{
//     JOptionPane.showMessageDialog(null, "el numero NO es primo" + num1);   
// }

// String input = JOptionPane.showInputDialog("Ingrese un numero:");
// String input2 = JOptionPane.showInputDialog("Ingrese un numero:");
// double a = Double.parseDouble(input);
// int b = Integer.parseInt(input2);
// var redo = fijarNumero(a,b);
// JOptionPane.showMessageDialog(null, redo);


// String input = JOptionPane.showInputDialog("Ingrese un numero:");
// int num1 = Integer.parseInt(input);
// if(numeroPerfecto(num1)){
//     JOptionPane.showMessageDialog( null,num1 + " Es un numero perfecto");
// }else{
//   JOptionPane.showMessageDialog(null,num1 + " No es un numero perfecto");
// }

// String input = JOptionPane.showInputDialog("Ingrese un numero:");
// int num1 = Integer.parseInt(input);

// if(numeroPacua(num1) == num1){
//   JOptionPane.showMessageDialog(null, "Es un numero capic\u00FAa");
// }else{
//     JOptionPane.showMessageDialog(null, "No es un numero capic\u00FAa");
// }


// String input = JOptionPane.showInputDialog("Ingrese un numero:");
// int num1 = Integer.parseInt(input);
// fibonacci(num1);


//  String input = JOptionPane.showInputDialog("Ingrese un número:");
//  String input2 = JOptionPane.showInputDialog("Ingrese un número:");
     
// int num1 = Integer.parseInt(input);
// int num2 = Integer.parseInt(input2);
// rangoPrimos(num1,num2);


//System.out.println(password());

// String input = JOptionPane.showInputDialog("Ingrese tu nombre:");
// nombre(input);

// String input = JOptionPane.showInputDialog("Ingrese una frase:");

// JOptionPane.showMessageDialog(null, reversePalabra(input));

//contarLetra("haoaaaaala", "a");

// String input = JOptionPane.showInputDialog("Ingrese una frase");
// String input2 = JOptionPane.showInputDialog("Ingrese la letra que busca");

// JOptionPane.showMessageDialog(null,contarLetra(input, input2));

// String input = JOptionPane.showInputDialog("Ingrese una frase");
// if(palindromo(input)){
//  JOptionPane.showMessageDialog(null, "Es palindromo");
// }else{
//   JOptionPane.showMessageDialog(null, "No es palindromo");  
// }

// String input = JOptionPane.showInputDialog("Ingrese una frase");
// JOptionPane.showMessageDialog(null, contPalabras(input));


// String input = JOptionPane.showInputDialog("Ingrese una frase");
// String input2 = JOptionPane.showInputDialog("Ingrese una letra a reemplazar");
// String input3 = JOptionPane.showInputDialog("Ingrese una letra de reemplazo");

// JOptionPane.showMessageDialog(null,replaceLetra(input, input2, input3));

// String input = JOptionPane.showInputDialog("Ingrese una frase");
// separadorCadena(input);


// String input = JOptionPane.showInputDialog("Ingrese una frase");

// JOptionPane.showMessageDialog(null,contadorFrases(input));

// String input = JOptionPane.showInputDialog("Ingrese una frase");
// JOptionPane.showMessageDialog(null,ordenarCadena(input) );

//sumaArray();

//numMayor();

//deleteRepetidos();

// int arreglo[] = {1, 9, 23, 4, 55, 100, 1, 1, 23};
// arregoBurbuja(arreglo);

// System.out.println(Arrays.toString(arreglo));

//buscadorNum();

//frecuencia();

// int[] arr = { 1, 2, 3, 4, 5 };
// int r = 3;
// rotDerecha(arr, r);

// System.out.println(Arrays.toString(arr));

// int[] A = { 1, 2, 3, 4, 5, 6, 7 };
// int k = 3;

// rotIzquierda(A, k);

// System.out.println(Arrays.toString(A));


tablasMatriz();
 }



    
    //Ejercicio 1
    public static int sumar(int a, int b){
        return a + b;
    }

    public static int restar(int a, int b){
        return a - b;
    }

    public static int mult(int a, int b){
        return a * b;
    }

    public static int div(int a, int b){
        return a / b;
    }

  // ejercicio 2

  public static boolean esPar(int numero) {
    return numero % 2 == 0;
 }

 // ejercicio 3

 public static double perimetro(double num){
   var perim = 2*Math.PI*num;

    return  perim;

 }
 
  public static double area(double num){
   var areaC = Math.PI*Math.pow(num, 2);

    return  areaC;

 }

 // ejercicio 4

 public static String edad(String num){
  int num1 = Integer.parseInt(num);
  
   if(num1 <=  18){
    return "Usuario mayor de edad";
   }else{
     return "Usuario maenor de edad";
   }
}

// ejercio 5

public static int mayor(int a, int b){
    if(a > b){
      return a;
    }else{
       return b;
    }
}
 
 // ejercicio 6

 public static String numeroNP(String num){
   int num1 = Integer.parseInt(num);

   if(num1 == 0){
    return "El numero es cero";
}
if(num1 < 0){
    return "El numero es negativo";
}
else{
    return "El numero es positivo";
}
}

//ejercicio 7
public static void tablaMult(int num){
    for(int i = 1; i <= 10; i++){
       System.out.println(num + "x" + i  + "=" + (num * i));
        
    }
   
    
}

// ejercicio 8
// coloque el numero para no probar 100 veces
public static void adivina(){
    int valorEntero = (int) (Math.floor(Math.random()*(1-100+1)+100));
    int numUs;

    do{
    
      String inputUs = JOptionPane.showInputDialog("Intenta adivinar el numero");
      numUs = Integer.parseInt(inputUs);
      if(valorEntero > numUs){
        JOptionPane.showMessageDialog(null, "El numero es mayor" + valorEntero);

      }
      else if(valorEntero < numUs){
        JOptionPane.showMessageDialog(null, "El numero es menor");
      }
    }while(valorEntero != numUs);

    


    JOptionPane.showMessageDialog(null, "Adivinaste el numero "+valorEntero);
     
}


// ejercicio 9
public static double factorial(int num) {
    double fact = 1;
    for (int i = 1; i <= num; i++) {
        fact = fact * i;
    }
    return fact;
}

//ejercicio 10

public static int fibonacciRecursivo(int num) {
    if(num == 0){
        return 0;
    }
    else if(num == 1){
        return 1;
    }
    else{
        return fibonacciRecursivo(num - 1) + fibonacciRecursivo(num -2);
    }
}

//ejercicio 11

public static double areaTriangulo(double a, double b, double c){
  double perimetro = ((a + b + c) / 2);
  double area = (Math.sqrt(perimetro*((perimetro - a)* (perimetro - b)* (perimetro - c))));

  return area;
}

//ejercicio 12

public static boolean esPrimo(int num){
    
    if(num == 0 || num == 1 || num == 4){
        return false;
    }
    for(int i = 2; i < num /2; i++){
        if(num % 2 == 0){
            return false;
        }
    }
    return true;
}

// ejercicio 13
public static double fijarNumero(double numero, int digitos) {
    double resultado;
    resultado = numero * Math.pow(10, digitos);
    resultado = Math.round(resultado);
    resultado = resultado/Math.pow(10, digitos);
    return resultado;
}


//ejercicio 14

public static boolean numeroPerfecto(int num){
    if (num == 1) // el numero 1 no es un numero perfecto
    return false;


   int suma = 0;
   for(int i = 1; i < num; i++){
     if(num % i == 0){
        suma = suma + i;
     }
   }

   if(suma == num){
     return true;
   }
   else{
    return false;
   }
}

// ejercicio 15 


public static int numeroPacua(int num){
    int invertido = 0;
    int resto;
    while(num > 0){
       resto = num % 10;
       invertido = invertido * 10 + resto;
       num /= 10;
    }

    return invertido;
}

// ejercicio 16

public static void fibonacci(int num){
 
for (int i=0; i<= num; i++){
    System.out.println(i+ " "+fibonacciRecursivo(i));
}
}


//ejercicio 17 
public static void rangoPrimos(int a, int b){
    for(int contador = a;contador <= b;contador++) {
        if(esPrimo(contador)){
          System.out.println(contador);
        }
        
    }
}

public static String password(){
    String password = "";
    String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    Random r = new Random();

    for(int i = 1; i <= 8; i++){
        password += alphabet.charAt(r.nextInt(alphabet.length()));
    }

    return password;
}

public static void nombre(String nn){
    JOptionPane.showMessageDialog(null, nn.toUpperCase() + "\n" + nn.toLowerCase());
}

public static String reversePalabra(String pp){
    String reverseP = "";
     
    for(int i=0; i< pp.length(); i++){
       reverseP = pp.charAt(i) + reverseP;
    }

    return reverseP;

}

// ejercicio 21

public static int contarLetra(String palabra, String letra){
    int cont = 0;
    for(int i=0; i< palabra.length(); i++){
        String lt = "";
        lt = palabra.charAt(i) + lt;
        
        if(lt.equalsIgnoreCase(letra)){
           cont ++;
        }
    }

 return cont;
}

// ejercicio 22
public static boolean palindromo(String frase){
   //System.out.println(reversePalabra(frase));
  if(frase.equalsIgnoreCase(reversePalabra(frase))){
    return true;
  }
  else{
    return false;
  }
   //System.out.println(frase.equalsIgnoreCase(reversePalabra(frase)));
}


// ejercicio 23

public static int contPalabras(String frase){
  int cont = frase.split(" ").length;  
  //System.out.println(frase.split(" ").length);

  return cont;
}

//ejercicio 24


public static String replaceLetra(String frase, String letra, String newLetra){
  String mm = "";
  for(int i=0; i< frase.length(); i++){
    String nn = "";
    nn = frase.charAt(i) + nn;

    if(nn.equalsIgnoreCase(letra)){
       mm += newLetra;
    }else{
      mm += nn;
    }
    
    
    }
    return mm;
    //System.out.println(frase); 
    //System.out.println(mm);
}

//ejercicio 25 

public static void separadorCadena(String frase){
String[] separados = frase.split("\\s");

System.out.println(Arrays.toString(separados));

}
// ejercicio 26
public static int contadorFrases(String frase){
    
    String fraseSE = frase.replaceAll("\\s","");
    int count = fraseSE.length();
    
    return count;
    
}

//ejercicio 27

public static String ordenarCadena(String cadena){
String[] separados = cadena.split("\\s");
System.out.println(Arrays.toString(separados));


Arrays.sort(separados);

String arrayToString = String.join(" ", separados);

return arrayToString;
}

// ejercicio 28

public static void sumaArray(){
int[] myNum = {10, 20, 30, 40};
int cont = 0;
for(int i = 0; i < myNum.length; i++){
    cont += myNum[i];
   // System.out.println(myNum[i]);
}
System.out.println(cont);
}

// ejercicio 29
public static void numMayor(){
    int[] myNum = {10, 50,20, 30, 40};
    int numM = 0;
   //System.out.println(Math.max(5, 7));
   for(int i = 0; i < myNum.length; i++){

      numM = Math.max(numM, myNum[i])  ;
   }
   System.out.println(numM);
}


//ejercicio 30
public static LinkedHashSet<Integer> deleteRepetidos(int[] myNum){
//int[] myNum = {10, 50,20, 30, 40,10, 50,20, 30, 40};

LinkedHashSet<Integer> sRepeat = new LinkedHashSet<Integer>();

 for(int i = 0; i < myNum.length; i++){
    sRepeat.add(myNum[i]);
    
   
 }

 

return sRepeat;

}

//ejercicio 31 
public static void arregoBurbuja(int[] arreglo){
    
    for(int i = 0; i < arreglo.length; i++){
       
        for(int j = 0; j < arreglo.length -1; j++){
            int elActual = arreglo[j];
            int elSig = arreglo[j + 1];

            if (elActual > elSig) {
               
                arreglo[j] = elSig;
                arreglo[j + 1] = elActual;
            }
            
        }
    }

}
 //ejercicio 32

 public static void buscadorNum(){
  int[] myNum = {10, 50,20, 30, 40};
  boolean msg = false;
  int num = 0;
  int num2 = 40;
  for(int i = 0; i < myNum.length; i++){
      if(myNum[i] == num2){
        msg = true;
         num = i;
      }
  }
 if(msg){
   System.out.println("Si se encuentra en la posicion: " + num);
 }else{
    System.out.println("El numero no esta en el arreglo");
 }
 } 

 //ejercicio 33

 public static void frecuencia(){
    int[] casoDePrueba = { 0, 2, 2, 3, 4, 5, 7, 5, 8, 4, 8, 6, 4, 2, 1, 4, 7, 8 };
    Map<Integer, Integer> ocurrencias = new HashMap<>();
    for (int i : casoDePrueba) {
        ocurrencias.merge(i, 1, Integer::sum);
    }
    
    ocurrencias.forEach((a, b) -> System.out.println("(" + a + ", " + b + ")"));
 }

 // ejercicio 34

//para girar a la izquierda

public static void leftRotateByOne(int[] arr)
    {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
 
        arr[arr.length - 1] = first;
    }


public static void rotIzquierda(int[] arr, int r){
    for (int i = 0; i < r; i++) {
        leftRotateByOne(arr);
    }


}

// rotacion derecha

public static void rightRotateByOne(int[] A)
{
    int last = A[A.length - 1];
    for (int i = A.length - 2; i >= 0; i--) {
        A[i + 1] = A[i];
    }

    A[0] = last;
}

public static void rotDerecha(int[] A, int k){
    for (int i = 0; i < k; i++) {
        rightRotateByOne(A);
    }
}

// ejercicio 35

public  static void tablasMatriz(){
    for (int i = 1; i <= 10; i++) {
        String table = "Multiplication table of " + i + ":\n";
        for (int j = 1; j <= 10; j++) {
            int result = i * j;
            table += i + " x " + j + " = " + result + "\n";
        }
        System.out.println(table);
        //JOptionPane.showMessageDialog(null, table, "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

}
}
