public class unitprice {
    public static void main(String[] args){
        int weighgm = 2000;
        double kilowe =(double)weighgm/1000;
        double priceperkg = 100.0;
        double totprice =(double)kilowe*priceperkg;
        char category;
        //condition to determine category
        if (totprice>400){
            category= 'A';
        } else {
            category='B';
        }
        //displaying output
        System.out.println("=============UNIT PRICE===============");
        System.out.println("the weight in terms of grams "+ weighgm + "gm");
        System.out.println("the weight in terms of kilo\t" +kilowe+"kg");
        System.out.printf("the price per kg is: Rs. %.2f%n",priceperkg);
        System.out.printf("the total price is:  Rs. %.2f%n", totprice);
        System.out.println("the category it belongs to is\t"+category);





    }


}
