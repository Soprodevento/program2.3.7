public class Human {
    private final String secret; //секретики

    private final String news; //новости

    private final String experience; //опыт

    private final String gossip; //сплетни


    public Human(String secret, String news, String experience, String gossip) {

        this.secret = secret;

        this.news = news;

        this.experience = experience;

        this.gossip = gossip;
        System.out.println(getSecret());
    }

    private String getSecret() {return "Секрет";}
    public  String getNews(){
        return "Новости";
    }
    protected String getExperience(){
        return "Опыт";
    }
    String getGossip(){
        return "Сплетни";
    }
}
