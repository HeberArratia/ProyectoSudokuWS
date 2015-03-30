package controlador;

/**
*
* @author Heber
*/
public class Sudoku {
//Se crean 9 cuadrados magicos que componen el sudoku
   private CuadradoMagico cuadrados[] = new CuadradoMagico[9];

   public Sudoku() {
  // El constructor instancia todos los "cuadradosmagicos"
       cuadrados[0] = new CuadradoMagico(3);
       cuadrados[1] = new CuadradoMagico(3);
       cuadrados[2] = new CuadradoMagico(3);
       cuadrados[3] = new CuadradoMagico(3);
       cuadrados[4] = new CuadradoMagico(3);
       cuadrados[5] = new CuadradoMagico(3);
       cuadrados[6] = new CuadradoMagico(3);
       cuadrados[7] = new CuadradoMagico(3);
       cuadrados[8] = new CuadradoMagico(3);
   }
  /* El metodo validarRepetido recibe el dato que va a evaluar si se encuentra repetido, 
   la region (fila o columna), la posicion que indica que fila o columna 
   y el sector en que se encutra la region. 
   */
   public int validarRepetido(String dato,String region,int num,int sector){
       // El dato ingresa como String y se convierte a entero
       int datoint = Integer.parseInt(dato);
       /* El contador va a determinar si se encuentra repetido puesto que siempre
       el dato se va a presentar una vez dentro de la fila o columna evaluada
       */
       int cont = 0;
       System.out.println("datoint: " + datoint);
       // Se guarda en el arreglo datos la region solicitada a evaluar
       int datos[] = obtenerRegion(region,num,sector);
       //Se recorre el arreglo
       for (int i = 0; i < datos.length; i++) {
           if(datoint==datos[i]){
       // Si se encuentra el dato en el arreglo entonces el contador suma uno. 
               System.out.println(datoint + " es igual a " + datos[i]);
               cont++;
           } 
       }
       System.out.println("el boolean: " + cont);
      // Se retorna el contador 
     return cont;
   }
   
   /* Este metodo retorna un arreglo con la fila o columna solicitada. Recibe la region
   (fila o columna), el numero de fila o columna y el sector en que se encuentra la fila o columna
   */
   public int[] obtenerRegion(String region,int num, int sector) {
   /* Se crean 3 arreglos de cada fila o columa del cuadrado magico de 3x3
   para hacer un total de 9 que corresponde a la fila o columna todal del sudoku*/
          int sector1[] = new int[3];
          int sector2[] = new int[3];
          int sector3[] = new int[3];
      // Si la region es igual a "fila" ejecuta el siguiente codigo       
       switch (region) {
           case "fila":        
               sector1 = cuadrados[sector++].extraerRegion(region, num);
               sector2 = cuadrados[sector++].extraerRegion(region, num);
               sector3 = cuadrados[sector++].extraerRegion(region, num);
               break;
       // Si la region es igual a "columna" ejecuta el siguiente codigo       
           case "columna":
               sector1 = cuadrados[sector].extraerRegion(region, num);
               sector2 = cuadrados[sector = sector+3].extraerRegion(region, num);
               sector3 = cuadrados[sector = sector+3].extraerRegion(region, num);
               break;
       }
       // Se guardan los arrelgos en uno general
          int sectortotal[] = new int[9];
          for (int i = 0; i < 3; i++) {
               sectortotal[i] = sector1[i];
               sectortotal[3+i] = sector2[i];
               sectortotal[6+i] = sector3[i];
          }

          // Imprimir
//          String cadena = "";
//          for (int i = 0; i < sectortotal.length; i++) {
//           cadena = cadena + sectortotal[i];
//       }
//          System.out.println(region + "s" + cadena);
          
       return sectortotal;
   }
   
   public String almacenarDato(String dato, int fila, int columna, int cuadrado, int sectorfila, int sectorculumna) {    
       // Se guarda en la variable aux el valor que retorna la funcion guardarDato
       String aux = this.cuadrados[cuadrado].guardarDato(dato, fila, columna);
       System.out.println("el dato es: " + aux);
       /* Si el String que retorna la funcion guardar dato no es vacia, y el dato no
       se encuentra repetido ni en su fila ni culumna se ejecuta el codigo dentro del if*/
       if ((aux.equals("")==false) && (validarRepetido(dato,"fila",fila,sectorfila)<2)
            && (validarRepetido(dato,"columna",columna,sectorculumna)<2)){
            System.out.println("todo en orden");
       /* Si la condicion es falsa entonces guardamos un string vacio en aux y enviamos
            un 0 a la posicion del dato en el cuadradomagico*/
       } else{
           aux = "";
           this.cuadrados[cuadrado].guardarDato("0", fila, columna);
       }
       return aux;
   }
   
   /* Este método se encarga de sumar cada uno de los elementos de de una fila o
   columna
   */
   public boolean sumarSeccion(String region,int num,int sector){
       boolean comprobar = false;
       // Se guarda la region en el arreglo datos
       int datos[] = obtenerRegion(region, num, sector);
       int suma = 0;
       // Se recorre el arreglo y se suma cada tado
       for (int i = 0; i < datos.length; i++) {
           suma = suma + datos[i];
       }
       // Si la suma de todos los elemntos es 15 se retorna true
       if (suma==45){
           comprobar = true;
       }
       return comprobar;
   }
   
//El siguiente metodo     
   public String comprobarSudoku(){
       // El booleano que retorna comienza true
       String comprobar = "Sudoku Completo";
     // Se recorren los datos de la forma correspondiente
       for (int i = 0; i <= 6; i+=3) {
           System.out.println(i);
           for (int j = 0; j < 3; j++) {
      /* Si la funcion suma retorna un false entonces el booleano se hace false*/
               if (sumarSeccion("fila", j, i)==false){
                   comprobar = "Error en sudoku";
               }
           }
       }
       for (int i = 0; i <= 2; i++) {
           System.out.println(i);
           for (int j = 0; j < 3; j++) {
         /* Si la funcion suma retorna un false entonces el booleano se hace false*/
               if (sumarSeccion("columna", j, i)==false){
                   comprobar = "Error en sudoku";
               }
           }
       }
        System.out.println("es " + comprobar);   
        return comprobar;
   }

/* Es metodo limpia cada cuadrsdo magico asignandole un 0 en casa posicion¨*/
   public void limpiarSudoku(){
       for (int i = 0; i < 8; i++) {
           this.cuadrados[i].limpiarCasillas();
       }
   }

/* Es metodo limpia cada cuadrsdo magico asignandole un 0 en casa posicion¨*/
   public boolean comprobarCeldasLlenas(){
       boolean comprobar = true;
       /* Se recorre cada cuadrado, si el booleano que retorna alguno de estos es falso,
       el booleano local tambien se hace false*/
       for (int i = 0; i < 8; i++) {
           if (this.cuadrados[i].comprobarExistenciaDatos()==false){
               comprobar = false;
          }
       }
       // Se retorna el booleano
       return comprobar;
   }

}
