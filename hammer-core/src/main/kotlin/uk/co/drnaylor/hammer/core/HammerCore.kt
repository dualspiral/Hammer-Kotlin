package uk.co.drnaylor.hammer.core

import ninja.leaping.configurate.ConfigurationNode

import ninja.leaping.configurate.loader.ConfigurationLoader
import ninja.leaping.configurate.objectmapping.ObjectMapper
import uk.co.drnaylor.hammer.api.init.HammerInit
import uk.co.drnaylor.hammer.core.configuration.HammerConfig
import java.util.*

class HammerCore(
        val configLoader : ConfigurationLoader<out ConfigurationNode>,
        val init: HammerInit) {

    val newInstallation: Boolean
    val configMapper: ObjectMapper<HammerConfig>.BoundInstance
    val configuration: HammerConfig = HammerConfig()
    val serverId: UUID
    var serverName: String

    init {
        val generateduuid = configuration.serverUUID
        this.configMapper = ObjectMapper.forObject(configuration)
        this.configMapper.populate(this.configLoader.load())

        this.serverId = this.configuration.serverUUID
        this.newInstallation = generateduuid.equals(this.configuration.serverUUID)

        this.serverName = this.configuration.serverFriendlyName ?: "New Server - " + this.serverId.toString()
        if (this.configuration.serverFriendlyName == null) {
            this.configuration.serverFriendlyName = this.serverName
        }
    }

    companion object {
        val VERSION : String = "0.6-SNAPSHOT"
    }

    fun registerProviders() {
        // register file and mysql providers here

    }

    fun registerServer() {

    }

    fun changeServerName() {

    }

    private fun saveConfig() {

    }

}