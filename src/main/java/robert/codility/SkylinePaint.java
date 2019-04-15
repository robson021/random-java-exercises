package robert.codility;

import java.util.ArrayList;

/**
 * see resources dir
 */
public class SkylinePaint {

    public static int[] countNeededStrokes(int[] array) {

        var numberOfStripesOnEachLevel = new ArrayList<Integer>();

        int level = 0;

        while (true) {
            ++level;
            boolean isBroken = true;
            int stripesOnCurrentLevel = 0;

            for (int elementHeight : array) {
                if (elementHeight >= level) {
                    if (isBroken) {
                        ++stripesOnCurrentLevel;
                        isBroken = false;
                    }
                } else {
                    isBroken = true;
                }
            }

            if (stripesOnCurrentLevel == 0)
                break;

            System.out.println(stripesOnCurrentLevel + " stripes on level " + level);

            numberOfStripesOnEachLevel.add(stripesOnCurrentLevel);
        }

        return numberOfStripesOnEachLevel.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

}
