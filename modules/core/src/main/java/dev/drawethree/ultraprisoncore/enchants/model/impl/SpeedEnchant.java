package dev.drawethree.ultraprisoncore.enchants.model.impl;

import dev.drawethree.ultraprisoncore.enchants.UltraPrisonEnchants;
import dev.drawethree.ultraprisoncore.enchants.model.UltraPrisonEnchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class SpeedEnchant extends UltraPrisonEnchantment {
	public SpeedEnchant(UltraPrisonEnchants instance) {
		super(instance, 5);
	}

	@Override
	public void onEquip(Player p, ItemStack pickAxe, int level) {
		if (level == 0) {
			this.onUnequip(p, pickAxe, level);
			return;
		}
		p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, level - 1, true, true), true);
	}

	@Override
	public void onUnequip(Player p, ItemStack pickAxe, int level) {
		p.removePotionEffect(PotionEffectType.SPEED);
	}

	@Override
	public void onBlockBreak(BlockBreakEvent e, int enchantLevel) {

	}

	@Override
	public double getChanceToTrigger(int enchantLevel) {
		return 100.0;
	}

	@Override
	public void reload() {
		super.reload();
	}

	@Override
	public String getAuthor() {
		return "Drawethree";
	}
}
