package uk.co.drnaylor.hammer.api.data

import java.time.Instant
import java.util.*

class BanInfo(val by: UUID?, val serverId: UUID?, val time: Instant, val until: Instant?, val reason: String)