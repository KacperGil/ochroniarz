import java.util.Scanner;

public class Ochroniarz {
    public static void main(String[] args) {
        System.out.println("Jak masz na imię?");
        Scanner scanner=new Scanner(System.in);
        String imie=scanner.nextLine();
        System.out.println("Nazwisko?");
        String nazwisko=scanner.nextLine();
        System.out.println("W jakim mieście mieszkasz?");
        String miasto=scanner.nextLine();
        System.out.println("Ile masz lat?");
        int wiek=scanner.nextInt();
        System.out.println("Czy jesteś w związku? Wpisz true albo false!");
        boolean zwiazek=scanner.nextBoolean();
        String zwiazek2="";
        if(zwiazek){
             zwiazek2="w związku";
        }else {
             zwiazek2="samotny";
        }
        System.out.println(imie.toUpperCase());
        System.out.println(nazwisko.toUpperCase());
        System.out.println(miasto.toUpperCase());
        System.out.println(wiek);
        System.out.println(zwiazek2.toUpperCase());
        System.out.println("Witaj w klubie testersi!");
    }
}
