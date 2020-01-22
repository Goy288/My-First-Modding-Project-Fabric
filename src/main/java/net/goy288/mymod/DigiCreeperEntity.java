package net.goy288.mymod;

import net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class DigiCreeperEntity extends CreeperEntity {

    public DigiCreeperEntity(EntityType<? extends CreeperEntity> entityType, World world) {
        super(entityType, world);
        // TODO Auto-generated constructor stub
        
    }

    public static final EntityType<DigiCreeperEntity> DIGI_CREEPER =
    Registry.register(
        Registry.ENTITY_TYPE,
        new Identifier("console", "digicreeper"),
        FabricEntityTypeBuilder.create(EntityCategory.AMBIENT, DigiCreeperEntity::new).size(EntityDimensions.fixed(1, 2)).build()
    );
    
}