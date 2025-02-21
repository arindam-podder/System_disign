package com.arindam.lld_soliddesignpattern.Design_Pattern.structural.facade;

import com.arindam.lld_soliddesignpattern.Design_Pattern.structural.facade.simplified.HomeTheaterFacade;

public class FacadeClient {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.watchMovie("Lakshya");
        homeTheaterFacade.endMovie();
    }
}


/**
 *
 * Without Facade (Bad Practice)
 * Imagine the client directly controlling Projector, Sound, and Blu-ray Player:
 *
 *
 *      Projector p = new Projector();
 *      SoundSystem s = new SoundSystem();
 *      BluRayPlayer b = new BluRayPlayer();
 *
 *      p.turnOn();
 *      s.setVolume(10);
 *      b.playMovie("Inception");
 */
