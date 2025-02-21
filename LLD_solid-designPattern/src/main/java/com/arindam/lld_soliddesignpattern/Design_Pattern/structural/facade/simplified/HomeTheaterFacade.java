package com.arindam.lld_soliddesignpattern.Design_Pattern.structural.facade.simplified;

import com.arindam.lld_soliddesignpattern.Design_Pattern.structural.facade.complexity.Projector;
import com.arindam.lld_soliddesignpattern.Design_Pattern.structural.facade.complexity.SoundSystem;
import com.arindam.lld_soliddesignpattern.Design_Pattern.structural.facade.complexity.VideoPlayer;

public class HomeTheaterFacade {
    private Projector projector;
    private SoundSystem soundSystem;
    private VideoPlayer videoPlayer;

    public HomeTheaterFacade() {
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.videoPlayer = videoPlayer;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        projector.on();
        soundSystem.setVolume(10);
        videoPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        projector.off();
    }

}
