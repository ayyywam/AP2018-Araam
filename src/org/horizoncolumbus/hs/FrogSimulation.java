package org.horizoncolumbus.hs;
/**Part A*/
public class FrogSimulation {
    private int goalDistance;

    private int maxHops;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance() {
        return 0;
    }

    public boolean simulate() {
        boolean goalReached = false;

        while (maxHops > 0) {

            int hopDistance = hopDistance();

            int sumOfHopDistance = 0;
            sumOfHopDistance += hopDistance;


            if (sumOfHopDistance < 0) {
                break;
            }
            if (sumOfHopDistance >= goalDistance) {
                goalReached = true;
                break;

            }
            maxHops--;

        }
        return goalReached;
    }
/**Part B*/
    public double runSimulations(int num)
    {
        int count = 0;
        double percentageofTrue = 0.0;

        while (num > 0){
            if (simulate())
                count++;

            num--;
        }

        percentageofTrue = count / num;


        return percentageofTrue;
    }
}