package uk.co.drnaylor.hammer.core.configuration

import ninja.leaping.configurate.objectmapping.Setting
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable

@ConfigSerializable
class RedisConfig {

    @Setting(value = "enable", comment = "Whether to enable Redis for network communications")
    var enable: Boolean = false

    @Setting(value = "host", comment = "The host name for Redis")
    var host: String? = "127.0.0.1"

    @Setting(value = "port", comment = "The port for Redis")
    var port: Int = 6379

    @Setting(value = "ssl", comment = "Whether the connection requires SSL")
    var ssl: Boolean = false
}