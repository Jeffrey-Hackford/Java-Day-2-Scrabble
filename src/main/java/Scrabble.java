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
      System.out.println(inputtedWord);
      Scrabble myScrabble = new Scrabble();
      Integer results = myScrabble.calculateScore(inputtedWord);

      model.put("results", results);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }


  public static Integer calculateScore(String userWord) {

    //.equals to compare strings
    //userWord.equals("a")

    if ( userWord.equals("a") || userWord.equals("e") || userWord.equals("i") || userWord.equals("o") || userWord.equals("u") || userWord.equals("l") || userWord.equals("n") || userWord.equals("r") || userWord.equals("s") || userWord.equals("t") ) {
      return 1;
    } else if ( userWord == "d" || userWord == "g") {
      return 2;
    } else if ( userWord == "b" || userWord == "c" || userWord == "m" || userWord == "p") {
      return 3;
    } else if ( userWord == "f" || userWord == "h" || userWord == "v" || userWord == "w" || userWord == "y") {
      return 4;
    } else if ( userWord == "k") {
      return 5;
    } else if ( userWord == "x" || userWord == "j") {
      return 8;
    } else if ( userWord == "z" || userWord == "q") {
      return 10;
    } else {
      return 568;
    }
  }
}
// ArrayList<Object> userWord = new ArrayList<Object>();
