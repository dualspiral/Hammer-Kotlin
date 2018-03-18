package uk.co.drnaylor.hammer.api.init

import uk.co.drnaylor.hammer.api.storage.IStorageEngine

class HammerInit {

    private val storageEngines: MutableList<IStorageEngine<*>> = ArrayList()

    fun registerStorageEngine(engine: IStorageEngine<*>) {
        storageEngines.add(engine)
    }

}