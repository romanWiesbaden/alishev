package ru.alishev.springcourse;

public class MusicPlayer {
    private Music music;

    // In den Konstruktor wid unsere Dependency übergeben, d.h unsere Musikgenre
    // Inversion of Control
    public MusicPlayer(Music music){
        //мы присваиваем нашему полю music, то что у нас пришло, то что у нас было внедрено в нашу сущность, в наш MusicPalyer
        this.music = music;
    }

    // тут у нас будет использоваться внедренная зависимость и как будто бы мы будем эту один
    // из жанров музыки, который был внедрен, мы будем из него получать песню.
    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }
}
