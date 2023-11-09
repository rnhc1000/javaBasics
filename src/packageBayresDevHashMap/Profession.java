package packageBayresDevHashMap;

import java.util.HashMap;
import java.util.Map;

public class Profession {

  public static Map<String, String> designateProfession() {

    Map<String, String> mapProfession = new HashMap<String, String>();

    mapProfession.put("Ricardo Ferreira", "Software Engineer");
    mapProfession.put("Perpétua Costa", "BioMedics");
    mapProfession.put("Rita Ferreira", "Medic");

    return mapProfession;

  }

  public static String returnProfession(String name) {

    Map<String, String> p = new HashMap<String, String>();
    String profession = "";
    p = designateProfession();
    if (p.containsKey(name)) {
      profession = p.get(name);
      return profession;
    }
    return null;
  }

  public static void main(String[] args) {
    String nome = "Ricardo Ferreira";

    String profession = "";

    profession = returnProfession(nome);

    if (profession == null) {

      System.out.println("Name not found!");
    } else {

      System.out.println("The profession of " + nome + " is " + profession);
    }
  }

}
