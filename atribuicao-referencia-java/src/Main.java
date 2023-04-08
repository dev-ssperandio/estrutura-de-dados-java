public class Main {
    public static void main(String[] args) throws Exception {
        // Ao atribuir uma variável a outra é realizado uma cópia do valor
        int intA = 1;
        int intB = intA;

        System.out.println("intA = " + intA + " intB = " + intB);

        intA = 2;
        // Quando altera o valor de uma variável a outra permanece com o valor que foi copiado
        System.out.println("intA = " + intA + " intB = " + intB);

        // Se tratando de objetos, cria uma referência ao invés de uma cópia
        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("objA = " + objA + " objB = " + objB);
        objA.setNum(2);
        // Ao alterar um objeto o que está referenciado também se altera
        System.out.println("objA = " + objA + " objB = " + objB);
        
    }
}
