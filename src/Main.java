import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Motor[] listaMotores = new Motor[5];
        List<Auto> listaAutos = new ArrayList<Auto>();
        Map<String,Duenio> listaDuenios = new HashMap<String,Duenio>();




        for (int i = 0; i < listaMotores.length; i++) {
            listaMotores[i]=new Motor(2.0,"XABC"+i,"gasolina");
        }


        for (int i = 0; i < listaMotores.length; i++) {
            System.out.println("El cilindraje del motor "+i+"es : "+listaMotores[i].getCilindraje());
            System.out.println("La serie del motor "+i+"es : "+listaMotores[i].getSerie());
            System.out.println("El combustible del motor "+i+"es : "+listaMotores[i].getTipoCombustible());
            System.out.println("============================================================");
        }

        listaDuenios.put("123456",new Duenio("Carlos"));
        listaDuenios.put("345669",new Duenio("Luis"));
        listaDuenios.put("544323",new Duenio("Ana"));
        listaDuenios.put("654545",new Duenio("Laura"));
        listaDuenios.put("453535",new Duenio("Juan"));

        System.out.println("el nombre del dueño 1 es: "+listaDuenios.get("123456").getNombre());
        System.out.println("el nombre del dueño 1 es: "+listaDuenios.get("654545").getNombre());


        listaAutos.add(new Auto(listaDuenios.get("654545"), listaMotores[2],"XDEW1234","blanco"));
        listaAutos.add(new Auto(listaDuenios.get("544323"), listaMotores[0],"XDEW3453","azul"));
        listaAutos.add(new Auto(listaDuenios.get("123456"), listaMotores[4],"XDEW7565","negro"));

        int aux=0;
        for(Auto auto : listaAutos){

            System.out.println("El nombre del dueño del auto "+aux+" es: "+auto.getDuenio().getNombre());
            System.out.println("La serie del motor del auto "+aux+" es: "+auto.getMotor().getSerie());
            System.out.println("El color del auto "+aux+" es: "+auto.getColor());
        }



    }
}