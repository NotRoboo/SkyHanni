package at.hannibal2.skyhanni.config.features.chat

import com.google.gson.annotations.Expose
import io.github.notenoughupdates.moulconfig.annotations.ConfigEditorBoolean
import io.github.notenoughupdates.moulconfig.annotations.ConfigOption
import io.github.notenoughupdates.moulconfig.annotations.SearchTag

class HuntingFilterConfig {

    @Expose
    @ConfigOption(name = "Charm", desc = "Hides charm messages from killing mobs")
    @SearchTag("salt shard")
    @ConfigEditorBoolean
    var charm: Boolean = false

    @Expose
    @ConfigOption(name = "Redundant Comments", desc = "Hide redundant comments from successfully hunting shards.")
    @SearchTag("panda mochibear invisibug joydive cod")
    @ConfigEditorBoolean
    var redundantComments: Boolean = false

    @Expose
    @ConfigOption(name = "Salt", desc = "Hides salt messages from killing mobs")
    @SearchTag("charm shard")
    var salt: Boolean = false

    @Expose
    @ConfigOption(name = "Swoop Huntaxe", desc = "Hide Swoop's message about monsters only taking damage from axes.")
    @ConfigEditorBoolean
    var swoopAxeMessage: Boolean = false

}
