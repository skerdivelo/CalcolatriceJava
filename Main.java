class Main{
    public static void main(String[] args){
        Calcolatrice c = new Calcolatrice("c1");
        c.setA(10);
        c.setB(20);
        System.out.println(c.somma());
        System.out.println(c.prodotto());
        System.out.println(c.getnOperazioni());
        System.out.println(Calcolatrice.getnDefOp());
        Calcolatrice c2 = new Calcolatrice(c);
        System.out.println(c2.getNome());
        System.out.println(c2.getnOperazioni());
        System.out.println(Calcolatrice.getnDefOp());

    }
}