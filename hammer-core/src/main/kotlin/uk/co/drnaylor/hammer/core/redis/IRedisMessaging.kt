package uk.co.drnaylor.hammer.core.redis

import uk.co.drnaylor.hammer.api.data.BanInfo
import uk.co.drnaylor.hammer.api.data.PlayerInfo

interface IRedisMessaging {

    fun sendBanMessage(playerInfo: PlayerInfo, banInfo: BanInfo)

}