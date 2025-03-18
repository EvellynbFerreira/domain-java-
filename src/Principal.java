public class Principal {
    //Método principal, por onde o programa começa
    public static void main(String[] args) {

        //Criar um objeto a partir da classe Piloto
        Piloto bortoleto = new Piloto();
        bortoleto.nome = "Gabriel  Bortoleto";
        bortoleto.equipe =  "Sauber";
        bortoleto.peso = 45;
        bortoleto.vitorias= 0;


        // Criar um outro objeto do Piloto
        Piloto norris = new Piloto();
        norris.nome = "Lando Norris";
        norris.equipe = "McLaren";
        norris.peso = 68;
        norris.vitorias = 5;

        //Criar um outro objeto do Piloto
        Piloto Verstappen = new Piloto();
        Verstappen.nome = "Max Verstappen";
        Verstappen.equipe = "Red Bull Racing";
        Verstappen.peso = 73;
        Verstappen.vitorias = 44;

        //Exibir os valores
        System.out.println(bortoleto.nome);
        System.out.println(bortoleto.vitorias);
        

    }
}
