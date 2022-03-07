import java.util.Scanner;

public class Controle
{   
    public static void main(String[] args) 
    {
        int valor;
        

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero");
        valor = leitura.nextInt();

        switch(valor)
        {
            case 1:
                System.out.println("valor = 1 ");
                break;
            
            case 2:
                System.out.println("valor = 5 ");
                break;

            case 3:
                System.out.println("valor = 15 ");
                break;

            default:
                System.out.println("Nenhum dos 3 valoras");

        }

        leitura.close();
    }

}