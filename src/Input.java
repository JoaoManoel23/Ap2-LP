
import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;
public class Input {
    Scanner tc = new Scanner(System.in);



    public int lerInt() {
        System.out.println("Digite um Inteiro");
         int valor;
        try {
            valor= tc.nextInt();
            System.out.println("Número Digitado:"+valor);
        } catch (Exception io) {
            System.out.println("erro ao ler inteiro");
        }finally{
            return valor=0;
        }
    }
    public String lerInt(String msg) {
        System.out.println(msg);
        return tc.next();
    }
    public String lerJopInt(String msg){
        return JOptionPane.showInputDialog(msg);
    }

    public String lerString(){
        System.out.println("Digite uma String");
        String palavra= tc.nextLine();
        return tc.nextLine();
    }
    public String lerString(String msg){
        System.out.println(msg);
        return tc.next();
    }
    public String lerJopString(String msg){
        return JOptionPane.showInputDialog(msg);
    }
    public Float lerFloat(){
        System.out.println("Digite um Float");
        float valor;
        try {
            valor= tc.nextFloat();
            System.out.println("Número Digitado:"+valor);
        } catch (Exception io) {
            System.out.println("erro ao ler float");
        }finally{
            return valor=0;
        }
    }
    public String lerFloat(String msg) {
        System.out.println(msg);
        return tc.next();
    }
    public String lerJopFloat(String msg){
        return JOptionPane.showInputDialog(msg);
    }
    public Double lerDouble(){
        System.out.println("Digite um Double");
        double valor;
        try {
            valor= tc.nextDouble();
            System.out.println("Número Digitado:"+valor);
        } catch (Exception io) {
            System.out.println("erro ao ler Double");
        }finally{
            return valor=0;
        }
    }
    public String lerDouble(String msg){
        System.out.println(msg);
        return tc.next();
    }
    public String lerJopDouble(String msg){
        return JOptionPane.showInputDialog(msg);
    }
    public char lerChar() {
        System.out.println("Qual o seu sexo?\nf:feminino\nm:Masculino");
        char sexo=tc.next().charAt(0);
        if(sexo=='f' || sexo=='F'){
            System.out.println("Feminino");
        }
         else if(sexo=='m' || sexo=='M') {
            System.out.println("Masculino");
        }else{
            System.out.println("Não indentificado");
        }
        return sexo;
    }
    public String lerJopchar(String msg){
        return JOptionPane.showInputDialog(msg);
    }










}
