package at.hannibal2.skyhanni.config.features.chat

import at.hannibal2.skyhanni.config.FeatureToggle
import com.google.gson.annotations.Expose
import io.github.notenoughupdates.moulconfig.annotations.ConfigEditorBoolean
import io.github.notenoughupdates.moulconfig.annotations.ConfigOption

class AnnoyingSpamFilterConfig {

    @Expose
    @ConfigOption(name = "Anniversary Video", desc = "Hides messages about the anniversary video.")
    @ConfigEditorBoolean
    var youtube: Boolean = false

    @Expose
    @ConfigOption(name = "Bait Catches", desc = "Hides annoying bait catch messages.")
    @ConfigEditorBoolean
    var bait: Boolean = false

    @Expose
    @ConfigOption(name = "Blessing Enchant", desc = "Hides annoying blessing enchant messages.")
    @ConfigEditorBoolean
    var blessing: Boolean = false

    @Expose
    @ConfigOption(name = "Blocks In The Way", desc = "Hides messages about blocks in your way when trying to teleport.")
    @ConfigEditorBoolean
    var blockWay: Boolean = false

    @Expose
    @ConfigOption(
        name = "Breaking Power",
        desc = "Hides messages about breaking power when attempting to mine a block with unsuitable pickaxe.",
    )
    @ConfigEditorBoolean
    var breakingPower: Boolean = false

    @Expose
    @ConfigOption(name = "Obtain Cookie", desc = "Hides message about obtaining a cookie from community shop in hub.")
    @ConfigEditorBoolean
    var cookie: Boolean = false

    @Expose
    @ConfigOption(name = "SBE Bin Data", desc = "Hides messages about some features not working on SBE.")
    @ConfigEditorBoolean
    var sbe: Boolean = false

    @Expose
    @ConfigOption(name = "Sacrifice", desc = "Hide other players' sacrifice messages.")
    @ConfigEditorBoolean
    @FeatureToggle
    var sacrifice: Boolean = false
}
