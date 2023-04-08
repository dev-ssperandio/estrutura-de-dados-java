public class Main {
    
    public static void main(String[] args) {
        
        No<String> no1 = new No<>("conteúdo no1");

        No<String> no2 = new No<>("conteúdo no2");
        no1.setProximoNo(no2); //fazendo a referência do proximoNo de no1 apontar para no2

        No<String> no3 = new No<>("conteudo no3");
        no2.setProximoNo(no3);

        No<String> no4 = new No<>("conteúdo no4");
        no3.setProximoNo(no4);
        
        //no1->no2->no3->no4->null;

        // Testando as referências:
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);

        System.out.println("------------------------");
        // Exibindo o encadeamento:
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
