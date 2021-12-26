import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Musicas> musicas;
        musicas=new HashSet<Musicas>();
        musicas.add(new Musicas("CD","ABC", "3", "Zé", "Zé e amigos", "1990", "NULL", "NULL"));
        musicas.add(new CD("XYZ", "A", "A-Z", "A-Z", "2003"));
        musicas.add(new LP("ddd","DDD","ccc","CCC","2009","27"));
        musicas.add(new MP3("ZZZ","zzz","aaa","AAA","1999","56"));
       // Musicas musica1 = new Musicas("ABC", "3", "Zé", "Zé e amigos", "1990", "NULL", "NULL");
       // CD musica2 = new CD("XYZ", "A", "A-Z", "A-Z", "2003");

       /* System.out.printf("| %1$10s",(musica1.titulo),"| %1$10s", musica1.album,musica1.compositor, musica1.interprete , musica1.ano , musica1.tamanho, musica1.velocidade ,"\n");
        System.out.printf("|%1$10s|%1$10s",musica1.titulo,musica1.album,musica1.compositor, musica1.interprete , musica1.ano , musica1.tamanho, musica1.velocidade);
        System.out.println();
        System.out.println();
        System.out.println(musica1.titulo + musica1.album); */
        System.out.println(musicas);

    }
}
