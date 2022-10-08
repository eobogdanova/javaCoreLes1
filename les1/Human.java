package les1;

public abstract class Human implements Competitor {
    protected String type;
    protected String name;

    protected int maxRunDistance;
    protected int maxSwimDistance;

    protected boolean onDistance;

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    public Human(String type, String name, int maxRunDistance, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " справился с кроссом");
        } else {
            System.out.println(type + " " + name + " сошел с дистанции");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (maxSwimDistance == 0) {
            System.out.println(type + " " + name + " не умеет плавать и сходит с дистанции");
            onDistance = false;
            return;
        }
        if (dist <= maxSwimDistance) {
            System.out.println(type + " " + name + " отлично проплыл");
        } else {
            System.out.println(type + " " + name + " сошел с дистанции");
            onDistance = false;
        }
    }

    @Override
    public void result() {
        System.out.println(type + " " + name + ": " + onDistance);
    }
}

