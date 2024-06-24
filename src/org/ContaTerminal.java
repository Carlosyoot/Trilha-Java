package  org;

class BancoTerminal {

    private int numero;
    private int agencia;
    private String nomeConta;
    private float saldo;

    public BancoTerminal(int numero, int agencia, String nomeConta, float saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeConta = nomeConta;
        this.saldo = saldo;
    }

    public int getNumero(){
        return numero;
    }

    public int getAgencia(){
        return agencia;
    }

    public String getNomeConta(){
        return nomeConta;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setNumero(int numero){
        this.numero =  numero;
    }

    public void setAgencia(int agencia){
        this.agencia =  agencia;
    }

    public void setNome(String nomeConta){
        this.nomeConta =  nomeConta;
    }

    public void setSaldo(float saldo){
        this.saldo =  saldo;
    }

}