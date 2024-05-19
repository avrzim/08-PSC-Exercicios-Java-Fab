class Empregado{
    private String nome;
    private int idade;
    private double salario;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Empregado(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void Promover(){
        double novoSalario;
        if (idade >= 18) {
            novoSalario = salario + (salario * 0.25);
            System.out.println(novoSalario);
        }else if (idade < 18) {
            System.out.println("Idade insuficiente.");
        }
    }

    public void aumentarSalario(double percAumento){
        salario += salario * percAumento;
    }
    
    public void demitir(int escolhaDemisao){
        double multaSalario;
        switch (escolhaDemisao) {
            case 1:
                System.out.println("Demitido por justa causa! Deverá cumprir o aviso prévio.");
                break;
            case 2:
                multaSalario = salario + (salario * 0.4);
                System.out.println("O empregado recebeu um bônus de recisão de: " + multaSalario);
                break;
            case 3:
                if (salario >= 1000 && salario < 2000) {
                    System.out.println("Aposentadoria de 1500 reais!");
                }else if (salario >= 2000 && salario < 3000) {
                    System.out.println("Aposentadoria de 2500 reais!");
                }else if (salario >= 3000 && salario < 4000) {
                    System.out.println("Aposentadoria de 3500 reais!");
                }else if (salario >= 4000) {
                    System.out.println("Aposentadoria de 4000 reais!");
                }
                break;
            default:
                System.out.println("Escolha um opção válida!");
                break;
        }
    }
    public void fazerAniversario(){
        int novaIdade;
        novaIdade = idade + 1;
        System.out.println("O empregado: " + nome + " está fazendo aniversário! Parabéns e feliz " + novaIdade + " anos!!");
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Salário: " + salario;
    }
}