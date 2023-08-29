package dev.ashli.kindling.transpiler.codeblocks.normal

import dev.ashli.kindling.serializer.serialize
import dev.ashli.kindling.serializer.serializeArgs
import dev.ashli.kindling.transpiler.values.DFValue

data class SetVar(val type: String, val params: List<DFValue>) : DFBlock("set_var", 2) {
    override fun serialize() = "{" +
            """"id":"block",""" +
            """"block":"set_var",""" +
            """"args":${serializeArgs(params)},""" +
            """"action":${type.serialize()}""" +
            "}"
}