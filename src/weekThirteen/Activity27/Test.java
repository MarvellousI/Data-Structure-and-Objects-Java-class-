package weekThirteen.Activity27;

public class Test {
    public static void main(String[] args) {
        //Stacks
         RecentCounter recentCounter = new RecentCounter();
         System.out.println(recentCounter.ping(1)); //output is 1
         System.out.println(recentCounter.ping(100));//output is 2
         System.out.println(recentCounter.ping(3001)); //output is 3
         System.out.println(recentCounter.ping(3002)); //output is 3
    }
}
