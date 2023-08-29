package dev.ashli.kindling.transpiler.codeblocks.normal

import dev.ashli.kindling.serializer.serialize
import dev.ashli.kindling.serializer.serializeArgs
import dev.ashli.kindling.transpiler.*
import dev.ashli.kindling.transpiler.values.DFValue

data class EntityAction(val type: String, val selector: Selector, val params: List<DFValue>) : DFBlock("entity_action", 2) {
    override fun serialize() = "{" +
            """"id":"block",""" +
            """"block":"entity_action",""" +
            """"args":${serializeArgs(params)},""" +
            """"target":"${selector.serialize()}",""" +
            """"action":${type.serialize()}""" +
            "}"
}