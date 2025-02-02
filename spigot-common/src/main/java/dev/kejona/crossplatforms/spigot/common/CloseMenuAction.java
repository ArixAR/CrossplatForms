package dev.kejona.crossplatforms.spigot.common;

import dev.kejona.crossplatforms.action.ActionSerializer;
import dev.kejona.crossplatforms.action.GenericAction;
import dev.kejona.crossplatforms.handler.FormPlayer;
import dev.kejona.crossplatforms.resolver.Resolver;
import org.bukkit.entity.Player;
import org.spongepowered.configurate.objectmapping.ConfigSerializable;

import javax.annotation.Nonnull;

@ConfigSerializable
public class CloseMenuAction implements GenericAction {

    private static final String TYPE = "close";

    @Override
    public void affectPlayer(@Nonnull FormPlayer player, @Nonnull Resolver resolver) {
        Player spigotPlayer = player.getHandle(Player.class);
        spigotPlayer.closeInventory();
    }

    @Override
    public String type() {
        return TYPE;
    }

    public static void register(ActionSerializer serializer) {
        serializer.register(TYPE, CloseMenuAction.class);
    }
}
