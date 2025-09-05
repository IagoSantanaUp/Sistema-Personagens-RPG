public class Personagem {
    //Atributos dos personagens
    private String nome;
    private int nivel;
    private int pontosVida;
    private int pontosMana;
    private int experiencia;
    private String classe; //Guerreiro, Mago, Arqueiro

    public void setNome(String nome) {
        if (nome.length() > 2 && nome.length() < 16){
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome inválido");
        }

    }

    public void setNivel(int nivel) {
        if (nivel > 0 && nivel <= 100){
            this.nivel = nivel;
        } else {
            throw new IllegalArgumentException("Nível inválido");
        }

    }

    public void setPontosVida(int pontosVida) {
        if (pontosVida > 0 && pontosVida <= 1000){
            this.pontosVida = pontosVida;
        } else {
            throw new IllegalArgumentException("Pontos de vida inválida");
        }

    }

    public void setPontosMana(int pontosMana) {
        if (pontosMana > 0 && pontosMana <= 500){
            this.pontosMana = pontosMana;
        } else {
            throw new IllegalArgumentException("Pontos de mana inválida");
        }
    }

    public void setExperiencia(int experiencia) {
        if (experiencia > 0){
            this.experiencia = experiencia;
        } else {
            throw new IllegalArgumentException("Pontos Experiência inválida");
        }

    }

    public void setClasse(String classe) {
        if (classe == "Guerreiro" || classe == "Mago" || classe == "Arqueiro"){
            this.classe = classe;
        } else {
            throw new IllegalArgumentException("Classe inválida");
        }

    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public int getPontosMana() {
        return pontosMana;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public String getClasse() {
        return classe;
    }

    public void ganharExperiencia(int exp) {
        experiencia += exp;
    }

    public void subirNivel(){
        nivel += 1;
        pontosVida = 1000;
        pontosMana = 500;
    }

    public void receberDano(int dano){
        pontosVida -= dano;
    }

    public void usarMana(int custo){
        pontosMana -= custo;
    }

    public void mostrarStatus(){
        System.out.println("Nome personagem: " + getNome() +  " Níve: " + getNivel() + " Pontos de vida: " + getPontosVida() + " Pontos de mana: " + getPontosMana() + " Experiência: " + getExperiencia() + " Classe: " + getClass());
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", pontosVida=" + pontosVida +
                ", pontosMana=" + pontosMana +
                ", experiencia=" + experiencia +
                ", classe='" + classe + '\'' +
                '}';
    }
}
