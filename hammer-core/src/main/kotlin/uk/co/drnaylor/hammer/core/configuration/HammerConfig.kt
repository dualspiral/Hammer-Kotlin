package uk.co.drnaylor.hammer.core.configuration

import ninja.leaping.configurate.commented.CommentedConfigurationNode
import ninja.leaping.configurate.commented.SimpleCommentedConfigurationNode
import ninja.leaping.configurate.objectmapping.Setting
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable
import java.util.*

@ConfigSerializable
class HammerConfig {

    @Setting(value = "server-uuid", comment = "This will get generated on first run. Do not alter.")
    var serverUUID : UUID = UUID.randomUUID()

    @Setting(value = "server-name", comment = "The friendly name for the server. This will be associated with the UUID in the database.")
    var serverFriendlyName: String? = "server"

    @Setting(value = "data-store")
    var dataStore: String? = "file"

    @Setting(value = "storage-engines")
    var storageConfig: CommentedConfigurationNode = SimpleCommentedConfigurationNode.root()

    @Setting(value = "redis-config")
    var redis: RedisConfig = RedisConfig()

}