package cursoEmVideo;

import java.util.Locale;

public class teste {
    public static void main(String[] args) {
        Locale local = Locale.getDefault();
        String linguagem = local.getLanguage();
        String pais = local.getCountry();

        System.out.println("Linguagem do sistema: " + linguagem);
        System.out.println("País: " + pais);
        System.out.println("Nome da linguagem (exibido): " + local.getDisplayLanguage());
    }
}
