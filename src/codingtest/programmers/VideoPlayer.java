package codingtest.programmers;

public class VideoPlayer {

  public static void main(String[] args) {
    System.out.println(solution("34:33", "13:00", "00:55", "02:55", new String[]{"next", "prev"})); // "13:00"
    System.out.println(solution("10:55", "00:05", "00:15", "06:55", new String[]{"prev", "next", "next"})); // "06:55"
    System.out.println(solution("07:22", "04:05", "00:15", "04:07", new String[]{"next"})); // "04:17"
  }


  public static String solution(String video_len, String pos, String op_start, String op_end,
      String[] commands) {
    int videoTime = timeToSeconds(video_len);
    int currentTime = timeToSeconds(pos);
    int openingStart = timeToSeconds(op_start);
    int openingEnd = timeToSeconds(op_end);

    if (openingStart <= currentTime && openingEnd >= currentTime) {
      currentTime = openingEnd;
    }

    for (int i=0; i<commands.length; i++) {
      if (commands[i].equals("prev")) {
        currentTime = Math.max(0, currentTime - 10);
      } else if (commands[i].equals("next")) {
        currentTime = Math.min(videoTime, currentTime + 10);
      }

      if (openingStart <= currentTime && openingEnd >= currentTime) {
        currentTime = openingEnd;
      }
    }

    return secondsToTime(currentTime);
  }

  private static int timeToSeconds(String time) {
    String[] parts = time.split(":");
    return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
  }

  private static String secondsToTime(int seconds) {
    int sec = seconds%60;
    int min = seconds/60;

    return String.format("%02d:%02d", min, sec);
  }
}
