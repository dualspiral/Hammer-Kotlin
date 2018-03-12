package uk.co.drnaylor.hammer.core

import ninja.leaping.configurate.ConfigurationNode
import ninja.leaping.configurate.loader.ConfigurationLoader

class HammerCore constructor(
        val configLoader : ConfigurationLoader<out ConfigurationNode>) {

    companion object {
        val version : String = "0.6-SNAPSHOT"
    }

    fun registerServer() {

    }
}