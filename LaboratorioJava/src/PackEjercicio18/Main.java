package PackEjercicio18;

public class Main {
    public static void main(String[] args) {
        Serie serie1 = new Serie("Arcane", 1, "Ciencia ficción", "Christian Linke Alex Yee");
        Serie serie2 = new Serie("El juego del calamar", 1, "Suspenso", "Hwang Dong-hyuk");
        Serie serie3 = new Serie("Gambito de dama", "Allan Scott");
        Serie serie4 = new Serie();
        Serie serie5 = new Serie("Chicas buenas", 4, "Drama criminal", "Jenna Bans");
        Serie[] series = {serie1, serie2, serie3, serie4, serie5};

        Videojuego vj1 = new Videojuego();
        Videojuego vj2 = new Videojuego("League of Legends", 8);
        Videojuego vj3 = new Videojuego("Valorant", 12, "Shooter", "Riot Games");
        Videojuego vj4 = new Videojuego();
        Videojuego vj5 = new Videojuego("Genshin Impact", 3);
        Videojuego[] videojuegos = {vj1, vj2, vj3, vj4, vj5};

        serie1.entregar();
        serie3.entregar();
        serie5.entregar();
        vj2.entregar();
        vj3.entregar();

        int contadorSeriesEntregadas = 0;
        int contadorVideojuegosEntregados = 0;

        Videojuego mayorHorasEstimadas = videojuegos[0];
        Serie mayorTemporadas = series[0];

        for(Videojuego videojuego : videojuegos){
            if(videojuego.isEntregado()){
                System.out.println("El videojuego "+videojuego.titulo+" está entregado.");
                videojuego.devolver();
                contadorVideojuegosEntregados += 1;
            }
            mayorHorasEstimadas = (Videojuego)mayorHorasEstimadas.compareTo(videojuego);
        }

        for(Serie serie : series){
            if(serie.isEntregado()){
                System.out.println("La serie "+serie.titulo+" está entregada.");
                serie.devolver();
                contadorSeriesEntregadas += 1;
            }
            mayorTemporadas = (Serie)mayorTemporadas.compareTo(serie);
        }

        System.out.println("La cantidad de videojuegos entregados es: "+contadorVideojuegosEntregados+".");
        System.out.println("La cantidad de series entregadas es: "+contadorSeriesEntregadas+".");
        System.out.println("\nLa serie con mayor temporadas es: ");
        System.out.println(mayorTemporadas);
        System.out.println("\nEl videojuego con mayor cantidad de horas estimadas es: ");
        System.out.println(mayorHorasEstimadas);
    }
}
