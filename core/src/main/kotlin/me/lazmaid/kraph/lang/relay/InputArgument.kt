package me.lazmaid.kraph.lang.relay

import me.lazmaid.kraph.lang.Argument
import me.lazmaid.kraph.lang.PrintFormat

/**
 * Created by VerachadW on 10/2/2016 AD.
 */

internal class InputArgument(private val nameOfArgs: String = "input", args: Map<String, Any>) : Argument(args) {
    override fun print(
        format: PrintFormat,
        previousLevel: Int
    ): String {
        return "($nameOfArgs: { ${print(args, format) } })"
    }
}
