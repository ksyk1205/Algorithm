package codingtest.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class BestAlbum {
  public static void main(String[] args) {
    String[] genres = {"classic", "pop", "classic", "classic", "pop"};
    int[] plays = {500, 600, 150, 800, 2500};
    int[] result = solution(genres, plays);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }

  public static int[] solution(String[] genres, int[] plays) {
    Map<String, PriorityQueue<Song>> genreSongsMap = new HashMap<>();

    // 장르별로 노래의 정보를 저장
    for (int i = 0; i < genres.length; i++) {
      if (!genreSongsMap.containsKey(genres[i])) {
        genreSongsMap.put(genres[i], new PriorityQueue<>(new SongComparator()));
      }
      genreSongsMap.get(genres[i]).add(new Song(i, plays[i]));
    }

    // 재생 횟수가 많은 장르순으로 정렬
    List<String> genreOrder = new ArrayList<>(genreSongsMap.keySet());
    Collections.sort(genreOrder, (a, b) -> {
      int sumA = genreSongsMap.get(a).stream().mapToInt(Song::getPlayCount).sum();
      int sumB = genreSongsMap.get(b).stream().mapToInt(Song::getPlayCount).sum();
      return Integer.compare(sumB, sumA);
    });

    // 노래 선택
    List<Integer> answerList = new ArrayList<>();
    for (String genre : genreOrder) {
      PriorityQueue<Song> songs = genreSongsMap.get(genre);
      for (int i = 0; i < 2 && !songs.isEmpty(); i++) {
        answerList.add(songs.poll().getIndex());
      }
    }

    // 리스트를 배열로 변환하여 반환
    int[] answer = new int[answerList.size()];
    for (int i = 0; i < answerList.size(); i++) {
      answer[i] = answerList.get(i);
    }
    return answer;
  }
}

class Song {
  private int index;
  private int playCount;

  public Song(int index, int playCount) {
    this.index = index;
    this.playCount = playCount;
  }

  public int getIndex() {
    return index;
  }

  public int getPlayCount() {
    return playCount;
  }
}

class SongComparator implements Comparator<Song> {
  @Override
  public int compare(Song s1, Song s2) {
    if (s1.getPlayCount() == s2.getPlayCount()) {
      return Integer.compare(s1.getIndex(), s2.getIndex());
    }
    return Integer.compare(s2.getPlayCount(), s1.getPlayCount());
  }
}
