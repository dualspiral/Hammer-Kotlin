package uk.co.drnaylor.hammer.core.storage.file

import uk.co.drnaylor.hammer.api.storage.IPersistentStorage
import uk.co.drnaylor.hammer.api.storage.IStorageEngine
import kotlin.reflect.KClass

class FileStorageEngine : IStorageEngine<Nothing> {

    override fun id(): String {
        return "file"
    }

    override fun configurationObject(): KClass<Nothing> {
        return Nothing::class
    }

    override fun persistentStorage(): IPersistentStorage<Nothing> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}