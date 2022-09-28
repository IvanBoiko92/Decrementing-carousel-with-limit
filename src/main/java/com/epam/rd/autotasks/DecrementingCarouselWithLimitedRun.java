package com.epam.rd.autotasks;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{
    protected final int[] array = DecrementingCarousel.carousel.clone();
    protected int position = 0;
    protected static int actionLimit = 0;
    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {
        super(capacity);
        this.actionLimit = actionLimit;
    }
    @Override
    public CarouselRun run() {

        int i = 1;
        if (!isRun) {
            isRun = true;
            return new DecrementingWithLimitCarousel();
        }
        else if (i == actionLimit){

            return null;
        }
        i++;
        return null;
    }
}



