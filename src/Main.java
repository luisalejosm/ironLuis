public static void main(String[] args) {

    //ejercicio1();
    //Ejercicio2();
    //ejercicio3();
    //ejercicio4();
    //ejercicio5();
    //ejercicio6();

}

    private static String productFormatter(String productName, String date) {

    productName = productName.trim();

    productName = productName.toUpperCase();

    productName = productName.replace(" ","_");

    productName = productName + "_" + date;



    return productName;
}
    private static void ejercicio6() {
    int[] arreglo = {1,2,3,4,5};

    int[] invertido = new int[arreglo.length];

    for(int i = 0; i < arreglo.length; i++){
        invertido[i] = arreglo[arreglo.length - 1 - i];
        System.out.println();
    }

    for (int numero : invertido) {
        System.out.print(numero + " ");
    }
}
    private static void ejercicio5() {
    int[] arreglo = {5,4,3,2,1};
    int[] temp = new int[arreglo.length];

    for(int i = 0; i < arreglo.length - 1; i++){
        temp[i] = arreglo[i] * arreglo[i+1];
    }

    temp[arreglo.length - 1] = arreglo[arreglo.length - 1] * arreglo[0];

    system.arraycopy(temp,0,arreglo,0,arreglo.length);

    for(int valor : arreglo){
        System.out.println(valor + " ");
    }
}
    private static void ejercicio4() {
    String productName = "Producto de prueba";
    String date = "21-08-2024";

    String productFormatter = productFormatter(productName, date);

    System.out.println(productFormatter);
}
    private static void ejercicio3() {
        //        int num1 = 20;
//        int num2 = 5;
//        int num3 = 10;

//        int menor;
//
//        if( num1 <= num2 && num1 <= num3){
//            menor = num1;
//        } else if(num2 <= num1 && num2 <= num3){
//            menor = num2;
//        }else{
//            menor = num3;
//        }

        //System.out.println("El numero menor es: "+ menor);


        int num1 = 10;
        int num2 = 20;
        int num3 = 30;


        int menor = Math.min(Math.min(num1, num2), num3);

        System.out.println("El número menor es: " + menor);
    }
    private static void Ejercicio2() {
        double numero = 10.5;

        Double numeroObjeto = numero;

        if (numeroObjeto instanceof Double) {
            System.out.println("El numero es de tipo double");
        } else {
            System.out.println("No es de tipo double");
        }
    }
    private static void ejercicio1() {
        int nm1 = 20;
        String Prueba = "Java";
        double nm2 = 23.63;

        System.out.println(nm1 + " " + Prueba + " " + nm2);
    }
    private static System system;





