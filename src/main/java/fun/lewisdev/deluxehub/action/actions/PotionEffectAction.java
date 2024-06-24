package fun.lewisdev.deluxehub.action.actions;

import com.cryptomorin.xseries.XPotion;
import com.cryptomorin.xseries.reflection.XReflection;
import fun.lewisdev.deluxehub.DeluxeHubPlugin;
import fun.lewisdev.deluxehub.action.Action;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;

public class PotionEffectAction implements Action {
    // Create a single instance of an infinite potion duration, 1.19.4 API added PotionEffect#INFINITE_DURATION
    // Integer#MAX_VALUE no longer displays as asterisks post 1.19.4
    private final int infiniteDuration = XReflection.supports(19, 4) ? PotionEffect.INFINITE_DURATION : Integer.MAX_VALUE;

    @Override
    public String getIdentifier() {
        return "EFFECT";
    }

    @Override
    public void execute(DeluxeHubPlugin plugin, Player player, String data) {
        String[] args = data.split(";");
        player.addPotionEffect(XPotion.matchXPotion(args[0]).get().buildPotionEffect(infiniteDuration, Integer.parseInt(args[1])));
    }
}