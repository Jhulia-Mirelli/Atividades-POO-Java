public class App {
    public static void main(String[] args) throws Exception {
        Conta c = new Conta();
        c.setnumConta(1111);
        c.setDono("jubileu");
        c.abrirConta("cc");
        
        Conta c2 = new Conta();
        c2.setnumConta(2222);
        c2.setDono("Creuza");
        c2.abrirConta("cp");

        c.depositar(100);
        c2.depositar(500);
        c2.sacar(100);
        c.sacar(150);
        c.fecharConta();

        c.visao();
        c2.visao();
    }
}
