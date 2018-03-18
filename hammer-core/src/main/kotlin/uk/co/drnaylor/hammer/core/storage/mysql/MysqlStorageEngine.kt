package uk.co.drnaylor.hammer.core.storage.mysql

import uk.co.drnaylor.hammer.api.storage.IPersistentStorage
import uk.co.drnaylor.hammer.api.storage.IStorageEngine
import kotlin.reflect.KClass

class MysqlStorageEngine : IStorageEngine<MysqlConfig> {

    override fun configurationObject(): KClass<MysqlConfig> {
        return MysqlConfig::class
    }

    override fun persistentStorage(): IPersistentStorage<MysqlConfig> {
        return MysqlPersistentStorage()
    }

    override fun id(): String {
        return "mysql"
    }

}