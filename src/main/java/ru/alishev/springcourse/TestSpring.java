package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
       // aus dem spring context
        // Die Klasse wendet sich an applicationContext, liest es aus und alle Beans, die dort beschrieben sind, fuegt in ApplicationContext ein.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"
        );

        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer =  new MusicPlayer(music);
        musicPlayer.playMusic();
        context.close();


    }
}
