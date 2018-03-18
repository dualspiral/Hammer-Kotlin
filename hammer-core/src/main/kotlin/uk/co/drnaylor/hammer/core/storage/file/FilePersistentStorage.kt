package uk.co.drnaylor.hammer.core.storage.file

import uk.co.drnaylor.hammer.api.data.BanInfo
import uk.co.drnaylor.hammer.api.data.PlayerInfo
import uk.co.drnaylor.hammer.api.data.ServerInfo
import uk.co.drnaylor.hammer.api.storage.IPersistentStorage
import java.util.*

class FilePersistentStorage : IPersistentStorage<Nothing> {

    override fun processConfiguration(configuration: Nothing) { } // do nothing

    override fun createStorage() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPlayer(uuid: UUID): PlayerInfo? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun savePlayer(playerInfo: PlayerInfo) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBansForPlayer(uuid: UUID): List<BanInfo> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setBanForPlayer(uuid: UUID, banInfo: BanInfo) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getServerInfo(uuid: UUID): ServerInfo? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAllServerInfo(): List<ServerInfo> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun saveServerInfo(serverInfo: ServerInfo) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}