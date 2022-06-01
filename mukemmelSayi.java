import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args){

        // Mükemmel sayı bulma

        int a, top = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayiyi giriniz : ");
        a = inp.nextInt();
        for (int i = 1; i < a; i++){
            if (a%i==0){
                top += i;
            }
        }
        if (a == top){
            System.out.println(a + " bir mukemmel sayidir!");
        } else
            System.out.println(a + " bir mukemmel sayi degildir...");
    }
}
