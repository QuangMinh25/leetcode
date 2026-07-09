import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        SolutionKidsWithCandies solutionKidsWithCandies = new SolutionKidsWithCandies();
        int [] candies =  new int[]{2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(solutionKidsWithCandies.kidsWithCandies(candies, extraCandies));
    }


}
class SolutionKidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }
        for (int child : candies) {
            result.add(child + extraCandies >= maxCandies);
        }
        return result;
    }
}
