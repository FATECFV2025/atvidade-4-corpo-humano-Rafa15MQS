package main.java;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner imc = new Scanner(System.in);

        System.out.println("=== CRIAÇÃO DO OBJETO CORPO HUMANO ===");

        System.out.print("Digite a massa inicial (kg): ");
        double massa = imc.nextDouble();

        System.out.print("Digite o volume inicial (m³): ");
        double volume = imc.nextDouble();

        System.out.print("Digite a altura inicial (m): ");
        double altura = imc.nextDouble();

        CorpoHumano c1 = new CorpoHumano(massa, volume, altura);

        System.out.println("\n=== VALORES INICIAIS ===");
        System.out.println("Massa: " + c1.getMassa() + " kg");
        System.out.println("Volume: " + c1.getVolume() + " m³");
        System.out.println("Densidade: " + c1.getDensidade() + " kg/m³");
        System.out.println("Altura: " + c1.getAltura() + " m");
        System.out.println("IMC: " + c1.calcularIMC());

        System.out.print("\nDigite uma nova massa (kg): ");
        double novaMassa = imc.nextDouble();
        c1.setMassa(novaMassa);

        System.out.print("Digite uma nova altura (m): ");
        double novaAltura = imc.nextDouble();
        c1.setAltura(novaAltura);

        System.out.println("\nNovos valores:");
        System.out.println("Massa: " + c1.getMassa() + " kg");
        System.out.println("Altura: " + c1.getAltura() + " m");
        System.out.println("Novo IMC: " + c1.calcularIMC());

        imc.close();
    }
}


// Na classe Corpo_Humano inclua a linha c1.massa = "2"; logo depois de instanciar o objeto c1.

// Qual foi a ocorrência?
// R: Main.java:4: error: massa has private access in CorpoHumano
//         c1.massa = 2;
//           ^
// 1 error

// Qual a conclusão sobre o que aconteceu?
// R: Os atributos private só podem ser usados dentro da própria classe.

// Na classe Corpo_Humano altere a linha private float Massa para public float Massa;

// Qual foi a ocorrência?
// R: Massa: 2.0

// Qual a conclusão sobre o que aconteceu?
// R: Quando o atributo é public, qualquer parte do código pode acessá-lo.

// Na classe Corpo_Humano altere a linha public setVolume(float volume) para private setVolume(float volume)

// Qual foi a ocorrência?
// R: Main.java:5: error: setVolume(float) has private access in CorpoHumano
//         c1.setVolume(0.08f);
//           ^
// 1 error

// Qual a conclusão sobre o que aconteceu?
// R: Que os métodos private só podem ser usados dentro da própria classe, então o setVolume() não pode mais ser chamado de fora.
