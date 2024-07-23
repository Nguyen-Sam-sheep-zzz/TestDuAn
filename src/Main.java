public class Main {
    public static void main(String[] args) {
        Bird penguine = new flightLessBird();
        penguine.activity();// chạy chương trình ra "the bird is walking"
        penguine.sleep();   // chạy chuong trình ra "the bird is sleeping"
        Bird parrot = new flightBird();
        parrot.activity(); // chạy chương trình ra "the bird is flying"
        parrot.sleep();
        System.out.println("hello");// chạy chương trình ra "the bird is sleeping"
    }
}