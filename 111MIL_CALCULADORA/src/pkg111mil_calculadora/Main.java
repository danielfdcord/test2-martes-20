package pkg111mil_calculadora;

public class Main extends MetodosSteve{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char operacion;
        do{
            imprimir("Ingrese el codigo de la operacion:");
            operacion = tomarChar();
        }
        while(menu(operacion));
       
    }
    /**
     * Debe tomar la cantidad de valores enteros necesarios y
     * llamar a la funcion que corresponda al caracter:
     * 's' -> suma
     * 'r' -> resta
     * 'm' -> multiplicacion
     * 'd' -> division
     * 'n' -> menor
     * 'y' -> mayor
     * 'a' -> valorAbsoluto
     * 'e' -> return false
     * una vez llamada la funcion correspondiente debe imprimirse el valor
     * obtenido por pantalla.
     * @param opcion
     * @return true para continuar operando false para salir del programa.
     */
    public static boolean menu(char opcion){
        return false;
    }
    
    /**
     * @param sumandoA
     * @param sumandoB
     * @return suma de los parametros enteros. 
     */
    public static int suma(int sumandoA, int sumandoB){
        imprimir("Ingrese el primer sumando. ");
        sumandoA = tomarInt();
        imprimir("Ingrese el segundo sumando. ");
        sumandoB = tomarInt();
        System.out.print(sumandoA + " + " + sumandoB);
        sumandoA = sumandoA + sumandoB;
        imprimir(" = "+ sumandoA);
        return 0;
    }
    
    /**
     * @param sumandoA
     * @param sumandoB
     * @return diferencia de los parametros enteros.
     */
    public static int resta(int sumandoA, int sumandoB){
        imprimir("Ingrese el minuendo. ");
        sumandoA = tomarInt();
        imprimir("Ingrese el sustraendo. ");
        sumandoB = tomarInt();
        System.out.print(sumandoA + " - " + sumandoB);
        sumandoA = sumandoA - sumandoB;
        imprimir(" = "+ sumandoA);
        return 0;
    }
    
    /**
     * 
     * @param factorA
     * @param factorB
     * @return multiplicacion de los parametros enteros 
     */
    public static int multiplicacion(int factorA, int factorB){
        return 0;
    }
    
    /**
     * 
     * @param divisor
     * @param dividendo
     * @return division entre divisor y dividendo 
     */
    public static int division(int divisor, int dividendo){
        return 0;
    }
    
    /**
     * 
     * @param numeroA
     * @param numeroB
     * @return el mayor de los dos parametros
     * @autor:Gimena, Jose Luis.
     */
    
    public static int mayor(int numeroA, int numeroB){
        if(numeroA < numeroB){
            return numeroB;    
        }
        else{
            return numeroA;        
        }
    }

    
    /**
     * 
     * @param numeroA
     * @param numeroB
     * @return el menor de los dos parametros
     */
    public static int menor(int numeroA, int numeroB){
        return 0;
    }
    
    /**
     * 
     * @param numero
     * @return el valor absoluto del parametro 
     */
    public static int valorAbsoluto(int numero){
        return 0;
    }
    
    /**
     * 
     * @param numeroA
     * @param numeroB
     * @return el primer numero potenciado al segundo
     */
    public static int potencia(int numeroA, int numeroB){
        int i=0;
        int resultado=1;
        if(numeroB>=0){
            for(i=0;i<numeroB;i++){
            resultado*=numeroA;
        }
        }else{
            imprimir("Resultado= 1/("+numeroA+"^"+numeroB*-1+")");
            imprimir("El siguiente mensaje no corresponde:");
        }
        
        return resultado;
    }
}