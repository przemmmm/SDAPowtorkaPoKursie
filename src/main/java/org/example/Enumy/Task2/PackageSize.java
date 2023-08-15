package org.example.Enumy.Task2;

public enum PackageSize {
    SMALL(40, 90),
    MEDIUM(90, 140),
    LARGE(140, 250),
    UNKNOWN(0, 0);

    private final float minSizeCM;
    private final  float maxSizeCM;

    PackageSize(float minSizeCM, float maxSizeCM) {
        this.minSizeCM = minSizeCM;
        this.maxSizeCM = maxSizeCM;
    }

    public static PackageSize packageSize(float minSizeCM, float maxSizeCM)
    {
        for (PackageSize packageSize : values() ) {
            if(minSizeCM>= packageSize.minSizeCM && maxSizeCM<= packageSize.maxSizeCM)
            {
                return packageSize;
            }
        } return UNKNOWN;
    }
}
