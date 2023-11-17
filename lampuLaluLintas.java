
package day.pkg100;
import java.util.Scanner;
public class lampuLaluLintas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan status lampu lalu lintas (merah, kuning, hijau):");
        String lampuLaluLintas = scanner.nextLine();

        // Percabangan untuk mengatur perilaku lampu lalu lintas
        switch (lampuLaluLintas.toLowerCase()) {
            case "merah":
                System.out.println("Lampu merah, berhenti.");
                break;
            case "kuning":
                System.out.println("Lampu kuning, bersiap untuk berhenti.");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silakan lanjut.");
                break;
            default:
                System.out.println("Status lampu tidak valid.");
                break;
        }
    }
}

