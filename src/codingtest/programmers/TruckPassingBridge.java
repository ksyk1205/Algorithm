package codingtest.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class TruckPassingBridge {
  public static void main(String[] args) {
    int bridge_length = 2;
    int weight = 10;
    int[] truck_weights = {7,4,5,6};

    System.out.println(solution(bridge_length, weight, truck_weights));

  }

  public static int solution(int bridge_length, int weight, int[] truck_weights) {
    Queue<Integer> queue = new LinkedList<>();
    int currentWeight = 0;
    int time = 0;

    for(int truck : truck_weights) {
      while(true) {
        if(queue.size() == bridge_length) {
          currentWeight -= queue.poll();
        } else  {
          if(currentWeight + truck <= weight) {
            queue.add(truck);
            currentWeight += truck;
            time++;
            break;
          } else {
            queue.add(0);
            time++;
          }
        }
      }
    }

    return time + bridge_length;
  }
}
