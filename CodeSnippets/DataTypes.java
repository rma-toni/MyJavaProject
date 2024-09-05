public class DataTypes {

    //Solo se pueden declarar variables sin inicializar en la clase, no dentro de algun metodo
    float random;

    public static void main(String[] args) {
        
        //Objets
        String hi = "Hello World!";

        //Primitive y sus clses
        byte verySmallNumber = 10; //8 bits
        System.out.println(Byte.BYTES);
        short smallNumber = 23000; //16 bits
        System.out.println(Short.BYTES);
        int numero = 4020000; //32 bits
        System.out.println(Integer.BYTES);
        long longNumber = 352300089500L; //64 bits
        System.out.println(Long.BYTES);
        float realFloat = 3.1416f; //32 bits
        System.out.println(Float.BYTES);
        double realDouble = 4.7095324E3; //64 bits
        System.out.println(Double.BYTES);
        boolean value = true; //1 bits
        System.out.println(Boolean.FALSE);
        char caracter = 'a'; //16 bits
        System.out.println(Character.BYTES);
        
        //Dynamic
        var dato1 = 14;
        var dato2 = "Hello!";
    }
}
