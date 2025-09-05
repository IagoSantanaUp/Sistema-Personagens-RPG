public class Main {
        public static void main(String[] args) {
            Personagem personagem1 = new Personagem();
            personagem1.setNome("Rei");
            personagem1.setNivel(1);
            personagem1.setPontosVida(100);
            personagem1.setPontosMana(100);
            personagem1.setExperiencia(100);
            personagem1.setClasse("Mago");

            personagem1.ganharExperiencia(250);
            personagem1.subirNivel();
            personagem1.subirNivel();
            personagem1.receberDano(500);
            personagem1.mostrarStatus();

            System.out.println(personagem1.toString());
        }
}


