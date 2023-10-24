public class Carro{
    private String cor;
    private String modelo;
    private int aro;
    private double valorCarro;

    public Carro(){

    }
    public Carro(int aro){
        this.aro=aro;
    }
    public Carro(int aro, String modelo){
        this.aro=aro;
        this.modelo=modelo;
    }
    
    public Carro(int aro, String modelo, double valorCarro){
        this.aro=aro;
        this.modelo=modelo;
        this.valorCarro=valorCarro;
    }
    public Carro( String modelo, int aro,double valorCarro){
        this.aro=aro;
        this.modelo=modelo;
        this.valorCarro=valorCarro;
    }
    public Carro( String modelo, int aro,double valorCarro, String cor){
        this.aro=aro;
        this.modelo=modelo;
        this.valorCarro=valorCarro;
        this.cor=cor;
    }

    //4 atributos para o Carro e faça três construtores

    }