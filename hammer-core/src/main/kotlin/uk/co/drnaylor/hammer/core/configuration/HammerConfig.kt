package uk.co.drnaylor.hammer.core.configuration

import ninja.leaping.configurate.objectmapping.Setting
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable
import java.util.*
import kotlin.collections.HashMap

@ConfigSerializable
class HammerConfig {

    @Setting(value = "server-uuid", comment = "This will get generated on first run. Do not alter.")
    var serverUUID : UUID? = UUID.randomUUID()

    @Setting(value = "server-name", comment = "The friendly name for the server. This will be associated with the UUID in the database.")
    var serverFriendlyName: String? = "server"

    @Setting(value = "data-store")
    var dataStore: String? = "file"

    @Setting(value = "storage-engines")
    var storageConfig: MutableMap<String, Any> = HashMap()

    @Setting(value = "redis-config")
    var redis: RedisConfig = RedisConfig()

    init {
        storageConfig["mysql"] = MysqlConfig()
    }
}