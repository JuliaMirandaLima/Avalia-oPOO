public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    // Método comum
    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    // Método abstrato (não possui corpo na classe mãe)
    public abstract void emitirSom();
}
