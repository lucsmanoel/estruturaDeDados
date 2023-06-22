import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String[] estados = new String[6];
        estados[0] = "BA";
        estados[1] = "PI";
        estados[2] = "SP";
        estados[3] = "MG";
        estados[4] = "ES";
        estados[5] = "AL";
            for(int i=0; i < estados.length; i++){
                System.out.println("estados " + i + ":" + estados[i]);
            }
           
            Scanner leitor = new Scanner(System.in);
            System.out.println("Qual estado voce quer buscar");
            String siglaBusca=leitor.nextLine();

             // fazer uma busca linnear no vetor
                     boolean encontrou = false;
             for(int i=0; i < estados.length; i++){
                String elemento = estados[i];
                // o IgnoreCase usado nesse trexo do codigo, impedira que de erro caso eu digite nome minus ou maisc
                if (elemento.equalsIgnoreCase(siglaBusca)){
                encontrou = true;
                    break;
                }
             }
             if(encontrou==true){
                System.out.println("encontrou");
             }else{
                System.out.println("não encontrou");
             }
    }

}