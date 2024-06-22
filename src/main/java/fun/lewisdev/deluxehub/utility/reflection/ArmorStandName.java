package fun.lewisdev.deluxehub.utility.reflection;

import com.cryptomorin.xseries.reflection.XReflection;
import org.bukkit.entity.ArmorStand;

public class ArmorStandName {

    public static String getName(ArmorStand stand) {
        if (XReflection.supports(8)) return stand.getCustomName();

        String name = null;
        try {
            name = (String) ArmorStand.class.getMethod("getCustomName").invoke(stand);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return name;
    }

}
