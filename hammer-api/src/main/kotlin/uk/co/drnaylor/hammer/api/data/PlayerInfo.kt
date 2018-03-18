package uk.co.drnaylor.hammer.api.data

import java.time.Instant
import java.util.*

class PlayerInfo(val id: UUID, val lastKnownName: String?, val lastKnownIp: String?, val lastSeen: Instant?, val banInfo: List<BanInfo>)