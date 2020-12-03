public class TestaConta{
  public void testaConta(){
    Conta exemploAna = new Conta("Ana", 1000, true);
    exemploAna.deposita(500);
    Conta exemploJosé = new Conta("José", 200, false);
    exemploJosé.retira(50);
    exemploAna.mostraDados();
    exemploJosé.mostraDados();
  }
}