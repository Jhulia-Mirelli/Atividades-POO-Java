import java.util.Random;

public class Luta {
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovado;

    // métodos getters e setters
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    // métodos
    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if (desafiado.getCategoria().equals(desafiante.getCategoria()) && (desafiado != desafiante) && (desafiado.getGenero().equals(desafiante.getGenero())) ) {
            this.setAprovado(true);
            setDesafiado(desafiado);
            setDesafiante(desafiante);
            System.out.println("--------------------");
            System.out.println(
                    "Marcada a luta entre " + desafiado.getNome() + " e " + desafiante.getNome());
        } else {
            this.setAprovado(false);
            System.out.println("--------------------");
            System.out.println("Não foi possível marcar essa luta.");
        }
    }

    public void lutar() {
        if (isAprovado()) {
            System.out.println("--------------------");
            System.out.println("**Apresentado**");
            desafiado.apresentar();
            desafiante.apresentar();
            System.out.println("--------------------");
            Random rad = new Random();
            int num = rad.nextInt(3);
            // 0 = Empate, 1 = Desafiado, 2 = Desafiante

            switch (num) {
                case 0:
                    getDesafiado().empatarLuta();
                    getDesafiante().empatarLuta();
                    System.out.println("EMPATE!!");
                    break;
                case 1:
                    getDesafiado().ganharLuta();
                    getDesafiante().perderLuta();
                    System.out.println("VENCEDOR DA LUTA: " + getDesafiado().getNome());
                    break;
                case 2:
                    getDesafiante().ganharLuta();
                    getDesafiado().perderLuta();
                    System.out.println("VENCEDOR DA LUTA: " + getDesafiante().getNome());
                    break;
            }
        }
    }
}
