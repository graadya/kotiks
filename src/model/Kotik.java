package model;

public class Kotik {
  private String name;
  private int age;
  private int satiety;
  private int weight;
  public static int catsQuantity = 0;
  private String meow;

  private boolean screamAtNight() {
    return action("МЯУУУУУУУУ");
  }

  private boolean tygydyk() {
    return action("Тыгыдык, тыгыдык.... Тыгыдык");
  }

  private boolean play() {
    return action("Котик играет");
  }

  private boolean sleep() {
    return action("Котик спит");
  }

  private boolean chaseMouse() {
    return action("Котик гонится за мышкой");
  }

  public Kotik(String name, int age, int satiety, int weight, String meow) {
    setKotik(name, age, satiety, weight, meow);
    catsQuantity++;
  }

  public Kotik() {
    catsQuantity++;
  }

  public void setKotik(String name, int age, int satiety, int weight, String meow) {
    this.name = name;
    this.age = age;
    this.satiety = satiety;
    this.weight = weight;
    this.meow = meow;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getSatiety() {
    return satiety;
  }

  public int getWeight() {
    return weight;
  }

  public String getMeow() {
    return meow;
  }

  public void liveAnotherDay() {
    for (int i = 0; i < 24; i++) {
      int result = (int) Math.round(Math.random() * 4);
      boolean catDidAction = false;
      switch (result) {
        case 0:
          catDidAction = chaseMouse();
          break;
        case 1:
          catDidAction = sleep();
          break;
        case 2:
          catDidAction = play();
          break;
        case 3:
          catDidAction = screamAtNight();
          break;
        case 4:
          catDidAction = tygydyk();
          break;
        default:
          break;
      }
      if (!catDidAction) eat();
    }
  }

  private void eat(int addSatiety) {
    satiety += addSatiety;
  }

  private void eat(int addSatiety, String food) {
    eat(addSatiety);
  }

  private void eat() {
    eat(5, "Гречка");
  }
  /*
   * service methods
   * some
   */

  private void say(String inputMsg) {
    System.out.println(inputMsg);
  }

  private boolean action(String msg) {
    if (satiety <= 0) {
      say("Действие не выполнено, " + getName() + " хочет есть");
      return false;
    }
    say(getName() + ": " + msg);
    return true;
  }

}
