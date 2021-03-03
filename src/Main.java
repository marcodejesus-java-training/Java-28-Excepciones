public class Main {
    public static void main(String []args) throws CafeDerramadoException {
        int numero =  2;

        // https://www.youtube.com/watch?v=5mjX7g9EbGY&t=282s
        //System.out.println( 2/0);

        String cadenaNula = null;
        // NullPointerException
        //System.out.println(cadenaNula.length());

        char arreglo [] = {'M', 'r', '.', ' ', 'R', 'o', 'b', 'o', 't'};
        // ArrayIndexOutOfBoundsException
        //char letra = arreglo[25];

        for(int i=0; i<=arreglo.length; i++){
            try{
                System.out.println("Índice: " + i + " - Caractér: " + arreglo[i]);
            }catch (ArrayIndexOutOfBoundsException exception){
                System.out.println("\nNo existe el índice: " + i);
            }
        }

        try{
            int divisonEntreCero = 2/0;
        }catch(ArithmeticException exception){
            //exception.printStackTrace();
            System.out.println(exception.getMessage());
        }finally {
            System.out.println("We always run this line.");
        }

        // Checked Exceptions
        boolean elCafeSeHaDerramado = true;
        if(elCafeSeHaDerramado){
            throw new CafeDerramadoException("Lo siento mucho, pero tu café se ha derramadao!");
        }else{
            System.out.println("Disfruta tu café!");
        }
    }
}
