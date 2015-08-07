package me.bluemonster.elgems.items.Tools;

public enum ToolMaterials
    {
        WATER(2,750,7,2,15),
        EARTH(100, 950, 8, 4, 2);
        private final int harvestLevel;
        private final int maxUses;
        private final float efficiencyOnProperMaterial;
        private final float damageVsEntity;
        private final int enchantability;

        ToolMaterials(int harvestLevel, int maxUses, float efficiencyOnProperMaterial, float damageVsEntity, int enchantability)
        {
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiencyOnProperMaterial = efficiencyOnProperMaterial;
            this.damageVsEntity = damageVsEntity;
            this.enchantability = enchantability;
        }

        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        public int getMaxUses()
        {
            return maxUses;
        }

        public float getEfficiencyOnProperMaterial()
        {
            return efficiencyOnProperMaterial;
        }

        public float getDamageVsEntity()
        {
            return damageVsEntity;
        }

        public int getEnchantability()
        {
            return enchantability;
        }
    }