package utilities;

import java.util.Set;

public class Methods {

    public static String SwitchHandle (String mainPageHandle) {
        Set <String> handleList = Driver.getDriver().getWindowHandles();
        String newHandle = "";
        for (String w: handleList) {
            if (!w.equals(mainPageHandle)) {
                newHandle = w;
            }
        }
        return newHandle;
    }
}
