class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int canDrink = 0;
            canDrink += numBottles;
        while(numBottles >= numExchange){
            int canExchange = numBottles/ numExchange;
            canDrink += canExchange;
            int noExchange = numBottles%numExchange;
            numBottles = noExchange + canExchange;

        }
        return canDrink;
    }
}
