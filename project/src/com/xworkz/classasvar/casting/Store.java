package com.xworkz.prog.casting;

public class Store {
    public void use(Bucket bucket) {
        bucket.store();
        bucket.carry();
        bucket.fill();
        bucket.empty();
        bucket.clean();

        if(bucket instanceof SteelBucket) {
            SteelBucket steelBucket = (SteelBucket) bucket;
            steelBucket.weight();
        }
    }
}
