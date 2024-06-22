package fun.lewisdev.deluxehub.inventory;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class InventoryListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {

        if (event.getInventory().getHolder() instanceof InventoryBuilder) {

            event.setCancelled(true);

            if (event.getWhoClicked() instanceof Player) {

                Player player = (Player) event.getWhoClicked();
                ItemStack itemStack = event.getCurrentItem();

                if (itemStack == null || itemStack.getType() == Material.AIR) return;

                InventoryBuilder customHolder = (InventoryBuilder) event.getInventory().getHolder();
                InventoryItem item = customHolder.getIcon(event.getRawSlot());

                if (item == null) return;

                for (final ClickAction clickAction : item.getClickActions()) {
                    clickAction.execute(player);
                }
            }
        }
    }
}