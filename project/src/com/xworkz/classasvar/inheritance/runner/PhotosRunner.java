package com.xworkz.prog.inheritance.runner;
import com.xworkz.inheritence.internal.photos.GhibliPhotos;
import com.xworkz.prog.inheritance.internal.photos.Photos;

public class PhotosRunner {
    public static void main(String[] args) {
        Photos Photos = new Photos();
        Photos.animate();
        Photos.story();
        Photos.inspire();
        Photos.fantasy();
        Photos.nature();

        System.out.println("-----------");

        Photos Photos2 = new GhibliPhotos();
        Photos2.animate();
        Photos2.story();
        Photos2.inspire();
        Photos2.fantasy();
        Photos2.nature();

        System.out.println("-----------");

        GhibliPhotos ghibliPhotos = new GhibliPhotos();
        ghibliPhotos.animate();
        ghibliPhotos.story();
        ghibliPhotos.inspire();
        ghibliPhotos.fantasy();
        ghibliPhotos.nature();
    }
}
