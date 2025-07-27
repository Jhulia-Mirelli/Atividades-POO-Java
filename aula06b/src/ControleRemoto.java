public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    // metodo construtor
    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    // metodos getter e setters
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // subscrevendo metodos abstratos
    @Override
    public void abrirMenu() {
        if (this.isLigado()) {
            System.out.println("----MENU----");
            System.out.println("Está ligado? " + this.isLigado());
            System.out.println("Está tocando? " + this.isTocando());
            System.out.print("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
            System.out.println("");
        } else {
            System.out.println("Erro!");
        }
    }

    @Override
    public void desligar() {
        if (isLigado()) {
            this.setLigado(false);
            this.setTocando(false);
        }
    }

    @Override
    public void desligarMudo() {
        if (isLigado() && getVolume() == 0) {
            setVolume(50);
        }
    }

    @Override
    public void fecharMenu() {
        if (this.isLigado()) {
            System.out.println("Fechando Menu!");
        } else {
            System.out.println("Erro!");
        }
    }

    @Override
    public void ligar() {
        if (!isLigado()) {
            this.setLigado(true);
            this.setTocando(true);
        }
    }

    @Override
    public void ligarMudo() {
        if (isLigado() && getVolume() > 0) {
            this.setVolume(0);
            this.setTocando(false);
        }
    }

    @Override
    public void maisVolume() {
        if (isLigado()) {
            this.setVolume(getVolume() + 5);
        }
        System.out.println("impossível aumentar volume");
    }

    @Override
    public void menosVolume() {
        if (isLigado()) {
            this.setVolume(getVolume() - 5);
        }
        System.out.println("impossível diminuir volume");
    }

    @Override
    public void pause() {
        if (isLigado() && isTocando()) {
            this.setTocando(false);
        }
    }

    @Override
    public void play() {
        if (isLigado() && !isTocando()) {
            this.setTocando(true);
        }
    }

}
