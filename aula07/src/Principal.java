public class Principal {
    public static void main(String[] args) {
        // nome, nacionalidade, genero = 'masc'/'fem', idade, altura, peso
        Lutador[] l = new Lutador[6];
        l[0] = new Lutador("Andre", "Brasil", "masc", 21, 1.90, 80, 1, 2, 1);
        l[1] = new Lutador("Guilherme", "Itália", "masc", 23, 1.80, 100, 2, 0, 1);
        l[2] = new Lutador("Logan", "Australia", "masc", 27, 1.76, 110, 12, 3, 1);
        l[3] = new Lutador("Maria", "Brasil", "fem", 30, 1.68, 58.4, 10, 8, 3);
        l[4] = new Lutador("Ana", "Brasil", "fem", 26, 1.56, 55.8, 15, 9, 5);
        l[5] = new Lutador("Tisha", "EUA", "fem", 23, 1.76, 96.4, 2, 4, 0);

        l[0].status();
        l[1].status();
        l[2].status();
        l[3].status();
        l[4].status();
        l[5].status();

        Luta vs = new Luta();
        vs.marcarLuta(l[1], l[2]);
        vs.lutar();
        vs.marcarLuta(l[2], l[3]);
        vs.marcarLuta(l[5], l[4]);
        vs.marcarLuta(l[3], l[4]);
        vs.lutar();

        l[1].status();
        l[2].status();
        l[3].status();
        l[4].status();
    }
}
