import model.Kotik;
import java.io.*;
import java.util.ArrayList;

public class Application {
  public static void main(String[] args) {
    Kotik vasya = new Kotik("Вася", 5, 0, 8, "Мррррр");
    Kotik grisha = new Kotik();
    grisha.setKotik("Гриша", 4, 0, 4, "GRAAAAAAADYA");
    vasya.liveAnotherDay();
    System.out.println(vasya.getName() + " " + vasya.getAge());
    System.out.println(vasya.getMeow().equals(grisha.getMeow()) ? "Говорят одинаково" : "Ничего не понятно, мяукают по-разному");
    System.out.println(Kotik.catsQuantity);
  }
}

