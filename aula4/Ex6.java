import java.util.Scanner;

public class Ex6 {
    public static final Scanner KB = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.print("\nIntroduza a largura: ");
            int w = KB.nextInt();
            System.out.print("Introduza a altura: ");
            int h = KB.nextInt();

                
            if( w>0 && h>0 ){

                System.out.print("\n");

                for(int i=0; i<h ;i++){
                    for(int j=0; j<w ;j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }

                System.out.print("\n\n");

                break;
            }else{
                System.out.print("\nNumeros introduzidos inválidos! Tente outra vez.\n");
            }
        }
    }
}
