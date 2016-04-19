import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Scrabble {

  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put ("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");

      String inputtedWord = request.queryParams("word");
      Scrabble myScrabble = new Scrabble();
      Integer results = myScrabble.calculateScore(inputtedWord);


      model.put("results", results);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }


  public static Integer calculateScore(String userWord) {
    char[] resultsCharArray = userWord.toCharArray();

for

    Hashmap hm = new Hashmap();
    hm.put('a', 1)
    hm.put('e', 1)
    hm.put('i', 1)
    hm.put('o', 1)
    hm.put('u', 1)
    hm.put('l', 1)
    hm.put('n', 1)
    hm.put('r', 1)
    hm.put('s', 1)
    hm.put('t', 1)
    hm.put('d', 2)
    hm.put('g', 2)
    hm.put('b', 3)
    hm.put('c', 3)
    hm.put('m', 3)
    hm.put('p', 3)
    hm.put('f', 4)
    hm.put('h', 4)
    hm.put('v', 4)
    hm.put('w', 4)
    hm.put('y', 4)
    hm.put('k', 5)
    hm.put('j', 8)
    hm.put('x', 8)
    hm.put('q', 10)
    hm.put('z', 10)

      // if ( userWord.equals('a') || userWord.equals('e') || userWord.equals('i') || userWord.equals('o') || userWord.equals('u') || userWord.equals('l') || userWord.equals('n') || userWord.equals('r') || userWord.equals('s') || userWord.equals('t') ) {
      //   return 1;
      // } else if ( userWord.equals('d') || userWord.equals('g') ) {
      //   return 2;
      // } else if ( userWord.equals('b') || userWord.equals('c') || userWord.equals('m') || userWord.equals('p') ) {
      //   return 3;
      // } else if ( userWord.equals('f') || userWord.equals('h') || userWord.equals('v') || userWord.equals('w') || userWord.equals('y') ) {
      //   return 4;
      // } else if ( userWord.equals('k') ) {
      //   return 5;
      // } else if ( userWord.equals('x') || userWord.equals('j') ) {
      //   return 8;
      // } else if ( userWord.equals('z') || userWord.equals('q') ) {
      //   return 10;
      // } else {
      //   return 568;
      // }
    }
  }
}
// ArrayList<Object> userWord = new ArrayList<Object>();
