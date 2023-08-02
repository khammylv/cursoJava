import java.nio.channels.ScatteringByteChannel;


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


int num = 20;
for (int i=0; i<= num; i++){
    System.out.println(i+ " "+fibonacciRecursivo(i));
}

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
}


