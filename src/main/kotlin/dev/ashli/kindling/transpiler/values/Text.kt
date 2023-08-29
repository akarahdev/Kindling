package dev.ashli.kindling.transpiler.values

import dev.ashli.kindling.serializer.toInner

data class Text(val text: String) : DFValue {
    override fun serialize() = """{"id":"txt","data":{"name":"${toInner(text)}"}}"""
}