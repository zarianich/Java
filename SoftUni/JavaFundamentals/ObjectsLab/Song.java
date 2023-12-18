package ObjectsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Song {
    private String typeList;
    private String name;
    private String time;

    public String getTypeList(){
        return this.typeList;
    }
    public void setTypeList(String value){
        this.typeList = value;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String value){
        this.name = value;
    }

    public String getTime(){
        return this.time;
    }
    public void setTime(String value){
        this.time = value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfSongs = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < numOfSongs; i++) {
            String[] tokens = scanner.nextLine().split("_");

            String type = tokens[0];
            String name = tokens[1];
            String time = tokens[2];

            Song song = new Song();

            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }

        String typeList = scanner.nextLine();
        if (typeList.equals("all")){
            for (Song song:songs
                 ) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song:songs
                 ) {
                if (song.getTypeList().equals(typeList))
                    System.out.println(song.getName());
            }
        }
    }
}
