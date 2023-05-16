public class Main {
    public static void main(String[] args) {

        Card card1 = new Card();
        card1.title = "Vacuum cleaner";
        card1.url ="https://www.website.com";

        Description description1 = new Description();
        description1.price = 57;
        description1.description ="Water-washing, power, huawei";

        card1.description = description1;
    }
}
