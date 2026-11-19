package cohen.itamar.hotzeti;

import java.time.LocalTime;
import java.time.ZoneId;

public class WelcomeModel
{
    public String getWelcomeModel()
    {
        LocalTime time = LocalTime.now(ZoneId.of("Asia/Jerusalem"));

        if (time.isBefore(LocalTime.of(5, 0)))
        {
            return "לילה טוב";
        }
        else if (time.isBefore(LocalTime.of(12, 0)))
        {
            return "בוקר טוב";
        }
        else if (time.isBefore(LocalTime.of(17, 0)))
        {
            return "צהריים טובים";
        }
        else if (time.isBefore(LocalTime.of(21, 0)))
        {
            return "ערב טוב";
        }
        else
        {
            return "לילה טוב";
        }
    }
}