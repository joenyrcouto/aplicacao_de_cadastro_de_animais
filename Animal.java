package animal;
public class Animal {
    private String nome;
    private String especie;
    private String habitat;
    private String tamanho;
    private String peso;
    private String classe;

    public Animal() {
    }

    public Animal(String nome, String especie, String habitat, String classe, String tamanho, String peso) {
        this.nome =  nome;
        this.especie = especie;
        this.habitat = habitat;
        this.tamanho = tamanho;
        this.peso = peso;
    }
    
    public void andar()
    {
        System.out.println("Animal andando...");
    }
    public void comer()
    {
        System.out.println("Animal comendo...");
    }
    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
   
}