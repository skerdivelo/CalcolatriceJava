class Calcolatrice{
    private String nome;
    private double a;
    private double b;
    private int nOperazioni;
    private static int nDefOp=10;

    public Calcolatrice(String nome){
        this.nome = nome;
    }
    public Calcolatrice(Calcolatrice c){
        nome = c.nome;
    }
    public String getNome() {
        return nome;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public int getnOperazioni() {
        return nOperazioni;
    }
    public static int getnDefOp() {
        return nDefOp;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setA(double a) {
        if(a >= 0){
            this.a = a;
        }else{
            System.out.println("Numero negativo");
        }
    }
    public void setB(double b) {
        if(b >= 0){
            this.b = b;
        }else{
            System.out.println("Numero negativo");
        }
    }
    
    public void azzeraNumeri(){
        setA(0);
        setB(0);
    }

    public double somma(){
        nOperazioni++;
        return a+b;
    }
    public double prodotto(){
        nOperazioni++;
        return a*b;
    }
    public double sottrazione(){
        nOperazioni++;
        if(a-b<0){
            System.out.println("Risultato negativo");
            return -1;
        }else{
            return a-b;
        }
    }
    public double divisione(){
        nOperazioni++;
        if(b==0){
            System.out.println("Il dividendo non può essere 0");
            return -1;
        }else{
            return a/b;
        }
    }

    public void verificaOperazione(double risultato, char operazione){
        switch(operazione){
            case '+':
                if(somma()==risultato){
                    System.out.println("Bravo hai indovinato");
                }else{
                    System.out.println("Hai sbagliato, prova ancora");
                }
            break;

            case '-':
                if(sottrazione()==risultato){
                    System.out.println("Bravo hai indovinato");
                }else{
                    System.out.println("Hai sbagliato, prova ancora");
                }
            break;
                
            case '/':
                if(divisione()==risultato){
                    System.out.println("Bravo hai indovinato");
                }else{
                    System.out.println("Hai sbagliato, prova ancora");
                }
            break;

            case '*':
                if(prodotto()==risultato){
                    System.out.println("Bravo hai indovinato");
                }else{
                    System.out.println("Hai sbagliato, prova ancora");
                }
            break;

            default:
                System.out.println("Errore, scegli un'operazione: ");
        }
    }
    public boolean verificaCambioPile(){
        if(nOperazioni)
    }
}