package weekThirteen.Activity27;
import java.util.LinkedList;
import java.util.Queue;
public class RecentCounter {
    private Queue<Integer> queue = new LinkedList<>();

    public int ping(int t){
        //add queue
        queue.add(t);

        while (queue.peek() < t - 3000){
            queue.poll();
        }
        return queue.size();
    }
}
