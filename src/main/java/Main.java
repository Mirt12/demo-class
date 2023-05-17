public class Main {
    public static void main(String[] args) {

        Card product1 = new Card();
        product1.title = "Vacuum cleaner";
        product1.url = "https://www.website.com";

        Description variable1 = new Description();
        variable1.price = 57;
        variable1.a = "Water-washing, power, huawei";
//composition:
        product1.description = variable1;
        Flat flat1 = new Flat();
        LivingRoom livingRoom1 = new LivingRoom();
        livingRoom1.numberOfBeds = 2;
        livingRoom1.square = 25;
        flat1.livingRoom = livingRoom1;

//inheritance:
        Kitchen kitchen = new Kitchen();
        kitchen.square = 9;
        kitchen.stove = "gas";
        System.out.println("Square " + kitchen.square + " TypeOfStove " + kitchen.stove);
    }
}
