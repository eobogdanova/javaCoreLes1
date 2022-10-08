package les1;

public class Swimming extends Obstacle {
    private int dist;
    public Swimming(int dist) {
            this.dist = dist;
        }

        @Override
        public void doIt(Competitor competitor) {
            competitor.run(dist);
        }
    }

