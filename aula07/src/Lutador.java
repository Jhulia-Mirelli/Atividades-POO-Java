public class Lutador {
    private String nome, nacionalidade, genero, categoria;
    private int idade, vitorias, derrotas, empates;
    private double altura, peso;

    // Construtor
    public Lutador(String nome, String nacionalidade, String genero, int idade, double altura, double peso,
            int vitorias, int derrotas,
            int empates) {
        setNome(nome);
        setNacionalidade(nacionalidade);
        setGenero(genero);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setVitorias(vitorias);
        setDerrotas(derrotas);
        setEmpates(empates);

    }

    // getters e setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {
        if (peso < 52.2) {
            this.categoria = "Inválido";
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    // metodos
    public void apresentar() {
        System.out.println("----------------------");
        if (this.getGenero().equals("masc")) {
            System.out.println("Ficha do Lutador");
        } else {
            System.out.println("Ficha da Lutadora");
        }
        System.out.println("----------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Peso: " + getPeso() + " Kg");
        System.out.println("Altura: " + getAltura());
    }

    public void status() {
        System.out.println("----------------------");
        if (this.getGenero().equals("masc")) {
            System.out.println("Status do Lutador " + getNome());
        } else {
            System.out.println("Status da Lutadora " + getNome());
        }
        System.out.println("----------------------");
        System.out.println("Categoria: Peso " + getCategoria());
        System.out.println("Vitrória(s): " + getVitorias());
        System.out.println("Derrota(s): " + getDerrotas());
        System.out.println("Empate(s): " + getEmpates());
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}
