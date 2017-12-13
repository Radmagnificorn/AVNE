package net.radmag.avnprototype

import net.radmag.avnprototype.data.Scene

/**
 * Created by Stephen on 11/22/2017.
 */
interface GameContract {
    interface View {
        fun populateScene(scene: Scene)
    }

    interface Presenter {
        fun loadScene()
    }
}