package com.xworkz.prog.Output;

import com.xworkz.prog.casting.Bucket;
import com.xworkz.prog.casting.SteelBucket;
import com.xworkz.prog.casting.Store;

public class BucketRunner {
    public static void main(String[] args) {
        Bucket bucket1 = new Bucket();
        bucket1.store();
        bucket1.carry();
        bucket1.fill();
        bucket1.empty();
        bucket1.clean();

        System.out.println("-------------------");
        Bucket bucket = new SteelBucket();
        bucket.store();
        bucket.carry();
        bucket.fill();
        bucket.empty();
        bucket.clean();

        System.out.println("-------------------");
        SteelBucket steelBucket = new SteelBucket();
        steelBucket.store();
        steelBucket.carry();
        steelBucket.fill();
        steelBucket.empty();
        steelBucket.clean();

        System.out.println("-------casting example------------");
        Store store = new Store();
        store.use(bucket);
        store.use(bucket1);
        store.use(steelBucket);
    }
}
