package com.epam.rd.autotasks;
import static com.epam.rd.autotasks.DecrementingCarouselWithLimitedRun.*;
public class DecrementingWithLimitCarousel extends CarouselRun{

    @Override
    public int next() {
        int beforeDecreasing;
        if (isFinished())
            return -1;
        else {
            beforeDecreasing = array[position];
            array[position]--;
            do {
                position++;
                if (position == array.length) {
                    position = 0;
                }
            } while (!isFinished() && actionLimit > 0 && (array[position] <= 0));
            actionLimit--;
        }
        return beforeDecreasing;
    }
    @Override
    public boolean isFinished() {
        if(actionLimit > 0) {
            for(int el : array)
                if(el > 0)
                    return false;
            return true;
        }
        return true;
    }
}
