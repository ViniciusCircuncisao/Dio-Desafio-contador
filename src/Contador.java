import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int parametroDois = scanner.nextInt(); 

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        scanner.close();
    }


    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException(); 
        }else{
            int contagem = parametroDois - parametroUm; 
            for(int indice = 1; indice <= contagem; indice++){
                System.out.println("Número " + indice);
            }
        }
    }
}
