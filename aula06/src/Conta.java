public class Conta {
    public int numConta;
    private String dono;
    protected String tipo; // cc = conta corrente - cp = conta poupança
    private double saldo;
    private boolean status;

    // Constuctor
    public Conta() {
        this.setStatus(false);
        this.setSaldo(0);
    }

    // getters e setters
    public int getnumConta() {
        return this.numConta;
    }

    public void setnumConta(int n) {
        this.numConta = n;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    // métodos personalizados
    public void abrirConta(String t) {
        if (this.getStatus() == false) {
            this.setStatus(true);
            this.setTipo(t);
            if (t .equals("cp")) {
                this.setSaldo(150);
            } else if (t == "cc") {
                this.setSaldo(50);;
            }
        }
    }

    public void fecharConta() {
        if ((this.getStatus() == true) && (this.getSaldo() == 0)) {
            this.setStatus(false);
        } else {
            System.out.println("Erro!");
        }
    }

    public void depositar(double v) {
        if (this.getStatus() == true) {
            setSaldo(this.getSaldo() + v);
        }
    }

    public void sacar(double v) {
        if ((this.getStatus() == true) && (this.getSaldo() >= v)) {
            this.setSaldo(getSaldo() - v);
        } else {
            System.out.println("Erro!!");
        }

    }

    public void pagarMensal() {
        int v;
        if (this.getStatus()) {
            if (this.getTipo() == "cc") {
                v = 12;
                if (this.getSaldo() >= v) {
                    this.setSaldo(this.getSaldo() - 12);
                } else {
                    v = 20;
                    if (this.getSaldo() >= v) {
                        this.setSaldo(this.getSaldo() - 20);
                    }
                }
            } else {
                System.out.println("Saldo insuficiente!!");
            }
        } else {
            System.out.println("Impossível pagar");
        }
    }

    // status da Conta
    public void visao() {
        System.out.println("------------------------------------");
        System.out.println("Número da conta: " + this.getnumConta());
        System.out.println("Nome: " + this.getDono());
        System.out.println("Saldo disponível: " + this.getSaldo());
        if (this.getTipo() == null) {
            this.setTipo(null);
            System.out.println("Tipo de conta: " + this.getTipo());
        } else {
            System.out.println("Tipo de conta: " + (this.getTipo() == "cp" ? "Conta Poupança" : "Conta Corrente"));
        }
        System.out.println("Status: " + (this.getStatus() ? "Aberto" : "Fechado"));
    }
    
}
