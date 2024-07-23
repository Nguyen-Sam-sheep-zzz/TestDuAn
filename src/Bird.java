abstract class Bird {
    public abstract void activity();
    public void sleep() {
        System.out.println("the bird is sleeping");
    }
}

class flightLessBird extends Bird {
    @Override
    public void activity() {
        System.out.println("the bird is walking");
    }
}

class flightBird extends Bird {
    @Override
    public void activity() {
        System.out.println("the bird is flying");
    }
}

