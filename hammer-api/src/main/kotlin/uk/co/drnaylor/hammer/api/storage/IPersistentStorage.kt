package uk.co.drnaylor.hammer.api.storage

import uk.co.drnaylor.hammer.api.data.BanInfo
import uk.co.drnaylor.hammer.api.data.PlayerInfo
import uk.co.drnaylor.hammer.api.data.ServerInfo
import java.util.*

interface IPersistentStorage<in T> {

    fun processConfiguration(configuration: T)

    /**
     * Creates the storage layout. This is called on every startup,
     * so ensure that guards against creating tables that already exist
     * are present
     */
    fun createStorage()

    fun getPlayer(uuid: UUID): PlayerInfo?

    fun savePlayer(playerInfo: PlayerInfo)

    fun getBansForPlayer(uuid: UUID): List<BanInfo>

    fun setBanForPlayer(uuid: UUID, banInfo: BanInfo)

    fun getServerInfo(uuid: UUID): ServerInfo?

    fun getAllServerInfo(): List<ServerInfo>

    fun saveServerInfo(serverInfo: ServerInfo)

}