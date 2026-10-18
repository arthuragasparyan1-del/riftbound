# Riftbound — Minecraft Java 26.3 / Fabric

Riftbound is a new exploration-mod project. This first milestone is intentionally small: it establishes the Fabric project and adds a Riftstone block plus a Rift Crystal item. The dimension, biome generation, creatures, and custom enchantments are planned next milestones rather than being claimed as implemented in this starter.

## Target toolchain

- Minecraft Java 26.3
- Fabric Loader 0.19.5
- Java 25
- Fabric Loom 1.17
- Fabric API 0.162.0+26.3 (configured as the initial version; confirm availability when Gradle resolves dependencies)
- Gradle 9.6 recommended by Fabric's 26.3 announcement

## Build

1. Install a Java 25 JDK and configure IntelliJ IDEA's Gradle JVM to use it.
2. Open this folder as a Gradle project.
3. Allow Gradle to resolve dependencies. If Gradle reports that the configured Fabric API or Loom version cannot be found, check the current Fabric 26.3 versions and update `gradle.properties`.
4. Run the Gradle `build` task.
5. The installable/remapped JAR should be in `build/libs/` and will have the shortest filename (not a `-dev` or `-sources` JAR).

## Planned milestones

1. Confirm the starter compiles and the block/item show in-game.
2. Add a safe, data-driven Rift dimension and custom biome generation.
3. Add Riftling and Shard Stalker mobs; add a Rift Guardian after normal mobs work.
4. Add custom enchantments with defined effects and compatibility rules.
5. Test on a clean 26.3 Fabric instance and inspect logs before calling it release-ready.

The 26.3 release changes parts of world-generation and registry APIs. Dimension, biome, mob, and enchantment code should be added in small increments and tested against the exact 26.3 mappings rather than copied from 1.21 tutorials.
