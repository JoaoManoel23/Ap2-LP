import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Input tc=new Input();
        Scanner tc2 = new Scanner(System.in);
        char opcao;
        System.out.println("Escolha entre \ns.Scanner ou j.JOPTIONPANE");
        opcao= tc2.next().charAt(0);
        if(opcao=='s'|| opcao=='S'){
            tc.lerChar();
            tc.lerInt();
            tc.lerInt("Olá");
            tc.lerString();
            tc.lerString("Olá");
            tc.lerFloat();
            tc.lerFloat("Olá");
            tc.lerDouble();
            tc.lerDouble("Tchau");

        }
        if(opcao=='j' || opcao=='J'){
            tc.lerJopInt("Digite um inteiro");
            tc.lerJopString("Digite uma string");
            tc.lerJopchar("Digite seu sexo\nm masculino ou f feminino");
            tc.lerJopDouble("Digite um double");
            tc.lerJopFloat("Digite um float");
        }



    }
}
