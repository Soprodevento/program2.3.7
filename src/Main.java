//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Human human = new Human("secret","news","experience","gossip");
    String news = human.getNews();
    String gossip = human.getGossip();
    String exp = human.getExperience();
    System.out.println(news);
    System.out.println(gossip);
    System.out.println(exp);
    }
}

