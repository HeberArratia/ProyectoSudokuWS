package controlador;

/**
*
* @author Heber
*/
public class CuadradoMagico {

   private final int tamaño;
//Matriz que almacena cada dato del cuadrado magico
   private final int casillas[][];

   /* Constructor que recibe el tamaño del cuadrado magico y
    lo asigna a la matriz */
   public CuadradoMagico(int tamaño) {
       this.tamaño = tamaño;
       casillas = new int[this.tamaño][this.tamaño];
   }
   
       
   /* Validacion que comprueba que la cadena que recibe en
    su argumento sea de largo 1, dependiendo el caso
    retorna un booleano.
    */
   public boolean validarLargo(String dato) {
       // Si el largo de dato es 1 se retorna true
       if (dato.length() == 1) {
           System.out.println("✔ El largo es 1");
           return true;
       } else // Si el largo de dato No es 1 se retorna false
       {
           System.out.println("X El largo no es 1");
       }
       return false;
   }
   /* Validacion que comprueba que la cadena que recibe en
    su argumento es o no un numero, dependiendo el caso
    retorna un booleano.
    */

   public boolean esNumero(String dato) {
       // Si la cedena se compone de un dato entre el rango de los numeros 0 y 9 retorna true   
       if (dato.matches("[0-9]*")) {
           System.out.println("✔ Es un numero entero");
           return true;
       } else {
           // Si el dato no se encuentra en ese rango se retorna false       
           System.out.println("X No es un numero o no es entero");
           return false;
       }
   }

   /* Validacion que comprueba que la cadena que recibe en
    su argumento se encuentre en un rango de 1-9
    */
   public boolean validarRango(String dato) {
       // Con el fin de evaluar un entero la cadena se convierte a entero    
       int datoint = Integer.parseInt(dato);
       // Si el dato se encuentra en el rango de numeros 1-9 se retorna true    
       if ((datoint >= 1) && (datoint <= 9)) {
           System.out.println("✔ Se encuentra en el rango");
           return true;
       } else {
           // Si el dato NO se encuentra en el rando de numeros 1-9 se retorna false
           System.out.println("X No se encuentra en el rango");
           return false;
       }
   }
   /* Validacion que comprueba si el dato que recibe en su argumento se 
    encuentra o no dentro de la matriz con el fin de saber si se encuentra
    repetido, retorna un true o false depediendo cual sea el caso
    */

   public boolean validarRepetido(String dato) {
       /* Iniciamos la variable como true ya que hasta el momento no se ha 
        encontrado un elemento repetido */
       boolean comprobar = true;
       String mensaje = "✔ El dato NO se encuentra repetido ";
       // Recorremos todos los elementos de la matriz
       for (int i = 0; i < this.tamaño; i++) {
           for (int j = 0; j < this.tamaño; j++) {
               /* Si el dato que recibe el metodo es igual a cualquiera que se 
                encuentre en la matriz, entonces el dato se encuentra repetido
                y se retorna flase
                */
               if (dato.equals("" + this.casillas[i][j])) {
                   mensaje = "X El dato se encuentra repetido";
                   comprobar = false;

               }
           }
       }
       System.out.println(mensaje);
       return comprobar;
   }

   // El metodo permite imprimir cada elemento que contenga la matriz
   void imprimeMatriz() {
       /* Se recorre cada elemento de la matriz con el fin de
        imprimirlo en la consola */
       for (int i = 0; i < this.casillas.length; i++) {
           for (int j = 0; j < this.casillas.length; j++) {
               System.out.print(this.casillas[i][j]);
           }
           System.out.println();
       }
   }

   /* Valida que cada una de las validaciones que debe cumplir sea verdadera 
    retornando un true o false dependiendo el caso
    */
   public boolean validarCasilla(String dato) {
       boolean comprobar;
       System.out.println("Valor ingresado: " + dato);
       // Si cada validacion es verdadera entonces retorna true
       if ((validarLargo(dato)) && (esNumero(dato)) && (validarRango(dato)) && (validarRepetido(dato))) {
           System.out.println("= Todo ok!" + "\n" + "--------------");
           comprobar = true;
           // Si alguna validacion NO es verdadera retorna false
       } else {
           System.out.println("= WTF! hay un error" + "\n" + "--------------");
           comprobar = false;

       }
       //System.out.println(">>> " + imprimirArrayList());
       return comprobar;
   }

   /* El metodo permite guardar el elemento que recibe por parametro
    en una posisicion especifica de la matriz la cual tambien recibe como parametro.
    */
   public String guardarDato(String dato, int fila, int columna) {
       String cadena;
       /* Si todo lo necesario para que pueda ingresar el dato a la matriz 
        es valido entonces se le asigna el valor a la matriz y lo retorna*/
       if (validarCasilla(dato)) {
           casillas[fila][columna] = Integer.parseInt(dato);
           cadena = dato;
       } else {
           /* Si no se puede ingresar un valor valido se le asigna un 0, esto 
            con el fin de eliminar un posible elemento añadido anteriormente
            en la misma posicion. En este caso retorna una cadena vacia
            */
           casillas[fila][columna] = Integer.parseInt("0");
           cadena = "";
       }
       imprimeMatriz();
       return cadena;
   }

   /* Valida que la existencia de datos validos dentro de la matriz
    sea distinta de 0 con el fin de poder realizar la comprobacion del
    cuadrado magico, retorna un true o false dependiendo el caso
    */
   public boolean comprobarExistenciaDatos() {
       /* El boolaando comienza siendo true ya que aun no sabemos si existen
        ceros dentro de la matriz */
       boolean comprobar = true;
       // Se recorre la matriz para evaluar cada elemento por separado
       for (int i = 0; i < this.tamaño; i++) {
           for (int j = 0; j < this.tamaño; j++) {
               // Si encontramos un 0 en algun lugar de la matriz entonces retornamos false        
               if (this.casillas[i][j] == 0) {
                   comprobar = false;
                   // El encontrar un solo elemento con esta condicion detenemos el ciclo            
                   break;
               }
           }
       }
       return comprobar;
   }

   /* Metodo nos permite extraer una fila, columna o diagonal especifica de la
    matriz en forma de arreglo. Recibe el nombre de lo que buscamos y su numero.
    */
   public int[] extraerRegion(String region, int num) {
       //Arreglo que nos permite guardar los datos segun el caso.
       int[] subdatos = new int[this.tamaño];
       // Dependiendo de los parametros se realiza una accion diferente
       switch (region) {
           case "fila":
               // Recorre una fila y la guarda en el arreglo
               for (int i = 0; i < this.tamaño; i++) {
                   subdatos[i] = this.casillas[num][i];
               }
               break;
           case "columna":
               // Recorre una columa y la guarda en el arreglo
               for (int i = 0; i < this.tamaño; i++) {
                   subdatos[i] = this.casillas[i][num];
               }
               break;
           case "diagonal0":
               // Recorre la primera diagonal y la guarda en el arreglo
               for (int i = 0; i < this.tamaño; i++) {
                   subdatos[i] = this.casillas[i][i];
               }
               break;
           case "diagonal1":
               // Recorre la segunda diagonal y la guarda en el arreglo
               int cont = 2;
               for (int i = 0; i < this.tamaño; i++) {
                   subdatos[i] = this.casillas[i][cont--];
               }
               break;
       }
       return subdatos;
   }

//Este metodo nos permite sumar cada elemtno de una region especifica y la retorna
   public int sumarRegion(String region, int num) {
       /* Se obtienen los datos de la region especifica de la matriz y se guardan 
        en un arreglo "datossuma"*/
       int datossuma[] = extraerRegion(region, num);
       String cadena = "";
       int suma = 0;
       // Recorremos el arreglo y sumamos cada elemento
       for (int i = 0; i < this.tamaño; i++) {
           cadena = cadena + datossuma[i];
           suma = suma + datossuma[i];
       }
       System.out.println("La " + region + num + " compuesta por " + cadena + " suma: " + suma);
       return suma;
   }

   /* Metodo que comprueba que la matriz cumpla con las condiciones para ser considerada un cuadrado magico.
    retorna un true o false dependiendo el caso*/
   public boolean comprobarCM() {
       // Si todas las regiones de la matriz suman 15, entonces retorna true     
       if ((sumarRegion("fila", 0) == 15) && (sumarRegion("fila", 1) == 15) && (sumarRegion("fila", 2) == 15)
               && (sumarRegion("columna", 0) == 15) && (sumarRegion("columna", 1) == 15) && (sumarRegion("columna", 2) == 15)
               && (sumarRegion("diagonal0", 0) == 15) && (sumarRegion("diagonal1", 0) == 15)) {
           return true;
       } else {
           // Si alguna de las regiones no es igual a 15, entonces retorna false
           return false;
       }
   }

//Metodo que limpia la matriz llenandola de ceros
   public void limpiarCasillas() {
//Recorre la matriz asignandole un 0 a cada elemento
       for (int i = 0; i < this.tamaño; i++) {
           for (int j = 0; j < this.tamaño; j++) {
               this.casillas[i][j] = 0;
           }
       }
   }
}
