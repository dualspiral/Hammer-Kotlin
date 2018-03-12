package uk.co.drnaylor.hammer.core.configuration

import ninja.leaping.configurate.objectmapping.Setting
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable

@ConfigSerializable
class MysqlConfig {

    @Setting(value = "host")
    var host: String? = "localhost"

    @Setting(value = "port")
    var port: Int = 3306

    @Setting(value = "user")
    var user: String? = "username"

    @Setting(value = "password")
    var passwd: String? = "password"

}