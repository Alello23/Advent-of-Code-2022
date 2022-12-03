
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;


        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File("C:\\Users\\Alex\\Desktop\\Universidad\\2n\\paed\\advent\\star1\\src\\hola");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String a;
            String b;
            ArrayList<Character> results = new ArrayList<Character>();
            String rep = "";
            int i = 0;

            // Lectura del fichero
            String linea;

            while ((linea = br.readLine()) != null) {
                a = linea.substring(0, linea.length()/2);
                b = linea.substring(linea.length()/2, linea.length());
                i = 0;
                String p = a.substring(i,i);
                rep = "";

                while (i < linea.length()/2 - 1){
                    p = a.substring(i,i+1);

                    if(b.contains(p) && !rep.contains(p)){
                        results.add(a.charAt(i));
                        rep = rep + a.charAt(i);
//                      i = linea.length()/2 - 1;

                    };
                    i++;
                }

            }
            int sum = 0;
            int basura = 0;
            i = 0;
            while (i < results.size()){

                basura = (results.get(i) - 'A');

                if (basura < 27){
                    basura = basura + 27;
                }
                else{
                    basura = basura - 31;
                }

                sum = sum + basura;
                i++;
            }
            System.out.println(results);
            System.out.println("result = " + sum);




//            System.out.println(sum);
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta
            // una excepcion.
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
    static int atoi(String str)
    {
        try{
            return Integer.parseInt(str);
        }catch(NumberFormatException ex){
            return -1;
        }
    }

    public static void mergeSortName(LinkedList<Integer> vessels, int left, int right) {
        if (left < right) {
            //Find the middle of the linked-list.
            int middle = (left + right) / 2;

            //Call the function mergeSortName to split the two halves
            mergeSortName(vessels, left, middle);
            mergeSortName(vessels, middle + 1, right);

            //mergesort the linked-list
            merge(vessels, left, middle, right);
        }
    }

    //This function compare two letters and if is smaller they swap the element.
    private static void merge(LinkedList<Integer> vessels, int left, int middle, int right) {

        int i, j, k;
        LinkedList<Integer> B = null;


        B = (LinkedList<Integer>) vessels.clone(); //clone the linked-list to the auxiliary one

        i = left;
        j = middle + 1;
        k = left;


        while (i <= middle && j <= right) //Swap the elements
            if (B.get(i) <= B.get(j))
                vessels.set(k++, B.get(i++));
            else
                vessels.set(k++, B.get(j++));

        while (i <= middle)                 //Copy the elements of the first half (if there is)
            vessels.set(k++, B.get(i++));

    }
}
