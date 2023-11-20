public class Main {
    public static void main(String[] args) {

        player first_player = new player();
          first_player.name = "  Kylian mbappe ";
          first_player.age = 24;
          first_player.number =7 ;
          first_player.nationality = "French";
          first_player.team = "Paris Saint-Germain";
          first_player.post = "attacker";
          first_player.info();
          

        player second_player = new player();
        second_player.name = "  Achraf hakimi ";
          second_player.age = 25;
          second_player.number = 2;
          second_player.nationality = "Morrocan";
          second_player.team = "Paris Saint-Germain";
          second_player.post = "Defender";
          second_player.info();
          


        player third_player = new player();
          third_player.name = "Lionel messi";
          third_player.age = 36;
          third_player.number = 10;
          third_player.nationality = "Argentinian";
          third_player.team = "Inter Miami CF";
          third_player.post = "attacker";
      
          third_player.info();



          first_player.pass();
          second_player.shoot();
          third_player.score();

        
    }
}
