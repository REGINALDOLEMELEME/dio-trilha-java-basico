public class App {
    public static void main(String[] args) throws Exception {
      

       String nome = nomeCompleto("Rginaldo","Leme");

       System.out.print(nome);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return primeiroNome + " " + segundoNome;
   

    }
}
