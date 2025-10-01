class waterBottle {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank=numBottles;
        int empty=numBottles;

        while(empty>=numExchange)
        {
            int newFull=empty/numExchange;
            totalDrank+=newFull;
            empty=empty%numExchange+newFull;
        }
        return totalDrank;
    }
    
}