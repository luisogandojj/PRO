import java.util.Scanner;

public class VotosIslas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        String[] candidatos = {"Candidato A", "Candidato B", "Candidato C"};
        String[] islas = {"Tenerife", "El Hierro", "La Gomera", "La Palma", "Gran Canaria", "Lanzarote", "Fuerteventura"};

        
        int[][] votos = {
            {233, 54, 45, 14, 435, 87, 67},
            {445, 45, 87, 23, 276, 81, 89},
            {185, 34, 34, 78, 305, 66, 38}
        };

        
        System.out.println("Introduce el nombre de la isla que deseas consultar:");
        String islaBuscada = entrada.nextLine().trim();

        int indiceIsla = -1;
        for (int j = 0; j < islas.length; j++) {
            if (islas[j].equalsIgnoreCase(islaBuscada)) {
                indiceIsla = j;
                break;
            }
        }

        if (indiceIsla != -1) {
            
            int maxVotosIsla = votos[0][indiceIsla];
            int ganadorIsla = 0;

            for (int i = 1; i < candidatos.length; i++) {
                if (votos[i][indiceIsla] > maxVotosIsla) {
                    maxVotosIsla = votos[i][indiceIsla];
                    ganadorIsla = i;
                }
            }
            System.out.println("En la isla de " + islas[indiceIsla] + ", el candidato con más votos es " + candidatos[ganadorIsla] + " con " + maxVotosIsla + " votos.");
        } else {
            System.out.println("Isla no encontrada.");
        }

        
        int maxVotosTotal = -1;
        int ganadorTotal = 0;

        for (int i = 0; i < candidatos.length; i++) {
            int sumaCandidato = 0;
            for (int j = 0; j < islas.length; j++) {
                sumaCandidato = sumaCandidato + votos[i][j];
            }
            if (sumaCandidato > maxVotosTotal) {
                maxVotosTotal = sumaCandidato;
                ganadorTotal = i;
            }
        }

        System.out.println("El candidato con más votos en total es " + candidatos[ganadorTotal] + " con un total de " + maxVotosTotal + " votos.");
    }
}
