package uk.co.drnaylor.hammer.api.storage

import kotlin.reflect.KClass

interface IStorageEngine<T : Any> {

    /**
     * Used in the config file
     */
    fun id(): String

    /**
     * The [KClass] object that determines the configuration of this storage engine
     */
    fun configurationObject(): KClass<T>

    /**
     * The [IPersistentStorage] that provides the storage of the data
     */
    fun persistentStorage(): IPersistentStorage<T>

}