package com.xworkz.prog.Output;

import com.xworkz.prog.casting.instagram.Instagram;
import com.xworkz.prog.casting.instagram.InstagramReels;
import com.xworkz.prog.casting.instagram.SocialMedia;

public class InstagramRunner {
    public static void main(String[] args) {
        Instagram instagram = new Instagram();
        instagram.post();
        instagram.message();
        instagram.follow();
        instagram.story();
        instagram.likes();

        System.out.println("-----------");

        Instagram instagram2 = new InstagramReels();
        instagram2.post();
        instagram2.message();
        instagram2.follow();
        instagram2.story();
        instagram2.likes();

        System.out.println("-----------");

        InstagramReels reels = new InstagramReels();
        reels.post();
        reels.message();
        reels.follow();
        reels.story();
        reels.likes();

        System.out.println("---------casting");
        SocialMedia socialMedia=new SocialMedia();
        socialMedia.timeWaste(instagram);
        socialMedia.timeWaste(instagram2);
        socialMedia.timeWaste(reels);
    }
}
