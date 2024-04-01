public class Home8 {
    public static void main(String[] args){
        int shirtPrice = 500;
        System.out.println("shirtPrice: " + shirtPrice);

        int amount = 3;
        System.out.println("amount: " + amount);

        int amountForPrice = 5;
        System.out.println("amountForPrice: " + amountForPrice);

        int addShirt = amountForPrice - amount;
        System.out.println("addShirt: " + addShirt);

        int priceWithoutDiscount = shirtPrice * amount;
        System.out.println("priceWithoutDiscount: " + priceWithoutDiscount);

        int priceAddShirt = addShirt * shirtPrice;
        System.out.println("priceAddShirt: " + priceAddShirt);

        double discount = 10;
        System.out.println("discount: " + discount);

        double AllShirtWithDiscount = (shirtPrice * amountForPrice) - shirtPrice * amountForPrice / 100 * discount;
        System.out.println("AllShirtWithDiscount: " + AllShirtWithDiscount);

        double OneShirtWithDiscount = shirtPrice - (shirtPrice / 100 * discount);
        System.out.println("OneShirtWithDiscount: " + OneShirtWithDiscount);

        double safeMoney = shirtPrice * amountForPrice / 100 * discount;
        System.out.println("safeMoney: " + safeMoney);

        double freeShirt = safeMoney / shirtPrice;
        System.out.println("freeShirt: " + freeShirt);

    }
}
