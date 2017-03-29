package soundsystem;

import java.util.List;
import java.util.Random;

public class BlankDisc implements CompactDisc {

  private String title;
  private String artist;
  private List<String> tracks;
  private Di di;

  public void setDi(Di di) {
    this.di = di;
  }


  public BlankDisc(String title, String artist, List<String> tracks) {
    this.title = title;
    this.artist = artist;
    this.tracks = tracks;
  }
//随机播放，统计播放次数
  public void play() {
    System.out.println("播放 " + title + " by " + artist);
    Random rand =new Random();
    for (int i =0;i<10000;i++) {
      di.playTrack(tracks.get(rand.nextInt(4)));

    }
  }

}